package com.thepokecraftmod.mimikyu.action;

import com.thepokecraftmod.mimikyu.action.actions.BattleAction;
import com.thepokecraftmod.mimikyu.participant.Participant;

import java.io.Closeable;
import java.util.*;

public class Turn implements Closeable, Iterable<BattleAction> {
    private List<BattleAction> actions = new ArrayList<>();

    public void push(BattleAction action) {
        if (action.sortingPosition == SortPosition.MOVES && !(action instanceof MoveAction))
            throw new RuntimeException("Any action sorted into the MOVES category must be or extend " + MoveAction.class.getSimpleName());
        this.actions.add(action);
    }

    public void pushAll(List<BattleAction> actions) {
        for (var action : actions) push(action);
    }

    public List<BattleAction> getActionsFrom(Participant<?> participant) {
        return actions.stream()
                .filter(action -> action.sender == participant)
                .toList();
    }

    public void sort() {
        var absoluteFirst = SortPosition.getAllFrom(this.actions, SortPosition.ABSOLUTE_FIRST);
        var specialMechanics = SortPosition.getAllFrom(this.actions, SortPosition.SPECIAL_MECHANICS);
        var preMoves = SortPosition.getAllFrom(this.actions, SortPosition.BEFORE_MOVES);
        var moves = SortPosition.getAllFrom(this.actions, SortPosition.MOVES);
        var postMoves = SortPosition.getAllFrom(this.actions, SortPosition.AFTER_MOVES);

        this.actions.clear();
        this.actions.addAll(absoluteFirst);
        this.actions.addAll(specialMechanics);
        this.actions.addAll(preMoves);
        this.actions.addAll(sortMoves(moves));
        this.actions.addAll(postMoves);
    }

    /**
     * Method written specifically to handle the move stage of priority's as it's the most complicated
     */
    private Collection<BattleAction> sortMoves(List<BattleAction> moves) {
        var allMoves = new ArrayList<>(moves.stream().filter(q -> !(q instanceof MoveAction)).toList());
        var realMoves = moves.stream().filter(q -> q instanceof MoveAction).map(battleAction -> (MoveAction) battleAction).toList();
        var movePriorityTiers = new HashMap<Integer, List<BattleAction>>();

        // First sort by tier
        for (var realMove : realMoves) {
            var moveData = realMove.moveInstance.data;
            var tierList = movePriorityTiers.computeIfAbsent(moveData.priority(), ArrayList::new);
            tierList.add(realMove);
        }

        // Now sort by speed
        for (var tier : movePriorityTiers.keySet()) {
            var battleActions = movePriorityTiers.get(tier);
            battleActions.sort(Comparator.comparingInt(o -> o.sender.getParty().fieldPokemon.getSpeed()));
            allMoves.addAll(battleActions);
        }

        return allMoves;
    }

    @Override
    public void close() {
        this.actions = Collections.unmodifiableList(this.actions);
    }

    @Override
    public Iterator<BattleAction> iterator() {
        return actions.iterator();
    }
}
