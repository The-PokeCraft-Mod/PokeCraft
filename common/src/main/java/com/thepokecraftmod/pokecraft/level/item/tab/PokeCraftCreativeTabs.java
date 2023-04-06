package com.thepokecraftmod.pokecraft.level.item.tab;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.level.item.PokeCraftItems;

public class PokeCraftCreativeTabs {
    public static final CreativeTab POKEBALLS = PokeCraft.getInstance().newCreativeTab("pokeballs", () -> PokeCraftItems.MASTER_BALL);
    public static final CreativeTab BERRIES = PokeCraft.getInstance().newCreativeTab("berries", () -> PokeCraftItems.RAZZ_BERRY);
    public static final CreativeTab RESTORATION = PokeCraft.getInstance().newCreativeTab("restoration", () -> PokeCraftItems.MAX_REVIVE);
    public static final CreativeTab BATTLE_AND_STATS = PokeCraft.getInstance().newCreativeTab("battle_and_stats", () -> PokeCraftItems.RARE_CANDY);
    public static final CreativeTab HELD_ITEMS = PokeCraft.getInstance().newCreativeTab("held_items", () -> PokeCraftItems.EXP_SHARE);
    public static final CreativeTab EVOLUTION_ITEMS = PokeCraft.getInstance().newCreativeTab("evolution_items", () -> PokeCraftItems.WATER_STONE);
    public static final CreativeTab MEGA_STONES = PokeCraft.getInstance().newCreativeTab("mega_stones", () -> PokeCraftItems.ALTARIANITE);
    public static final CreativeTab Z_CRYSTALS = PokeCraft.getInstance().newCreativeTab("z_crystals", () -> PokeCraftItems.GRASSIUM_Z);
    public static final CreativeTab NATURAL = PokeCraft.getInstance().newCreativeTab("natural", () -> PokeCraftItems.RED_APRICORN);
    public static final CreativeTab SPECIAL = PokeCraft.getInstance().newCreativeTab("special", () -> PokeCraftItems.BLUE_ORB);
    public static final CreativeTab PLAYER_ITEMS = PokeCraft.getInstance().newCreativeTab("player_items", () -> PokeCraftItems.MAX_REPEL);
    public static final CreativeTab KEY_ITEMS = PokeCraft.getInstance().newCreativeTab("key_items", () -> PokeCraftItems.SHINY_CHARM);
}
