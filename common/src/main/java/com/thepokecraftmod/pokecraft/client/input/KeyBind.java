package com.thepokecraftmod.pokecraft.client.input;

import com.thepokecraftmod.pokecraft.client.PokeCraftClient;
import net.minecraft.client.KeyMapping;

/**
 * A Keybinding. Used to do actions after keyboard input is pressed
 */
public final class KeyBind extends KeyMapping {

    public final int keycode;
    public final String name;
    public final Runnable action;

    public KeyBind(int keycode, String name, String category, Runnable action) {
        super(name, keycode, category);
        this.keycode = keycode;
        this.name = name;
        this.action = action;
        PokeCraftClient.getInstance().registerKey(this);
    }
}
