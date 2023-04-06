package com.thepokecraftmod.pokecraft.command.argument;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.thepokecraftmod.pokecraft.api.pokemon.InstanceBuilder;
import com.thepokecraftmod.pokecraft.api.registry.builtin.PokeCraftRegistries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.resources.ResourceLocation;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class InstanceBuilderArgumentType implements ArgumentType<InstanceBuilder> {
    private static final Collection<String> EXAMPLES = Arrays.asList("pokecraft:meowscarada", "wooper", "wooper{\"transforms\": [\"paldean\", \"shiny\"]}");

    public static InstanceBuilderArgumentType instanceBuilder() {
        return new InstanceBuilderArgumentType();
    }

    public static ResourceLocation getId(CommandContext<CommandSourceStack> context, String name) {
        return context.getArgument(name, ResourceLocation.class);
    }

    @Override
    public InstanceBuilder parse(StringReader reader) throws CommandSyntaxException {
        var string = reader.getString();

        if (string.indexOf("{") == -1) {
            var species = ResourceLocation.read(reader);
            return new InstanceBuilder()
                    .species(species);
        } else {
            var json = string.substring(string.indexOf("{"));

        }

        return null;
    }

    @Override
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> context, final SuggestionsBuilder builder) {
        var string = builder.getRemainingLowerCase();

        if (string.indexOf("{") == -1) {
            PokeCraftRegistries.SPECIES.keySet().stream()
                    .map(resourceLocation -> resourceLocation.toString())
                    .map(s -> s.replace("pokecraft:", ""))
                    .filter(s -> s.startsWith(string))
                    .forEach(s -> builder.suggest(s));
        } else {
            var json = string.substring(string.indexOf("{"));

        }

        if ("true".startsWith(builder.getRemainingLowerCase())) {
            builder.suggest("true");
        }
        if ("false".startsWith(builder.getRemainingLowerCase())) {
            builder.suggest("false");
        }
        return builder.buildFuture();
    }

    @Override
    public Collection<String> getExamples() {
        return EXAMPLES;
    }
}
