package com.thepokecraftmod.pokecraft.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.thepokecraftmod.pokecraft.api.pokemon.InstanceBuilder;
import com.thepokecraftmod.pokecraft.api.pokemon.PokemonParty;
import com.thepokecraftmod.pokecraft.command.argument.InstanceBuilderArgumentType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

import java.util.Collection;

import static net.minecraft.commands.Commands.literal;

/**
 * /give @p namespace:path[extra_info]
 */
public class GivePokemonCommand {

    public static LiteralArgumentBuilder<CommandSourceStack> command() {
        return literal("give")
                .requires((stack) -> stack.hasPermission(2))
                .then(Commands.argument("targets", EntityArgument.players())
                        .then(Commands.argument("pokemon", InstanceBuilderArgumentType.instanceBuilder()).executes(ctx -> execute(ctx.getArgument("pokemon", InstanceBuilder.class), EntityArgument.getPlayers(ctx, "targets"), ctx.getSource()))));
    }

    private static int execute(InstanceBuilder instanceBuilder, Collection<ServerPlayer> players, CommandSourceStack source) {
        for (var target : players) {
            var party = PokemonParty.ofPlayer(target);
            var instance = instanceBuilder.create();
            party.addPokemon(instance);
            source.sendSuccess(Component.translatable("command.pokecraft.give.success", target.getDisplayName(), instance.species.toString()), true);
        }

        return 0;
    }
}
