package com.thepokecraftmod.pokecraft.api.registry.builtin;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.species.transform.ModifySpeciesTransform;
import com.thepokecraftmod.pokecraft.api.species.transform.SpeciesTransform;
import com.thepokecraftmod.pokecraft.api.species.transform.VisualSpeciesTransform;

public class SpeciesTransformTypes {
    public static final SpeciesTransform.Type<?> VISUAL = register("visual", VisualSpeciesTransform.CODEC, VisualSpeciesTransform.class);
    public static final SpeciesTransform.Type<?> MODIFY_SPECIES = register("modify_species", ModifySpeciesTransform.CODEC, ModifySpeciesTransform.class);

    public static void onInitialize() {
        PokeCraftRegistries.SPECIES_TRANSFORM_TYPES.freeze();
    }

    public static <T extends SpeciesTransform> SpeciesTransform.Type<?> register(String name, Codec<T> codec, Class<T> clazz) {
        return PokeCraftRegistries.SPECIES_TRANSFORM_TYPES.register(PokeCraft.id(name), new SpeciesTransform.Type<>(codec, clazz));
    }
}
