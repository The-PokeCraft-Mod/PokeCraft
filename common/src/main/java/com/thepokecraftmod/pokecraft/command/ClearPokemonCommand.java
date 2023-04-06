package com.thepokecraftmod.pokecraft.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.thepokecraftmod.pokecraft.api.pokemon.PokemonParty;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

import java.util.Collection;
import java.util.List;

import static net.minecraft.commands.Commands.literal;

/**
 * /clear party <br>
 * /clear party @a <br>
 * /clear party player_69 <br>
 */
public class ClearPokemonCommand {

    public static LiteralArgumentBuilder<CommandSourceStack> command() {
        return literal("clear")
                .requires((stack) -> stack.hasPermission(2))
                .then(literal("party").executes(ctx -> execute(List.of(ctx.getSource().getPlayerOrException()), ctx.getSource()))
                        .then(Commands.argument("players", EntityArgument.players()).executes(ctx -> execute(EntityArgument.getPlayers(ctx, "players"), ctx.getSource()))));
    }

    private static int execute(Collection<ServerPlayer> targets, CommandSourceStack source) {
        for (var target : targets) {
            var party = PokemonParty.ofPlayer(target);
            party.getParty().clear();
            party.sync();
            source.sendSuccess(Component.translatable("command.pokecraft.clear.success"), true);
        }

        return 0;
    }
}
