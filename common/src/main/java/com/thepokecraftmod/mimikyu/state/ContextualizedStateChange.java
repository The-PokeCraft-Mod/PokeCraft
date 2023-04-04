package com.thepokecraftmod.mimikyu.state;

import com.thepokecraftmod.mimikyu.participant.Participant;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

/**
 * State change with the extra information to tell the client what happened and to know who is the owner of the change
 */
public record ContextualizedStateChange(Participant<?> owner, StateChange stateChange, @Nullable ResourceLocation effectId, String message) {
}
