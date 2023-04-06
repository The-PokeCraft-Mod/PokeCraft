package com.thepokecraftmod.pokecraft.command;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.thepokecraftmod.pokecraft.command.argument.SpawnBuilderArgumentType;
import com.thepokecraftmod.pokecraft.level.spawn.SpawnBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.ResourceLocationArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import static net.minecraft.commands.Commands.literal;

/**
 * /summon pokemon namespace:path[extra_info] ~ ~ ~ \<generateAsWild\>
 */
public class SummonPokemonCommand {

    public static LiteralArgumentBuilder<CommandSourceStack> command() {
        return literal("summon")
                .requires(source -> source.hasPermission(2))
                .then(literal("pokemon")
                        .then(Commands.argument("pokemon", SpawnBuilderArgumentType.spawnBuilder()).executes(context -> execute(context.getArgument("pokemon", SpawnBuilder.class), true))
                                .then(Commands.argument("generateAsWild", BoolArgumentType.bool()).executes(context -> execute(context.getArgument("pokemon", SpawnBuilder.class), context.getArgument("generateAsWild", Boolean.class))))));
    }

    private static int execute(SpawnBuilder species, boolean generateAsWild) {
        return 0;
    }
}
