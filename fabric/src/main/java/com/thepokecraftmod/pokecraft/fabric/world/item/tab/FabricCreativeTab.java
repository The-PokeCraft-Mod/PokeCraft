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

package com.thepokecraftmod.pokecraft.fabric.world.item.tab;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.level.item.tab.CreativeTab;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class FabricCreativeTab extends CreativeTab {

    public FabricCreativeTab(String name, Supplier<Item> icon) {
        super(name, icon);
        var tab = FabricItemGroup.builder(PokeCraft.id(name))
                .icon(() -> new ItemStack(icon.get()))
                .title(Component.translatable(PokeCraft.MOD_ID + ".item_group." + name))
                .build();

        ItemGroupEvents.modifyEntriesEvent(tab).register(content -> content.acceptAll(items.stream()
                .map(itemSupplier -> new ItemStack(itemSupplier.get()))
                .toList()
        ));
    }
}
