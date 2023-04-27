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
import com.thepokecraftmod.pokecraft.level.block.PokeCraftBlocks;
import com.thepokecraftmod.pokecraft.level.item.PokeCraftItems;

public class PokeCraftCreativeTabs {
    public static final CreativeTab POKEBALLS = PokeCraft.getInstance().newCreativeTab("pokeballs", () -> PokeCraftItems.POKE_BALL);
    public static final CreativeTab BERRIES = PokeCraft.getInstance().newCreativeTab("berries", () -> PokeCraftItems.RAZZ_BERRY);
    public static final CreativeTab RESTORATION_ITEMS = PokeCraft.getInstance().newCreativeTab("restoration_items", () -> PokeCraftItems.POTION);
    public static final CreativeTab BATTLE_AND_STAT_ITEMS = PokeCraft.getInstance().newCreativeTab("battle_and_stat_items", () -> PokeCraftItems.X_ATTACK);
    public static final CreativeTab HELD_ITEMS = PokeCraft.getInstance().newCreativeTab("held_items", () -> PokeCraftItems.EXP_SHARE);
    public static final CreativeTab EVOLUTION_ITEMS = PokeCraft.getInstance().newCreativeTab("evolution_items", () -> PokeCraftItems.WATER_STONE);
    public static final CreativeTab GIMMICK_ITEMS = PokeCraft.getInstance().newCreativeTab("gimmick_items", () -> PokeCraftItems.VENUSAURITE);
    public static final CreativeTab NATURAL_ITEMS = PokeCraft.getInstance().newCreativeTab("natural_items", () -> PokeCraftItems.RED_APRICORN);
    public static final CreativeTab SPECIAL_ITEMS = PokeCraft.getInstance().newCreativeTab("special_items", () -> PokeCraftItems.BLUE_ORB);
    public static final CreativeTab KEY_ITEMS = PokeCraft.getInstance().newCreativeTab("key_items", () -> PokeCraftItems.SHINY_CHARM);
    public static final CreativeTab BLOCKS = PokeCraft.getInstance().newCreativeTab("blocks", () -> PokeCraftItems.POKE_BALL);
    public static final CreativeTab TOOLS_AND_UTILITIES = PokeCraft.getInstance().newCreativeTab("tools_utilities", () -> PokeCraftItems.RUBY_PICKAXE);
    public static final CreativeTab COMBAT = PokeCraft.getInstance().newCreativeTab("combat", () -> PokeCraftItems.EMERALD_SWORD);
    public static final CreativeTab INGREDIENTS = PokeCraft.getInstance().newCreativeTab("ingredients", () -> PokeCraftItems.SAPPHIRE);
    public static final CreativeTab BUILDING_BLOCKS = PokeCraft.getInstance().newCreativeTab("building_blocks", () -> PokeCraftItems.FIRE_STONE);
    public static final CreativeTab COLORED_BLOCKS = PokeCraft.getInstance().newCreativeTab("colored_blocks", () -> PokeCraftItems.WATER_STONE);
    public static final CreativeTab NATURAL_BLOCKS = PokeCraft.getInstance().newCreativeTab("natural_blocks", () -> PokeCraftItems.THUNDER_STONE);
    public static final CreativeTab UTILITY_BLOCKS = PokeCraft.getInstance().newCreativeTab("utility_blocks", () -> PokeCraftItems.LEAF_STONE);
    public static final CreativeTab DECORATION_BLOCKS = PokeCraft.getInstance().newCreativeTab("decoration_blocks", () -> PokeCraftItems.SUN_STONE);
}
