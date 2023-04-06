package com.thepokecraftmod.pokecraft.forge.level.item.tab;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.level.item.tab.CreativeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ForgeTabHandler {
    private static final List<CreativeTab> TABS = new ArrayList<>();

    public static void onInitialize(IEventBus eventBus) {
        eventBus.addListener(ForgeTabHandler::registerTabs);
    }

    public static void registerTabs(CreativeModeTabEvent.Register event) {
        for (CreativeTab tab : TABS) {
            event.registerCreativeModeTab(tab.name, builder -> builder
                    .icon(() -> new ItemStack(tab.icon.get()))
                    .title(Component.translatable(tab.name.getNamespace() + ".item_group." + tab.name.getPath()))
                    .displayItems((features, output) -> {
                        for (Supplier<Item> item : tab.items)
                            output.accept(item.get());
                    }));
        }
    }

    public static void register(CreativeTab creativeTab) {
        TABS.add(creativeTab);
    }
}
