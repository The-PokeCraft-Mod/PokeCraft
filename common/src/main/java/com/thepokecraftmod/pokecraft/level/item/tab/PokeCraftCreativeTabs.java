package com.thepokecraftmod.pokecraft.level.item.tab;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.level.item.PokeCraftItems;

public class PokeCraftCreativeTabs {
    public static final CreativeTab POKEBALLS = PokeCraft.getInstance().newCreativeTab("pokeballs", () -> PokeCraftItems.POKE_BALL);
    public static final CreativeTab BERRIES = PokeCraft.getInstance().newCreativeTab("berries", () -> PokeCraftItems.RAZZ_BERRY);
    public static final CreativeTab RESTORATION = PokeCraft.getInstance().newCreativeTab("restoration", () -> PokeCraftItems.POTION);
    public static final CreativeTab BATTLE_AND_STATS = PokeCraft.getInstance().newCreativeTab("battle_and_stats", () -> PokeCraftItems.X_ATTACK);
    public static final CreativeTab HELD_ITEMS = PokeCraft.getInstance().newCreativeTab("held_items", () -> PokeCraftItems.EXP_SHARE);
    public static final CreativeTab EVOLUTION = PokeCraft.getInstance().newCreativeTab("evolution", () -> PokeCraftItems.WATER_STONE);
    public static final CreativeTab GIMMICK = PokeCraft.getInstance().newCreativeTab("gimmick", () -> PokeCraftItems.VENUSAURITE);
    public static final CreativeTab NATURAL = PokeCraft.getInstance().newCreativeTab("natural", () -> PokeCraftItems.RED_APRICORN);
    public static final CreativeTab SPECIAL = PokeCraft.getInstance().newCreativeTab("special", () -> PokeCraftItems.BLUE_ORB);
    public static final CreativeTab PLAYER_ITEMS = PokeCraft.getInstance().newCreativeTab("player_items", () -> PokeCraftItems.MAX_REPEL);
    public static final CreativeTab BLOCKS = PokeCraft.getInstance().newCreativeTab("blocks", () -> PokeCraftItems.POKE_BALL);
}
