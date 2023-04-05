/*
 * Copyright (C) 2023 ThePokeCraftMod
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.thepokecraftmod.pokecraft.client;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.event.client.ClientEvents;
import com.thepokecraftmod.pokecraft.api.pokemon.PokemonParty;
import com.thepokecraftmod.pokecraft.client.input.KeyBind;
import com.thepokecraftmod.pokecraft.client.render.PokemonRenderer;
import com.thepokecraftmod.pokecraft.client.render.RenderProvider;
import com.thepokecraftmod.pokecraft.client.theme.ThemeManager;
import com.thepokecraftmod.pokecraft.client.themes.DefaultTheme;
import com.thepokecraftmod.pokecraft.level.entity.PokeCraftEntities;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class PokeCraftClient {
    private static PokeCraftClient INSTANCE;
    public final List<Screen> hidePartyScreens = new ArrayList<>();
    protected final List<KeyBind> keyBinds = new ArrayList<>();
    public RenderProvider renderProvider;
    public PokemonParty party;

    private void onInitialize() {
        ThemeManager.registerTheme(PokeCraft.id("default"), new DefaultTheme());

        ClientEvents.KEY_PRESSED.listen(key -> {
            for (var keyBind : keyBinds) {
                if (keyBind.keycode == key && Minecraft.getInstance().screen == null)
                    keyBind.action.run();
            }
        });

        ClientEvents.RENDER_OVERLAY.listen(info -> {
            var client = Minecraft.getInstance();
            if (!hidePartyScreens.contains(client.screen)) ThemeManager.getActiveTheme().getPartyTheme().accept(info);
        });
    }

    protected void registerKeyBindings() {
        new KeyBind(GLFW.GLFW_KEY_R, "key.unimon.throw_party_member", "key.categories.party", () -> System.out.println("greg"));
    }

    protected  <T extends Entity> void initializeEntityRenderers(BiConsumer<EntityType<T>, EntityRendererProvider<T>> consumer) {
        consumer.accept((EntityType<T>) PokeCraftEntities.POKEMON, context -> (EntityRenderer<T>) new PokemonRenderer(context));
    }

    public void registerKey(KeyBind keyBind) {
        throw new RuntimeException("Platform has not implemented registerKey");
    }

    public static void populateDebugData(ArrayList<String> systemInfo) {
        systemInfo.add(ChatFormatting.GREEN + "UniMon Debug Info");
        systemInfo.add("Mons in party: " + getInstance().party.getParty().size());
    }

    public static PokeCraftClient getInstance() {
        if (INSTANCE == null)
            throw new RuntimeException("Platform has not defined PokeCraftClient instance. Maybe you are too early?");

        return INSTANCE;
    }

    public static void onInitialize(PokeCraftClient platformImpl) {
        if (INSTANCE != null) throw new RuntimeException("Another mod platform has already been defined");
        INSTANCE = platformImpl;
        INSTANCE.onInitialize();
    }
}
