package com.thepokecraftmod.pokecraft.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.thepokecraftmod.pokecraft.api.pokemon.PokemonInstance;
import com.thepokecraftmod.pokecraft.api.pokemon.PokemonParty;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.arguments.ResourceLocationArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import static net.minecraft.commands.Commands.literal;

/**
 * /give @p pokemon namespace:path[extra_info]
 */
public class GivePokemonCommand {

    public static LiteralArgumentBuilder<CommandSourceStack> command() {
        return literal("give")
                .requires((stack) -> stack.hasPermission(2))
                .then(Commands.argument("targets", EntityArgument.players())
                        .then(Commands.literal("pokemon")
                                .then(Commands.argument("species", new ResourceLocationArgument()).executes(context -> {
                                    var species = context.getArgument("species", ResourceLocation.class);
                                    var targets = EntityArgument.getPlayers(context, "targets");
                                    for (var target : targets) {
                                        var party = PokemonParty.ofPlayer(target);
                                        party.addPokemon(new PokemonInstance(species));
                                        context.getSource().sendSystemMessage(Component.translatable("command.pokecraft.give.success", target.getDisplayName(), species.toString()));
                                    }
                                    return 0;
                                }))));
    }
}
