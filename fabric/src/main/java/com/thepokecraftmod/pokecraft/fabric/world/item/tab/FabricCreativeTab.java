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
