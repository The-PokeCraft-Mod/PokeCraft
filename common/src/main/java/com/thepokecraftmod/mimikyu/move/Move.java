package com.thepokecraftmod.mimikyu.move;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.mimikyu.util.ElementType;
import com.thepokecraftmod.pokecraft.api.ExtraCodecs;

import java.util.List;

/**
 * Contains information needed to run a move
 * @param type the {@link ElementType} of the move
 * @param attackCategory the Category. Some moves may physically "touch" the Target and some
 * @param maxPP the maxPP without PPUps that can be achieved.
 * @param basePower the base power for the move.
 * @param accuracy the chance of the move hitting in decimals. (0.25, 0.5, 0.75, 1, etc)
 * @param priority the priority the move runs at.
 * @param isFriendlyMove what team can be targeted by this move. If the move is friendly, Only your team can be picked as a target.
 * @param targets who the move targets. Could target just the target or the target and adjacent opponents
 * @param commands what commands the move does to change the state of the battle.
 */
public record Move(
        ElementType type,
        Category attackCategory,
        int maxPP,
        int basePower,
        double accuracy,
        int priority,
        boolean isFriendlyMove,
        List<Target> targets,
        List<MoveCommandInstance> commands
) {
    public static final Codec<Move> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ExtraCodecs.enumCodec(ElementType.class).fieldOf("type").forGetter(Move::type),
            ExtraCodecs.enumCodec(Category.class).fieldOf("attackCategory").forGetter(Move::attackCategory),
            Codec.INT.fieldOf("maxPP").forGetter(Move::maxPP),
            Codec.INT.fieldOf("basePower").forGetter(Move::basePower),
            Codec.DOUBLE.fieldOf("accuracy").forGetter(Move::accuracy),
            Codec.INT.fieldOf("priority").forGetter(Move::priority),
            Codec.BOOL.fieldOf("isFriendlyMove").forGetter(Move::isFriendlyMove),
            ExtraCodecs.enumCodec(Target.class).listOf().fieldOf("targets").forGetter(Move::targets)
    ).apply(instance, Move::new));

    public Move(ElementType type, Category attackCategory, int maxPP, int basePower, double accuracy, int priority, boolean isFriendlyMove, List<Target> targets) {
        this(type, attackCategory, maxPP, basePower, accuracy, priority, isFriendlyMove, targets, List.of());
    }

    public int ppMaxMultiplier() {
        return maxPP / 5;
    }

    public enum Category {
        PHYSICAL, SPECIAL, STATUS
    }

    public enum Target {
        TARGET, ADJACENT_TO_TARGET, EXTENDED_TARGET, WHOLE_TARGET_TEAM
    }
}
