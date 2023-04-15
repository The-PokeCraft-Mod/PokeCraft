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
