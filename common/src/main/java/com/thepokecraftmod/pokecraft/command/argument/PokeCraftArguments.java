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
