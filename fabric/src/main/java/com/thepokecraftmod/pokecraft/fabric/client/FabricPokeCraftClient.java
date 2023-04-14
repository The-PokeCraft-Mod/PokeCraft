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

package com.thepokecraftmod.pokecraft.fabric.client;

import com.thepokecraftmod.pokecraft.client.PokeCraftClient;
import com.thepokecraftmod.pokecraft.client.input.KeyBind;
import com.thepokecraftmod.pokecraft.fabric.network.FabricPokeCraftNetworking;
import com.thepokecraftmod.pokecraft.network.PokeCraftNetworking;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class FabricPokeCraftClient extends PokeCraftClient implements ClientModInitializer {

    public FabricPokeCraftClient() {
        ClientPlayNetworking.registerGlobalReceiver(PokeCraftNetworking.ID, (client, handler, buf, responseSender) -> ((FabricPokeCraftNetworking) FabricPokeCraftNetworking.getInstance()).handleClient(client, buf));
        PokeCraftClient.onInitialize(this);
        registerKeyBindings();
    }

    @Override
    public void onInitializeClient() {
        initializeEntityRenderers(EntityRendererRegistry::register);
    }

    @Override
    public void registerKey(KeyBind keyBind) {
        keyBinds.add(keyBind);
        KeyBindingHelper.registerKeyBinding(keyBind);
    }
}
