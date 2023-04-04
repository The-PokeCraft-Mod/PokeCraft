package com.thepokecraftmod.mimikyu;

import com.thepokecraftmod.mimikyu.ability.Ability;
import com.thepokecraftmod.mimikyu.action.ExecutionPoint;
import com.thepokecraftmod.mimikyu.action.RunActionResult;
import com.thepokecraftmod.mimikyu.action.Turn;
import com.thepokecraftmod.mimikyu.action.actions.BattleAction;
import com.thepokecraftmod.mimikyu.field.FieldProperties;
import com.thepokecraftmod.mimikyu.participant.NamedTeam;
import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.util.BattleValidator;
import com.thepokecraftmod.pokecraft.PokeCraft;

import java.util.*;

/**
 * Represents a Pokemon battle. This class stores all relevant data to a battle and is used to run the core loop of a battle.
 */
public class Battle<T extends BattleImplementer> {
    public final BattleValidator validator;
    public final T controller;
    public final FieldProperties fieldProperties;
    public final List<NamedTeam> teams;
    public final List<Turn> turns;
    public final Random random;
    private int currentTurn = -1;

    public Battle(BattleValidator validator, T controller, FieldProperties fieldProperties, List<NamedTeam> teams) {
        BattleAssertions.assertTrue(teams.size() == 2);
        this.validator = validator;
        this.controller = controller;
        this.fieldProperties = fieldProperties;
        this.teams = teams;
        this.turns = new ArrayList<>();
        this.random = new Random(System.currentTimeMillis() + PokeCraft.RANDOM.nextInt());

        for (var team : teams) BattleAssertions.assertTrue(team.participants().size() <= 2);
    }

    public void start() {
        BattleAssertions.assertTrue(!battleStarted());
        for (var participant : getParticipants())
            for (var partyMember : participant.getParty().party)
                partyMember.resetForBattle();

        startTurn(Collections.emptyList());
        runTurn();
    }

    public void runTurn() {
        try {
            var thisTurn = getCurrentTurn();
            var actionExecutionResults = new ArrayList<RunActionResult>();
            thisTurn.sort();
            validator.validateTurn(this, thisTurn);
            for (var participant : getParticipants())
                for (var partyMember : participant.getParty().party)
                    partyMember.getTurnValueMap().clear();

            for (var action : thisTurn) runAction(action, actionExecutionResults, ExecutionPoint.MAIN);

            var endOfTurnActions = actionExecutionResults.stream()
                    .map(runActionResult -> runActionResult.actionsAtEndOfCurrentTurn)
                    .flatMap(Collection::stream)
                    .toList();

            for (var endOfTurnAction : endOfTurnActions)
                runAction(endOfTurnAction, new ArrayList<>(), ExecutionPoint.TURN_END);

            thisTurn.close();
            startTurn(actionExecutionResults.stream()
                    .map(runActionResult -> runActionResult.actionsForNextTurnStart)
                    .flatMap(Collection::stream)
                    .toList()
            );
            controller.onTurnFinish();
        } catch (Exception e) {
            controller.exceptionThrown("runTurn", e);
        }
    }

    private void runAction(BattleAction action, List<RunActionResult> actionExecutionResults, ExecutionPoint point) {
        var result = controller.runAction(action, point);
        actionExecutionResults.add(result);

        if (Objects.requireNonNull(point) == ExecutionPoint.TURN_END) {
            for (var endOfTurnAction : result.actionsAtEndOfCurrentTurn)
                runAction(endOfTurnAction, actionExecutionResults, point);
        }

        for (var actionsAfterward : result.actionsAfterwards) runAction(actionsAfterward, actionExecutionResults, point);
    }

    private void startTurn(List<BattleAction> startingActions) {
        try {
            turns.add(new Turn());
            currentTurn++;
            controller.newTurn(this.currentTurn);
            var currentTurn = getCurrentTurn();
            if (isFirstTurn()) controller.doFirstTurnActions(this, currentTurn);

            for (var ability : getActiveAbilities()) {
                if (ability.takesEffectThisTurn(this, currentTurn)) {
                    ability.effectTurn(this, currentTurn);
                }
            }

            currentTurn.pushAll(startingActions);
        } catch (Exception e) {
            controller.exceptionThrown("startTurn", e);
        }
    }

    public Turn getCurrentTurn() {
        try {
            BattleAssertions.assertTrue(currentTurn < turns.size());
            return turns.get(currentTurn);
        } catch (Exception e) {
            controller.exceptionThrown("getCurrentTurn", e);
            return null;
        }
    }

    public boolean isFirstTurn() {
        return currentTurn == 0;
    }

    public boolean battleStarted() {
        return currentTurn != -1;
    }

    public List<Ability> getActiveAbilities() {
        try {
            return getParticipants()
                    .stream()
                    .map(participant -> participant.getParty().fieldPokemon.getAbilities())
                    .flatMap(Collection::stream)
                    .filter(Objects::nonNull)
                    .toList();
        } catch (Exception e) {
            controller.exceptionThrown("getActiveAbilities", e);
            return null;
        }
    }

    public List<Participant<?>> getParticipants() {
        try {
            var allParticipants = new ArrayList<Participant<?>>();
            for (var team : teams) allParticipants.addAll(team.participants());

            return allParticipants;
        } catch (Exception e) {
            controller.exceptionThrown("getParticipants", e);
            return null;
        }
    }
}
