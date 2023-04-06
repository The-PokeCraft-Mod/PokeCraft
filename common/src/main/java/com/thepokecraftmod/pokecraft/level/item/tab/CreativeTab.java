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
