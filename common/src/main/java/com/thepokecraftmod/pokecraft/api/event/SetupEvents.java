package com.thepokecraftmod.pokecraft.api.event;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;

import java.util.function.Consumer;

public class SetupEvents {
    public static final Event<Consumer<CommandDispatcher<CommandSourceStack>>> REGISTER_COMMANDS = new Event<Consumer<CommandDispatcher<CommandSourceStack>>>(Event::consumerCallback, Consumer[]::new);
}
