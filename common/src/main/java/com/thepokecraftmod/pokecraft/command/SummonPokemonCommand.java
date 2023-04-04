package com.thepokecraftmod.pokecraft.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.ResourceLocationArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import static net.minecraft.commands.Commands.literal;

/**
 * /summon pokemon namespace:path[extra_info] ~ ~ ~
 */
public class SummonPokemonCommand {

    public static LiteralArgumentBuilder<CommandSourceStack> command() {
        return literal("summon")
                .then(literal("pokemon")
                        .requires(source -> source.hasPermission(2)).then(Commands.argument("species", new ResourceLocationArgument()).executes(context -> {
                            context.getSource().sendSystemMessage(Component.literal("Implement Summon " + context.getArgument("species", ResourceLocation.class)));
                            return 0;
                        })));
    }
}
