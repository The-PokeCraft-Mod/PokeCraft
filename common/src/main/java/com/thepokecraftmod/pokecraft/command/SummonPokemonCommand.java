package com.thepokecraftmod.pokecraft.command;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.thepokecraftmod.pokecraft.api.pokemon.InstanceBuilder;
import com.thepokecraftmod.pokecraft.command.argument.InstanceBuilderArgumentType;
import com.thepokecraftmod.pokecraft.level.entity.PokeCraftEntities;
import com.thepokecraftmod.pokecraft.level.entity.PokemonEntity;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

import static net.minecraft.commands.Commands.literal;

/**
 * /summon namespace:path[extra_info] ~ ~ ~ \<generateAsWild\>
 */
public class SummonPokemonCommand {

    public static LiteralArgumentBuilder<CommandSourceStack> command() {
        return literal("summon")
                .requires(source -> source.hasPermission(2))
                .then(Commands.argument("pokemon", InstanceBuilderArgumentType.instanceBuilder()).executes(ctx -> execute(ctx.getSource(), ctx.getArgument("pokemon", InstanceBuilder.class), true))
                        .then(Commands.argument("generateAsWild", BoolArgumentType.bool()).executes(ctx -> execute(ctx.getSource(), ctx.getArgument("pokemon", InstanceBuilder.class), ctx.getArgument("generateAsWild", Boolean.class)))));
    }

    private static int execute(CommandSourceStack source, InstanceBuilder species, boolean generateAsWild) throws CommandSyntaxException {
        var player = source.getPlayerOrException();
        var pokemon = new PokemonEntity(PokeCraftEntities.POKEMON, player.level);
        pokemon.setPos(player.getPosition(0f));
        pokemon.setInstance(species.create());
        player.level.addFreshEntity(pokemon);
        source.sendSuccess(Component.translatable("commands.summon.success", pokemon.getDisplayName()), true);
        return 0;
    }
}
