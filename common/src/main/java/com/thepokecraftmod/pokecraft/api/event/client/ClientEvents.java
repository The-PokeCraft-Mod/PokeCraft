package com.thepokecraftmod.pokecraft.api.event.client;

import com.thepokecraftmod.pokecraft.api.event.Event;
import com.thepokecraftmod.pokecraft.client.render.screen.ScreenLikeInfo;

import java.util.function.Consumer;

/**
 * Client sided events which can be listened to in common to render stuff.
 */
public class ClientEvents {

    /**
     * Listen to if you want to render to the screen while the player is in game. (Like a HUD)
     */
    public static final Event<Consumer<ScreenLikeInfo>> RENDER_OVERLAY = new Event<Consumer<ScreenLikeInfo>>(Event::consumerCallback, Consumer[]::new);

    /**
     * Called when a key is pressed.
     */
    public static final Event<Consumer<Integer>> KEY_PRESSED = new Event<Consumer<Integer>>(Event::consumerCallback, Consumer[]::new);
}
