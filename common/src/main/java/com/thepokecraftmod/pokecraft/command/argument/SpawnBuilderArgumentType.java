package com.thepokecraftmod.pokecraft.command.argument;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.thepokecraftmod.pokecraft.level.spawn.SpawnBuilder;

public class SpawnBuilderArgumentType implements ArgumentType<SpawnBuilder> {

    public static SpawnBuilderArgumentType spawnBuilder() {
        return new SpawnBuilderArgumentType();
    }

    @Override
    public SpawnBuilder parse(StringReader reader) throws CommandSyntaxException {
        return null;
    }
}
