package com.thepokecraftmod.mimikyu.move;

/**
 * Stores data needed to execute a {@link MoveCommand}
 * @param command the command you want to run
 * @param args the arguments to give the command
 */
public record MoveCommandInstance(MoveCommand command, Object... args) {}
