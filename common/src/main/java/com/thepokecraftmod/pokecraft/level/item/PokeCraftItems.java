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

package com.thepokecraftmod.pokecraft.level.item;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import com.thepokecraftmod.pokecraft.level.item.tab.CreativeTab;
import com.thepokecraftmod.pokecraft.level.item.tab.PokeCraftCreativeTabs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class PokeCraftItems {
    public static final MojangRegistry<Item, Registry<Item>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.ITEM);

    // Available Properties
    private static final Item.Properties GENERIC_PROPERTIES = new Item.Properties();
    private static final Item.Properties SIXTEEN_PROPERTIES = new Item.Properties().stacksTo(16);
    private static final Item.Properties SINGLE_PROPERTIES = new Item.Properties().stacksTo(1);

    // Minecraft
    public static final Item EMERALD_BOOTS = register("emerald_boots", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item EMERALD_LEGGINGS = register("emerald_leggings", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item EMERALD_CHESTPLATE = register("emerald_chestplate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item EMERALD_HELMET = register("emerald_helmet", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item EMERALD_SWORD = register("emerald_sword", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item EMERALD_PICKAXE = register("emerald_pickaxe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item EMERALD_AXE = register("emerald_axe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item EMERALD_SHOVEL = register("emerald_shovel", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item EMERALD_HOE = register("emerald_hoe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item RUBY_BOOTS = register("ruby_boots", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item RUBY_LEGGINGS = register("ruby_leggings", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item RUBY_CHESTPLATE = register("ruby_chestplate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item RUBY_HELMET = register("ruby_helmet", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item RUBY_SWORD = register("ruby_sword", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item RUBY_PICKAXE = register("ruby_pickaxe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item RUBY_AXE = register("ruby_axe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item RUBY_SHOVEL = register("ruby_shovel", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item RUBY_HOE = register("ruby_hoe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SAPPHIRE_BOOTS = register("sapphire_boots", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SAPPHIRE_LEGGINGS = register("sapphire_leggings", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SAPPHIRE_CHESTPLATE = register("sapphire_chestplate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SAPPHIRE_HELMET = register("sapphire_helmet", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SAPPHIRE_SWORD = register("sapphire_sword", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SAPPHIRE_PICKAXE = register("sapphire_pickaxe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SAPPHIRE_AXE = register("sapphire_axe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SAPPHIRE_SHOVEL = register("sapphire_shovel", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SAPPHIRE_HOE = register("sapphire_hoe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item DEEPSLATE_SWORD = register("deepslate_sword", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item DEEPSLATE_PICKAXE = register("deepslate_pickaxe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item DEEPSLATE_AXE = register("deepslate_axe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item DEEPSLATE_SHOVEL = register("deepslate_shovel", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item DEEPSLATE_HOE = register("deepslate_hoe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item BLACKSTONE_SWORD = register("blackstone_sword", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item BLACKSTONE_PICKAXE = register("blackstone_pickaxe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item BLACKSTONE_AXE = register("blackstone_axe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item BLACKSTONE_SHOVEL = register("blackstone_shovel", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item BLACKSTONE_HOE = register("blackstone_hoe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);

    // PokeBalls
    public static final Item POKE_BALL = register("poke_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item GREAT_BALL = register("great_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item ULTRA_BALL = register("ultra_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item MASTER_BALL = register("master_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SAFARI_BALL = register("safari_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item FAST_BALL = register("fast_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item LEVEL_BALL = register("level_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item LURE_BALL = register("lure_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item HEAVY_BALL = register("heavy_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item LOVE_BALL = register("love_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item FRIEND_BALL = register("friend_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item MOON_BALL = register("moon_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item SPORT_BALL = register("sport_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item NET_BALL = register("net_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item DIVE_BALL = register("dive_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item NEST_BALL = register("nest_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item REPEAT_BALL = register("repeat_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item TIMER_BALL = register("timer_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item LUXURY_BALL = register("luxury_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item PREMIER_BALL = register("premier_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item DUSK_BALL = register("dusk_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item HEAL_BALL = register("heal_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item QUICK_BALL = register("quick_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item CHERISH_BALL = register("cherish_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item PARK_BALL = register("park_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item DREAM_BALL = register("dream_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item BEAST_BALL = register("beast_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item STRANGE_BALL = register("strange_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item ANCIENT_POKE_BALL = register("ancient_poke_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item ANCIENT_GREAT_BALL = register("ancient_great_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item ANCIENT_ULTRA_BALL = register("ancient_ultra_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item WING_BALL = register("wing_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item LEADEN_BALL = register("leaden_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);
    public static final Item ORIGIN_BALL = register("origin_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.POKEBALLS);

    // Berries
    public static final Item AGUAV_BERRY = register("aguav_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item APICOT_BERRY = register("apicot_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item ASPEAR_BERRY = register("aspear_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item BABIRI_BERRY = register("babiri_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item BELUE_BERRY = register("belue_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item BLUK_BERRY = register("bluk_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item CHARTI_BERRY = register("charti_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item CHERI_BERRY = register("cheri_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item CHESTO_BERRY = register("chesto_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item CHILAN_BERRY = register("chilan_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item CHOPLE_BERRY = register("chople_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item COBA_BERRY = register("coba_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item COLBUR_BERRY = register("colbur_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item CORNN_BERRY = register("cornn_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item CUSTAP_BERRY = register("custap_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item DURIN_BERRY = register("durin_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item ENIGMA_BERRY = register("enigma_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item FIGY_BERRY = register("figy_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item GANLON_BERRY = register("ganlon_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item GREPA_BERRY = register("grepa_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item HABAN_BERRY = register("haban_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item HONDEW_BERRY = register("hondew_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item IAPAPA_BERRY = register("iapapa_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item JABOCA_BERRY = register("jaboca_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item KASIB_BERRY = register("kasib_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item KEBIA_BERRY = register("kebia_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item KEE_BERRY = register("kee_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item KELPSY_BERRY = register("kelpsy_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item LANSAT_BERRY = register("lansat_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item LEPPA_BERRY = register("leppa_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item LIECHI_BERRY = register("liechi_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item LUM_BERRY = register("lum_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item MAGO_BERRY = register("mago_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item MAGOST_BERRY = register("magost_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item MARANGA_BERRY = register("maranga_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item MICLE_BERRY = register("micle_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item NANAB_BERRY = register("nanab_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item NOMEL_BERRY = register("nomel_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item OCCA_BERRY = register("occa_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item ORAN_BERRY = register("oran_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item PAMTRE_BERRY = register("pamtre_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item PASSHO_BERRY = register("passho_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item PAYAPA_BERRY = register("payapa_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item PECHA_BERRY = register("pecha_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item PERSIM_BERRY = register("persim_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item PETAYA_BERRY = register("petaya_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item PINAP_BERRY = register("pinap_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item POMEG_BERRY = register("pomeg_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item QUALOT_BERRY = register("qualot_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item RABUTA_BERRY = register("rabuta_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item RAWST_BERRY = register("rawst_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item RAZZ_BERRY = register("razz_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item RINDO_BERRY = register("rindo_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item ROSELI_BERRY = register("roseli_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item ROWAP_BERRY = register("rowap_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item SALAC_BERRY = register("salac_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item SHUCA_BERRY = register("shuca_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item SITRUS_BERRY = register("sitrus_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item SPELON_BERRY = register("spelon_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item STARF_BERRY = register("starf_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item TAMATO_BERRY = register("tamato_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item TANGA_BERRY = register("tanga_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item WACAN_BERRY = register("wacan_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item WATMEL_BERRY = register("watmel_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item WEPEAR_BERRY = register("wepear_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item WIKI_BERRY = register("wiki_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);
    public static final Item YACHE_BERRY = register("yache_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BERRIES);

    // Restoration
    //Potions
    public static final Item POTION = register("potion", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item SUPER_POTION = register("super_potion", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item HYPER_POTION = register("hyper_potion", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item MAX_POTION = register("max_potion", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item FULL_RESTORE = register("full_restore", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    //Revives
    public static final Item REVIVE = register("revive", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item MAX_REVIVE = register("max_revive", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item REVIVAL_HERB = register("revival_herb", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item SACRED_ASH = register("sacred_ash", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    //Restore
    public static final Item ELIXIR = register("elixir", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item ETHER = register("ether", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item MAX_ELIXIR = register("max_elixir", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item MAX_ETHER = register("max_ether", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    //Cures
    public static final Item ANTIDOTE = register("antidote", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item PARALYZE_HEAL = register("paralyze_heal", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item AWAKENING = register("awakening", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item BURN_HEAL = register("burn_heal", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item ICE_HEAL = register("ice_heal", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item FULL_HEAL = register("full_heal", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item HEAL_POWDER = register("heal_powder", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item LAVA_COOKIE = register("lava_cookie", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item OLD_GATEAU = register("old_gateau", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item RAGE_CANDY_BAR = register("rage_candy_bar", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item CASTELIACONE = register("casteliacone", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item LUMIOSE_GALETTE = register("lumiose_galette", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item SHALOUR_SABLE = register("shalour_sable", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item BIG_MALASADA = register("big_malasada", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    //Food
    public static final Item FRESH_WATER = register("fresh_water", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item SODA_POP = register("soda_pop", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item LEMONADE = register("lemonade", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item MOOMOO_MILK = register("moomoo_milk", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item BERRY_JUICE = register("berry_juice", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item HONEY = register("honey", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item SWEET_HEART = register("sweet_heart", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item ENERGY_POWDER = register("energy_powder", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    public static final Item ENERGY_ROOT = register("energy_root", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);
    //Other
    public static final Item MAX_HONEY = register("max_honey", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.RESTORATION);

    // Battle/Stat
    //Bottle
    public static final Item HP_UP = register("hp_up", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item PROTEIN = register("protein", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item IRON = register("iron", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item CARBOS = register("carbos", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item CALCIUM = register("calcium", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item ZINC = register("zinc", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item PP_UP = register("pp_up", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item PP_MAX = register("pp_max", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    // X Things
    public static final Item X_ATTACK = register("x_attack", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item X_DEFENSE = register("x_defense", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item X_SP_ATK = register("x_sp_atk", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item X_SP_DEF = register("x_sp_def", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item X_SPEED = register("x_speed", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item X_ACCURACY = register("x_accuracy", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item GUARD_SPEC = register("guard_spec", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item DIRE_HIT = register("dire_hit", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    // Feather
    public static final Item HEALTH_FEATHER = register("health_feather", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item MUSCLE_FEATHER = register("muscle_feather", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item RESIST_FEATHER = register("resist_feather", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item GENIUS_FEATHER = register("genius_feather", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item CLEVER_FEATHER = register("clever_feather", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item SWIFT_FEATHER = register("swift_feather", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    // Candy
    public static final Item EXP_CANDY_XS = register("exp_candy_xs", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item EXP_CANDY_S = register("exp_candy_s", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item EXP_CANDY_M = register("exp_candy_m", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item EXP_CANDY_L = register("exp_candy_l", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item EXP_CANDY_XL = register("exp_candy_xl", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item RARE_CANDY = register("rare_candy", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item DYNAMAX_CANDY = register("dynamax_candy", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    // Ability/Stats
    public static final Item BOTTLE_CAP = register("bottle_cap", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item GOLD_BOTTLE_CAP = register("gold_bottle_cap", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item ABILITY_CAPSULE = register("ability_capsule", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item ABILITY_PATCH = register("ability_patch", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    // Mints
    public static final Item LONELY_MINT = register("lonely_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item ADAMANT_MINT = register("adamant_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item NAUGHTY_MINT = register("naughty_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item BRAVE_MINT = register("brave_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item BOLD_MINT = register("bold_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item IMPISH_MINT = register("impish_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item LAX_MINT = register("lax_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item RELAXED_MINT = register("relaxed_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item MODEST_MINT = register("modest_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item MILD_MINT = register("mild_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item RASH_MINT = register("rash_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item QUIET_MINT = register("quiet_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item CALM_MINT = register("calm_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item GENTLE_MINT = register("gentle_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item CAREFUL_MINT = register("careful_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item SASSY_MINT = register("sassy_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item TIMID_MINT = register("timid_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item HASTY_MINT = register("hasty_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item JOLLY_MINT = register("jolly_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item NAIVE_MINT = register("naive_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item SERIOUS_MINT = register("serious_mint", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    // Use Items
    public static final Item POKE_DOLL = register("poke_doll", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item FLUFFY_TAIL = register("fluffy_tail", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item ADRENALINE_ORB = register("adrenaline_orb", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    // TMs
    public static final Item GRASS_TM = register("grass_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item FIRE_TM = register("fire_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item WATER_TM = register("water_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item NORMAL_TM = register("normal_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item FLYING_TM = register("flying_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item BUG_TM = register("bug_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item ROCK_TM = register("rock_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item GROUND_TM = register("ground_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item POISON_TM = register("poison_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item ELECTRIC_TM = register("electric_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item FAIRY_TM = register("fairy_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item PSYCHIC_TM = register("psychic_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item DARK_TM = register("dark_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item GHOST_TM = register("ghost_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item FIGHTING_TM = register("fighting_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item ICE_TM = register("ice_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item STEEL_TM = register("steel_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);
    public static final Item DRAGON_TM = register("dragon_tm", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.BATTLE_AND_STATS);

    // Held Items
    //Held
    public static final Item ABILITY_SHIELD = register("ability_shield", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ABSORB_BULB = register("absorb_bulb", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item AIR_BALLOON = register("air_balloon", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item AMULET_COIN = register("amulet_coin", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ASSAULT_VEST = register("assault_vest", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item BIG_ROOT = register("big_root", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item BINDING_BAND = register("binding_band", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item BLACK_SLUDGE = register("black_sludge", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item BLUNDER_POLICY = register("blunder_policy", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item BOOSTER_ENERGY = register("booster_energy", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item BRIGHT_POWDER = register("bright_powder", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item CELL_BATTERY = register("cell_battery", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item CHOICE_BAND = register("choice_band", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item CHOICE_SCARF = register("choice_scarf", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item CHOICE_SPECS = register("choice_specs", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item CLEANSE_TAG = register("cleanse_tag", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item CLEAR_AMULET = register("clear_amulet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item COVERT_CLOAK = register("covert_cloak", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item DAMP_ROCK = register("damp_rock", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item DESTINY_KNOT = register("destiny_knot", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item EJECT_BUTTON = register("eject_button", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item EJECT_PACK = register("eject_pack", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item EVERSTONE = register("everstone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item EVIOLITE = register("eviolite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item EXPERT_BELT = register("expert_belt", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item FLAME_ORB = register("flame_orb", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item FLOAT_STONE = register("float_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item FOCUS_BAND = register("focus_band", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item FOCUS_SASH = register("focus_sash", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item GRIP_CLAW = register("grip_claw", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item HEAT_ROCK = register("heat_rock", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item HEAVY_DUTY_BOOTS = register("heavy_duty_boots", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ICY_ROCK = register("icy_rock", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item IRON_BALL = register("iron_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LAGGING_TAIL = register("lagging_tail", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LEFTOVERS = register("leftovers", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LIFE_ORB = register("life_orb", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LIGHT_CLAY = register("light_clay", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LOADED_DICE = register("loaded_dice", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LUMINOUS_MOSS = register("luminous_moss", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item MACHO_BRACE = register("macho_brace", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item MENTAL_HERB = register("mental_herb", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item METRONOME = register("metronome", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item MIRROR_HERB = register("mirror_herb", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item MUSCLE_BAND = register("muscle_band", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item POWER_HERB = register("power_herb", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item PROTECTIVE_PADS = register("protective_pads", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item PUNCHING_GLOVE = register("punching_glove", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item QUICK_CLAW = register("quick_claw", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item RED_CARD = register("red_card", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item RING_TARGET = register("ring_target", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ROCKY_HELMET = register("rocky_helmet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ROOM_SERVICE = register("room_service", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SAFETY_GOGGLES = register("safety_goggles", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SCOPE_LENS = register("scope_lens", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item GRASSY_SEED = register("grassy_seed", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ELECTRIC_SEED = register("electric_seed", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item MISTY_SEED = register("misty_seed", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item PSYCHIC_SEED = register("psychic_seed", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SHED_SHELL = register("shed_shell", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SHELL_BELL = register("shell_bell", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SMOKE_BALL = register("smoke_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SMOOTH_ROCK = register("smooth_rock", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SNOWBALL = register("snowball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SOOTHE_BELL = register("soothe_bell", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item STICKY_BARB = register("sticky_barb", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item TERRAIN_EXTENDER = register("terrain_extender", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item THROAT_SPRAY = register("throat_spray", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item TOXIC_ORB = register("toxic_orb", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item UTILITY_UMBRELLA = register("utility_umbrella", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item WEAKNESS_POLICY = register("weakness_policy", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item WHITE_HERB = register("white_herb", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item WIDE_LENS = register("wide_lens", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item WISE_GLASSES = register("wise_glasses", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ZOOM_LENS = register("zoom_lens", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    //Power Items
    public static final Item POWER_ANKLET = register("power_anklet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item POWER_BAND = register("power_band", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item POWER_BELT = register("power_belt", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item POWER_BRACER = register("power_bracer", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item POWER_LENS = register("power_lens", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item POWER_WEIGHT = register("power_weight", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    //Pokemon Specific
    public static final Item LIGHT_BALL = register("light_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LEEK = register("leek", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item THICK_CLUB = register("thick_club", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LUCKY_PUNCH = register("lucky_punch", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item METAL_POWDER = register("metal_powder", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item QUICK_POWDER = register("quick_powder", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    //Type Enhancer
    public static final Item MIRACLE_SEED = register("miracle_seed", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item CHARCOAL = register("charcoal", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item MYSTIC_WATER = register("mystic_water", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SILK_SCARF = register("silk_scarf", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SHARP_BEAK = register("sharp_beak", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SILVER_POWDER = register("silver_powder", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item HARD_STONE = register("hard_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SOFT_SAND = register("soft_sand", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item POISON_BARB = register("poison_barb", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item MAGNET = register("magnet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item TWISTED_SPOON = register("twisted_spoon", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item BLACK_GLASSES = register("black_glasses", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item SPELL_TAG = register("spell_tag", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item BLACK_BELT = register("black_belt", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item NEVER_MELT_ICE = register("never_melt_ice", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item DRAGON_FANG = register("dragon_fang", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    //Exp
    public static final Item EXP_SHARE = register("exp_share", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LUCKY_EGG = register("lucky_egg", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    //Incense
    public static final Item SEA_INCENSE = register("sea_incense", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LAX_INCENSE = register("lax_incense", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ROSE_INCENSE = register("rose_incense", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item PURE_INCENSE = register("pure_incense", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ROCK_INCENSE = register("rock_incense", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ODD_INCENSE = register("odd_incense", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item LUCK_INCENSE = register("luck_incense", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item FULL_INCENSE = register("full_incense", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item WAVE_INCENSE = register("wave_incense", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    //Gem
    public static final Item GRASS_GEM = register("grass_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item FIRE_GEM = register("fire_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item WATER_GEM = register("water_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item NORMAL_GEM = register("normal_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item FLYING_GEM = register("flying_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item BUG_GEM = register("bug_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ROCK_GEM = register("rock_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item GROUND_GEM = register("ground_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item POISON_GEM = register("poison_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ELECTRIC_GEM = register("electric_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item FAIRY_GEM = register("fairy_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item PSYCHIC_GEM = register("psychic_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item DARK_GEM = register("dark_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item GHOST_GEM = register("ghost_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item FIGHTING_GEM = register("fighting_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item ICE_GEM = register("ice_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item STEEL_GEM = register("steel_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);
    public static final Item DRAGON_GEM = register("dragon_gem", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.HELD_ITEMS);

    // Evolution
    //Stones
    public static final Item FIRE_STONE = register("fire_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item WATER_STONE = register("water_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item THUNDER_STONE = register("thunder_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item LEAF_STONE = register("leaf_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item MOON_STONE = register("moon_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item SUN_STONE = register("sun_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item SHINY_STONE = register("shiny_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item DUSK_STONE = register("dusk_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item DAWN_STONE = register("dawn_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item ICE_STONE = register("ice_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item KINGS_ROCK = register("kings_rock", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item METAL_COAT = register("metal_coat", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item DRAGON_SCALE = register("dragon_scale", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item UPGRADE = register("upgrade", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item PRISM_SCALE = register("prism_scale", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item DEEP_SEA_TOOTH = register("deep_sea_tooth", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item DEEP_SEA_SCALE = register("deep_sea_scale", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item OVAL_STONE = register("oval_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item RAZOR_CLAW = register("razor_claw", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item PROTECTOR = register("protector", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item ELECTIRIZER = register("electirizer", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item MAGMARIZER = register("magmarizer", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item RAZOR_FANG = register("razor_fang", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item DUBIOUS_DISC = register("dubious_disc", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item REAPER_CLOTH = register("reaper_cloth", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item WHIPPED_DREAM = register("whipped_dream", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item SACHET = register("sachet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item TART_APPLE = register("tart_apple", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item SWEET_APPLE = register("sweet_apple", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item CRACKED_POT = register("cracked_pot", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item CHIPPED_POT = register("chipped_pot", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item STRAWBERRY_SWEET = register("strawberry_sweet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item LOVE_SWEET = register("love_sweet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item BERRY_SWEET = register("berry_sweet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item CLOVER_SWEET = register("clover_sweet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item FLOWER_SWEET = register("flower_sweet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item STAR_SWEET = register("star_sweet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item RIBBON_SWEET = register("ribbon_sweet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item GALARICA_CUFF = register("galarica_cuff", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item GALARICA_WREATH = register("galarica_wreath", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item LINKING_CORD = register("linking_cord", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item BLACK_AUGURITE = register("black_augurite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item PEAT_BLOCK = register("peat_block", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item AUSPICIOUS_ARMOR = register("auspicious_armor", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);
    public static final Item MALICIOUS_ARMOR = register("malicious_armor", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.EVOLUTION);

    // Gimmick Items
    //Mega Stone
    public static final Item VENUSAURITE = register("venusaurite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item CHARIZARDITE_X = register("charizardite_x", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item CHARIZARDITE_Y = register("charizardite_y", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item BLASTOISINITE = register("blastoisinite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item BEEDRILLITE = register("beedrillite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item PIDGEOTITE = register("pidgeotite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ALAKAZITE = register("alakazite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item SLOWBRONITE = register("slowbronite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item GENGARITE = register("gengarite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item KANGASKHANITE = register("kangaskhanite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item PINSIRITE = register("pinsirite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item GYARADOSITE = register("gyaradosite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item AERODACTYLITE = register("aerodactylite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item MEWTWONITE_X = register("mewtwonite_x", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item MEWTWONITE_Y = register("mewtwonite_y", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item AMPHAROSITE = register("ampharosite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item STEELIXITE = register("steelixite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item SCIZORITE = register("scizorite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item HERACRONITE = register("heracronite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item HOUNDOOMINITE = register("houndoominite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item TYRANITARITE = register("tyranitarite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item SCEPTILITE = register("sceptilite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item BLAZIKENITE = register("blazikenite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item SWAMPERTITE = register("swampertite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item GARDEVOIRITE = register("gardevoirite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item SABLENITE = register("sablenite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item MAWILITE = register("mawilite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item AGGRONITE = register("aggronite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item MEDICHAMITE = register("medichamite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item MANECTITE = register("manectite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item SHARPEDONITE = register("sharpedonite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item CAMERUPTITE = register("cameruptite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ALTARIANITE = register("altarianite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item BANETTITE = register("banettite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ABSOLITE = register("absolite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item GLALITITE = register("glalitite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item SALAMENCITE = register("salamencite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item METAGROSSITE = register("metagrossite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item LATIASITE = register("latiasite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item LATIOSITE = register("latiosite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item LOPUNNITE = register("lopunnite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item GARCHOMPITE = register("garchompite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item LUCARIONITE = register("lucarionite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ABOMASITE = register("abomasite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item GALLADITE = register("galladite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item AUDINITE = register("audinite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item DIANCITE = register("diancite", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    //Z-Crystals
    public static final Item GRASSIUM_Z = register("grassium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item FIRIUM_Z = register("firium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item WATERIUM_Z = register("waterium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item NORMALIUM_Z = register("normalium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item FLYINIUM_Z = register("flyinium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item BUGINIUM_Z = register("buginium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ROCKIUM_Z = register("rockium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item GROUNDIUM_Z = register("groundium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item POISONIUM_Z = register("poisonium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ELECTRIUM_Z = register("electrium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item FAIRIUM_Z = register("fairium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item PSYCHIUM_Z = register("psychium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item DARKINIUM_Z = register("darkinium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item GHOSTIUM_Z = register("ghostium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item FIGHTINIUM_Z = register("fightinium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ICIUM_Z = register("icium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item STEELIUM_Z = register("steelium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item DRAGONIUM_Z = register("dragonium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item PIKANIUM_Z = register("pikanium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item PIKASHUNIUM_Z = register("pikashunium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ALORAICHIUM_Z = register("aloraichium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item EEVIUM_Z = register("eevium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item SNORLIUM_Z = register("snorlium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item MEWNIUM_Z = register("mewnium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item DECIDIUM_Z = register("decidium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item INCINIUM_Z = register("incinium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item PRIMARIUM_Z = register("primarium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item LYCANIUM_Z = register("lycanium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item MIMIKIUM_Z = register("mimikium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item KOMMONIUM_Z = register("kommonium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item TAPUNIUM_Z = register("tapunium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item SOLGANIUM_Z = register("solganium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item LUNALIUM_Z = register("lunalium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ULTRANECROZIUM_Z = register("ultranecrozium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item MARSHADIUM_Z = register("marshadium_z", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    //Tera Shard
    public static final Item GRASS_TERA_SHARD = register("grass_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item FIRE_TERA_SHARD = register("fire_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item WATER_TERA_SHARD = register("water_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item NORMAL_TERA_SHARD = register("normal_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item FLYING_TERA_SHARD = register("flying_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item BUG_TERA_SHARD = register("bug_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ROCK_TERA_SHARD = register("rock_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item GROUND_TERA_SHARD = register("ground_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item POISON_TERA_SHARD = register("poison_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ELECTRIC_TERA_SHARD = register("electric_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item FAIRY_TERA_SHARD = register("fairy_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item PSYCHIC_TERA_SHARD = register("psychic_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item DARK_TERA_SHARD = register("dark_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item GHOST_TERA_SHARD = register("ghost_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item FIGHTING_TERA_SHARD = register("fighting_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item ICE_TERA_SHARD = register("ice_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item STEEL_TERA_SHARD = register("steel_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);
    public static final Item DRAGON_TERA_SHARD = register("dragon_tera_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.GIMMICK);

    // Natural
    //Apricorns
    public static final Item RED_APRICORN = register("red_apricorn", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item YELLOW_APRICORN = register("yellow_apricorn", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item GREEN_APRICORN = register("green_apricorn", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item BLUE_APRICORN = register("blue_apricorn", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item PINK_APRICORN = register("pink_apricorn", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item WHITE_APRICORN = register("white_apricorn", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item BLACK_APRICORN = register("black_apricorn", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    //Nectar
    public static final Item RED_NECTAR = register("red_nectar", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item YELLOW_NECTAR = register("yellow_nectar", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item PINK_NECTAR = register("pink_nectar", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item PURPLE_NECTAR = register("purple_nectar", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item GALARICA_TWIG = register("galarica_twig", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    //Ore
    public static final Item RUBY = register("ruby", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item SAPPHIRE = register("sapphire", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item CHARGESTONE = register("chargestone", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item RAW_Z_ORE = register("chargestone", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item Z_CRYSTAL = register("chargestone", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item WISHING_CHIP = register("wishing_chip", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item WISHING_PIECE = register("wishing_piece", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item WISHING_STAR = register("wishing_star", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item ORIGIN_NUGGET = register("origin_nugget", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item ORIGIN_ORE = register("origin_ore", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    //Fossil
    public static final Item HELIX_FOSSIL = register("helix_fossil", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item DOME_FOSSIL = register("dome_fossil", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item OLD_AMBER = register("old_amber", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item ROOT_FOSSIL = register("root_fossil", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item CLAW_FOSSIL = register("claw_fossil", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item SKULL_FOSSIL = register("skull_fossil", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item ARMOR_FOSSIL = register("armor_fossil", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item COVER_FOSSIL = register("cover_fossil", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item PLUME_FOSSIL = register("plume_fossil", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item JAW_FOSSIL = register("jaw_fossil", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item SAIL_FOSSIL = register("sail_fossil", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item FOSSILIZED_BIRD = register("fossilized_bird", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item FOSSILIZED_FISH = register("fossilized_fish", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item FOSSILIZED_DRAKE = register("fossilized_drake", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item FOSSILIZED_DINO = register("fossilized_dino", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    //Shard
    public static final Item RED_SHARD = register("red_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item YELLOW_SHARD = register("yellow_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item GREEN_SHARD = register("green_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item BLUE_SHARD = register("blue_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    //Valuable
    public static final Item NUGGET = register("nugget", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item BIG_NUGGET = register("big_nugget", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item PEARL = register("pearl", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item BIG_PEARL = register("big_pearl", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item PEARL_STRING = register("pearl_string", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item STARDUST = register("stardust", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item STAR_PIECE = register("star_piece", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item COMET_SHARD = register("comet_shard", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item TINY_MUSHROOM = register("tiny_mushroom", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item BIG_MUSHROOM = register("big_mushroom", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item BALM_MUSHROOM = register("balm_mushroom", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item RARE_BONE = register("rare_bone", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item PRETTY_FEATHER = register("pretty_feather", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item TINY_BAMBOO_SHOOT = register("tiny_bamboo_shoot", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item BIG_BAMBOO_SHOOT = register("big_bamboo_shoot", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item RELIC_COPPER = register("relic_copper", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item RELIC_SILVER = register("relic_silver", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item RELIC_GOLD = register("relic_gold", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item RELIC_VASE = register("relic_vase", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item RELIC_BAND = register("relic_band", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item RELIC_STATUE = register("relic_statue", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item RELIC_CROWN = register("relic_crown", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item STRANGE_SOUVENIR = register("strange_souvenir", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item HEART_SCALE = register("heart_scale", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    //Souvenir
    public static final Item BEACH_GLASS = register("beach_glass", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item CHALKY_STONE = register("chalky_stone", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item SILVER_LEAF = register("silver_leaf", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item GOLD_LEAF = register("gold_leaf", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item LEAF_LETTER = register("leaf_letter", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item LONE_EARING = register("lone_earing", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item MARBLE = register("marble", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item POLISHED_MUD_BALL = register("polished_mud_ball", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item SMALL_BOUQUET = register("small_bouquet", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item STRETCHY_SPRING = register("stretchy_spring", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);
    public static final Item TROPICAL_SHELL = register("tropical_shell", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.NATURAL);

    // Legend Items
    //Johto
    public static final Item SILVER_WING = register("silver_wing", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item TIDAL_BELL = register("tidal_bell", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item RAINBOW_WING = register("rainbow_wing", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item CLEAR_BELL = register("clear_bell", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item GS_BALL = register("gs_ball", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    //Hoenn
    public static final Item SOUL_DEW = register("soul_dew", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item ENIGMA_STONE = register("enigma_stone", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item RED_ORB = register("red_orb", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item BLUE_ORB = register("blue_orb", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item METEORITE = register("meteorite", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    //Sinnoh
    public static final Item RED_CHAIN = register("red_chain", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item ADAMANT_ORB = register("adamant_orb", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item ADAMANT_CRYSTAL = register("adamant_crystal", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item TIME_BALM = register("time_balm", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item LUSTROUS_ORB = register("lustrous_orb", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item LUSTROUS_GLOBE = register("lustrous_globe", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item SPACE_BALM = register("space_balm", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item MAGMA_STONE = register("magma_stone", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item GRISEOUS_ORB = register("griseous_orb", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item GRISEOUS_CORE = register("griseous_core", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item LUNAR_WING = register("lunar_wing", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item GRACIDEA = register("gracidea", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item MEADOW_PLATE = register("meadow_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item FLAME_PLATE = register("flame_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item SPLASH_PLATE = register("splash_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item BLANK_PLATE = register("blank_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item SKY_PLATE = register("sky_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item INSECT_PLATE = register("insect_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item STONE_PLATE = register("stone_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item EARTH_PLATE = register("earth_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item TOXIC_PLATE = register("toxic_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item ZAP_PLATE = register("zap_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item PIXIE_PLATE = register("pixie_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item MIND_PLATE = register("mind_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item DREAD_PLATE = register("dread_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item SPOOKY_PLATE = register("spooky_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item FIST_PLATE = register("fist_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item ICICLE_PLATE = register("icicle_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item IRON_PLATE = register("iron_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item DRACO_PLATE = register("draco_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item LEGEND_PLATE = register("legend_plate", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item MYSTERIOUS_BALM = register("mysterious_balm", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item AZURE_FLUTE = register("azure_flute", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    //Unova
    public static final Item REVEAL_GLASS = register("reveal_glass", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item LIGHT_STONE = register("light_stone", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item DARK_STONE = register("dark_stone", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item DNA_SPLICERS = register("dna_splicers", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item SHOCK_DRIVE = register("shock_drive", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item BURN_DRIVE = register("burn_drive", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item CHILL_DRIVE = register("chill_drive", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item DOUSE_DRIVE = register("douse_drive", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    //Kalos
    public static final Item PRISON_BOTTLE = register("prison_bottle", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    //Alola
    public static final Item GRASS_MEMORY = register("grass_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item FIRE_MEMORY = register("fire_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item WATER_MEMORY = register("water_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item FLYING_MEMORY = register("flying_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item BUG_MEMORY = register("bug_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item ROCK_MEMORY = register("rock_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item GROUND_MEMORY = register("ground_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item POISON_MEMORY = register("poison_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item ELECTRIC_MEMORY = register("electric_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item FAIRY_MEMORY = register("fairy_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item PSYCHIC_MEMORY = register("psychic_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item DARK_MEMORY = register("dark_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item GHOST_MEMORY = register("ghost_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item FIGHTING_MEMORY = register("fighting_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item ICE_MEMORY = register("ice_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item STEEL_MEMORY = register("steel_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item DRAGON_MEMORY = register("dragon_memory", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item SPARKLING_STONE = register("sparkling_stone", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item SUN_FLUTE = register("sun_flute", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item N_SOLARIZER = register("n_solarizer", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item MOON_FLUTE = register("moon_flute", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item N_LUNARIZER = register("n_lunarizer", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    //Galar
    public static final Item RUSTED_SWORD = register("rusted_sword", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item RUSTED_SHIELD = register("rusted_shield", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item SCROLL_OF_DARKNESS = register("scroll_of_darkness", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item SCROLL_OF_WATERS = register("scroll_of_waters", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item CARROT_SEEDS = register("carrot_seeds", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item ICEROOT_CARROT = register("iceroot_carrot", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item SHADEROOT_CARROT = register("shaderoot_carrot", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item REINS_OF_UNITY = register("reins_of_unity", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    //Paldea
    public static final Item SCARLET_BOOK = register("scarlet_book", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);
    public static final Item VIOLET_BOOK = register("violet_book", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.SPECIAL);

    // Player
    public static final Item REPEL = register("repel", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SUPER_REPEL = register("super_repel", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item MAX_REPEL = register("max_repel", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item LURE = register("lure", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SUPER_LURE = register("super_lure", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item MAX_LURE = register("max_lure", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item ESCAPE_ROPE = register("escape_rope", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item POKE_TOY = register("poke_toy", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item BLUE_FLUTE = register("blue_flute", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item YELLOW_FLUTE = register("yellow_flute", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item RED_FLUTE = register("red_flute", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item BLACK_FLUTE = register("black_flute", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item WHITE_FLUTE = register("white_flute", new Item(SIXTEEN_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SPOILED_APRICORN = register("spoiled_apricorn", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item HOPO_BERRY = register("hopo_berry", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item BALL_OF_MUD = register("ball_of_mud", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SNOW_BALL = register("snow_ball", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item STICKY_GLOB = register("sticky_glob", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SCATTER_BANG = register("scatter_bang", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SMOKE_BOMB = register("smoke_bomb", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item STEALTH_SPRAY = register("stealth_spray", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SEED_OF_MASTERY = register("seed_of_mastery", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item GROWTH_MULCH = register("growth_mulch", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item DAMP_MULCH = register("damp_mulch", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item STABLE_MULCH = register("stable_mulch", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item GOOEY_MULCH = register("gooey_mulch", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item AMAZE_MULCH = register("amaze_mulch", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item BOOST_MULCH = register("boost_mulch", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item RICH_MULCH = register("rich_mulch", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SURPRISE_MULCH = register("surprise_mulch", new Item(GENERIC_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SPRAYDUCK = register("sprayduck", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SPRINKLOTAD = register("sprinklotad", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SQUIRTBOTTLE = register("squirtbottle", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item WAILMER_PAIL = register("wailmer_pail", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SHINY_CHARM = register("shiny_charm", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item OVAL_CHARM = register("oval_charm", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item CATCHING_CHARM = register("catching_charm", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item EXP_CHARM = register("exp_charm", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item MARK_CHARM = register("mark_charm", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item OLD_ROD = register("old_rod", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item GOOD_ROD = register("good_rod", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item SUPER_ROD = register("super_rod", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item BOX_LINK = register("box_link", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item ZYGARDE_CUBE = register("zygarde_cube", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item EON_FLUTE = register("eon_flute", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item RIDE_PAGER = register("ride_pager", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item MEGA_BRACELET = register("mega_bracelet", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item Z_RING = register("z_ring", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item DYNAMAX_BAND = register("dynamax_band", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item TERA_ORB = register("tera_orb", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item EXP_ALL = register("exp_all", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item ODD_KEYSTONE = register("odd_keystone", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item ROTOM_CATALOG = register("rotom_catalog", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);
    public static final Item ETERNAL_ICE = register("eternal_ice", new Item(SINGLE_PROPERTIES), PokeCraftCreativeTabs.PLAYER_ITEMS);


    public static void onInitialize() {
    }

    public static Item register(String name, Item item, CreativeTab tab) {
        REGISTRY.register(name, item);
        tab.items.add(() -> item);
        return item;
    }
}
