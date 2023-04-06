package com.thepokecraftmod.pokecraft.command.argument;

import com.mojang.brigadier.arguments.ArgumentType;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import net.minecraft.commands.synchronization.ArgumentTypeInfo;
import net.minecraft.commands.synchronization.ArgumentTypeInfos;
import net.minecraft.commands.synchronization.SingletonArgumentInfo;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;

public class PokeCraftArguments {
    private static final MojangRegistry<ArgumentTypeInfo<?, ?>, Registry<ArgumentTypeInfo<?, ?>>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.COMMAND_ARGUMENT_TYPE);

    public static void onInitialize() {
        register("instance_builder", InstanceBuilderArgumentType.class, new SingletonArgumentInfo<>(ctx -> InstanceBuilderArgumentType.instanceBuilder()));
    }

    private static <A extends ArgumentType<?>, T extends ArgumentTypeInfo.Template<A>> void register(String name, Class<? extends A> argumentClass, ArgumentTypeInfo<A, T> info) {
        ArgumentTypeInfos.BY_CLASS.put(argumentClass, info);
        REGISTRY.register(name, info);
    }
}
