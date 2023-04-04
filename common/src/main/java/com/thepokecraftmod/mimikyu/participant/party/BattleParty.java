package com.thepokecraftmod.mimikyu.participant.party;

import com.thepokecraftmod.mimikyu.BattleAssertions;
import com.thepokecraftmod.mimikyu.util.FullNetworkable;
import net.minecraft.network.FriendlyByteBuf;

import java.util.Collections;
import java.util.List;

/**
 * The Party of pokemon that can be picked from to go on the field.
 */
public class BattleParty implements FullNetworkable {

    public final List<PokemonBattleData> party;
    public PokemonBattleData fieldPokemon;

    /**
     * @param firstPokemon the first Pokemon to be sent onto the field
     * @param availablePokemon the Pokemon that are also in the party and can be used in the battle. This cannot be modified during a battle.
     */
    public BattleParty(PokemonBattleData firstPokemon, List<PokemonBattleData> availablePokemon) {
        this.fieldPokemon = firstPokemon;
        this.party = Collections.unmodifiableList(availablePokemon);
        BattleAssertions.assertTrue(party.contains(fieldPokemon));
    }

    @Override
    public void writeAsFullObject(FriendlyByteBuf buffer) {
        var partyOffset = party.indexOf(fieldPokemon);
        buffer.writeInt(partyOffset);

        for (var pokemonBattleData : party) {
            pokemonBattleData.writeAsFullObject(buffer);
        }
    }
}
