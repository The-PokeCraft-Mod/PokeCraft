package com.thepokecraftmod.pokecraft.api.event;

import com.thepokecraftmod.pokecraft.api.event.ctx.MovePokemonContext;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Consumer;

/**
 * Events related to PokemonParties and Box Storage
 */
public class DataEvents {
    /**
     * Called when a {@link ServerPlayer} needs their data synced. This can be manually requested by the player, or gets done for all players on reloads
     */
    public static final Event<Consumer<ServerPlayer>> SYNC_PLAYER = new Event<Consumer<ServerPlayer>>(Event::consumerCallback, Consumer[]::new);

    /**
     * Called when a {@link com.thepokecraftmod.pokecraft.api.mon.PokemonInstance} is going to be added to a {@link com.thepokecraftmod.pokecraft.api.mon.PokemonParty}. The result can be configured through the event's context
     */
    public static final Event<Consumer<MovePokemonContext>> MOVE_MON_TO_PARTY = new Event<Consumer<MovePokemonContext>>(Event::consumerCallback, Consumer[]::new);
}
