package com.thepokecraftmod.mimikyu.util;

import java.util.List;

public enum ElementType {
    NORMAL(
            List.of(),
            List.of("ROCK", "STEEL"),
            List.of("GHOST")
    ),
    FIRE(
            List.of("GRASS", "ICE", "BUG", "STEEL"),
            List.of("FIRE", "WATER", "ROCK", "DRAGON"),
            List.of()
    ),
    WATER(
            List.of("FIRE", "GROUND", "ROCK"),
            List.of("WATER", "GRASS", "DRAGON"),
            List.of()
    ),
    ELECTRIC(
            List.of("WATER", "FLYING"),
            List.of("ELECTRIC", "GRASS", "DRAGON"),
            List.of("GROUND")
    ),
    GRASS(
            List.of("WATER", "GROUND", "ROCK"),
            List.of("FIRE", "GRASS", "POISON", "FLYING", "BUG", "DRAGON", "STEEL"),
            List.of()
    ),
    ICE(
            List.of("GRASS", "GROUND", "FLYING", "DRAGON"),
            List.of("FIRE", "WATER", "ICE", "STEEL"),
            List.of()
    ),
    FIGHTING(
            List.of("NORMAL", "ICE", "ROCK", "DARK", "STEEL"),
            List.of("POISON", "FLYING", "PSYCHIC", "BUG", "FAIRY"),
            List.of("GHOST")
    ),
    POISON(
            List.of("GRASS", "FAIRY"),
            List.of("POISON", "GROUND", "ROCK", "GHOST"),
            List.of("STEEL")
    ),
    GROUND(
            List.of("FIRE", "ELECTRIC", "POISON", "ROCK", "STEEL"),
            List.of("GRASS", "BUG"),
            List.of("FLYING")
    ),
    FLYING(
            List.of("GRASS", "FIGHTING", "BUG"),
            List.of("ELECTRIC", "ROCK", "STEEL"),
            List.of()
    ),
    PSYCHIC(
            List.of("FIGHTING", "POISON"),
            List.of("PSYCHIC", "STEEL"),
            List.of("DARK")
    ),
    BUG(
            List.of("GRASS", "PSYCHIC", "DARK"),
            List.of("FIRE", "FIGHTING", "POISON", "FLYING", "GHOST", "STEEL", "FAIRY"),
            List.of()
    ),
    ROCK(
            List.of("FIRE", "ICE", "FLYING", "BUG"),
            List.of("FIGHTING", "GROUND", "STEEL"),
            List.of()
    ),
    GHOST(
            List.of("PSYCHIC", "GHOST"),
            List.of("DARK"),
            List.of("NORMAL")
    ),
    DRAGON(
            List.of("DRAGON"),
            List.of("STEEL"),
            List.of("FAIRY")
    ),
    DARK(
            List.of("PSYCHIC", "GHOST"),
            List.of("FIGHTING", "DARK", "FAIRY"),
            List.of()
    ),
    STEEL(
            List.of("ICE", "ROCK", "FAIRY"),
            List.of("FIRE", "WATER", "ELECTRIC", "STEEL"),
            List.of()
    ),
    FAIRY(
            List.of("FIGHTING", "DRAGON", "DARK"),
            List.of("FIRE", "POISON", "STEEL"),
            List.of()
    ),
    UNKNOWN(
            List.of(),
            List.of(),
            List.of()
    );

    private final List<String> superEffectiveAgainst;
    private final List<String> notVeryEffective;
    private final List<String> doNothingAgainst;

    ElementType(List<String> superEffective, List<String> notVeryEffective, List<String> doNothing) {
        this.superEffectiveAgainst = superEffective;
        this.notVeryEffective = notVeryEffective;
        this.doNothingAgainst = doNothing;
    }

    public List<ElementType> getSuperEffectiveAgainst() {
        return superEffectiveAgainst.stream()
                .map(ElementType::valueOf)
                .toList();
    }

    public List<ElementType> getNotVeryEffective() {
        return notVeryEffective.stream()
                .map(ElementType::valueOf)
                .toList();
    }

    public List<ElementType> getDoNothingAgainst() {
        return doNothingAgainst.stream()
                .map(ElementType::valueOf)
                .toList();
    }

    public boolean anyMatch(List<ElementType> types) {
        return types.stream().anyMatch(elementType -> elementType.equals(this));
    }

    public double getTypeEffectivenessStab(List<ElementType> usedAgainstTypes) {
        var totalEffectiveness = 0d;

        for (var left : usedAgainstTypes) {
            if (getSuperEffectiveAgainst().contains(left)) totalEffectiveness += 2;
            else if (getNotVeryEffective().contains(left)) totalEffectiveness += 0.5;
            else if (getDoNothingAgainst().contains(left)) totalEffectiveness += 0;
            else totalEffectiveness += 1;
        }

        return totalEffectiveness / usedAgainstTypes.size();
    }
}
