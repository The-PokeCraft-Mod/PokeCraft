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

package com.thepokecraftmod.pokecraft.level.item.tab;

import com.thepokecraftmod.pokecraft.PokeCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreativeTab {

    public final List<Supplier<Item>> items = new ArrayList<>();
    public final ResourceLocation name;
    public final Supplier<Item> icon;

    public CreativeTab(String name, Supplier<Item> icon) {
        this.name = PokeCraft.id(name);
        this.icon = icon;
    }

    public void addItem(Supplier<Item> item) {
        items.add(item);
    }
}
