package com.thepokecraftmod.pokecraft.level.item;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class PokeCraftItems {
    public static final MojangRegistry<Item, Registry<Item>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.ITEM);

    // Available Properties
    private static final Item.Properties BALL_PROPERTIES = new Item.Properties().stacksTo(16);

    public static final Item BEAST_BALL = register("beast_ball", new Item(BALL_PROPERTIES));
    public static final Item CHERISH_BALL = register("cherish_ball", new Item(BALL_PROPERTIES));
    public static final Item DIVE_BALL = register("dive_ball", new Item(BALL_PROPERTIES));
    public static final Item DREAM_BALL = register("dream_ball", new Item(BALL_PROPERTIES));
    public static final Item DUSK_BALL = register("dusk_ball", new Item(BALL_PROPERTIES));
    public static final Item FAST_BALL = register("fast_ball", new Item(BALL_PROPERTIES));
    public static final Item FRIEND_BALL = register("friend_ball", new Item(BALL_PROPERTIES));
    public static final Item GREAT_BALL = register("great_ball", new Item(BALL_PROPERTIES));
    public static final Item ANCIENT_GREAT_BALL = register("ancient_great_ball", new Item(BALL_PROPERTIES));
    public static final Item HEAL_BALL = register("heal_ball", new Item(BALL_PROPERTIES));
    public static final Item HEAVY_BALL = register("heavy_ball", new Item(BALL_PROPERTIES));
    public static final Item LEADEN_BALL = register("leaden_ball", new Item(BALL_PROPERTIES));
    public static final Item LEVEL_BALL = register("level_ball", new Item(BALL_PROPERTIES));
    public static final Item LOVE_BALL = register("love_ball", new Item(BALL_PROPERTIES));
    public static final Item LURE_BALL = register("lure_ball", new Item(BALL_PROPERTIES));
    public static final Item LUXURY_BALL = register("luxury_ball", new Item(BALL_PROPERTIES));
    public static final Item MASTER_BALL = register("master_ball", new Item(BALL_PROPERTIES));
    public static final Item MOON_BALL = register("moon_ball", new Item(BALL_PROPERTIES));
    public static final Item NEST_BALL = register("nest_ball", new Item(BALL_PROPERTIES));
    public static final Item NET_BALL = register("net_ball", new Item(BALL_PROPERTIES));
    public static final Item ORIGIN_BALL = register("origin_ball", new Item(BALL_PROPERTIES));
    public static final Item PARK_BALL = register("park_ball", new Item(BALL_PROPERTIES));
    public static final Item POKE_BALL = register("poke_ball", new Item(BALL_PROPERTIES));
    public static final Item ANCIENT_POKE_BALL = register("ancient_poke_ball", new Item(BALL_PROPERTIES));
    public static final Item PREMIER_BALL = register("premier_ball", new Item(BALL_PROPERTIES));
    public static final Item QUICK_BALL = register("quick_ball", new Item(BALL_PROPERTIES));
    public static final Item REPEAT_BALL = register("repeat_ball", new Item(BALL_PROPERTIES));
    public static final Item SAFARI_BALL = register("safari_ball", new Item(BALL_PROPERTIES));
    public static final Item SPORT_BALL = register("sport_ball", new Item(BALL_PROPERTIES));
    public static final Item STRANGE_BALL = register("strange_ball", new Item(BALL_PROPERTIES));
    public static final Item TIMER_BALL = register("timer_ball", new Item(BALL_PROPERTIES));
    public static final Item ULTRA_BALL = register("ultra_ball", new Item(BALL_PROPERTIES));
    public static final Item ANCIENT_ULTRA_BALL = register("ancient_ultra_ball", new Item(BALL_PROPERTIES));
    public static final Item WING_BALL = register("wing_ball", new Item(BALL_PROPERTIES));

    public static void onInitialize() {
    }

    public static Item register(String name, Item item) {
        return REGISTRY.register(name, item);
    }
}
