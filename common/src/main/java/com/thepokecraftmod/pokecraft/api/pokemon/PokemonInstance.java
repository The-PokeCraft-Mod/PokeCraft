package com.thepokecraftmod.pokecraft.api.pokemon;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.mimikyu.HeldItem;
import com.thepokecraftmod.mimikyu.ability.Ability;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;
import com.thepokecraftmod.mimikyu.util.ElementType;
import com.thepokecraftmod.mimikyu.util.StatusCondition;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.ExtraCodecs;
import com.thepokecraftmod.pokecraft.api.battle.move.Moves;
import net.minecraft.FieldsAreNonnullByDefault;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.Tag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * Represents info which defines a unique Pokémon.
 */
// Fuck you, DFU. DFU breaks if a null value is used with optionalFieldOf
@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
@FieldsAreNonnullByDefault
public class PokemonInstance implements PokemonBattleData {
    public static final Codec<PokemonInstance> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ExtraCodecs.UUID.fieldOf("uuid").forGetter(i -> i.uuid),
            FullStatStorage.CODEC.fieldOf("baseStats").forGetter(i -> i.baseStats),
            LevelStorage.CODEC.fieldOf("levelInfo").forGetter(i -> i.levelInfo),
            EffortValues.CODEC.fieldOf("evs").forGetter(i -> i.evs),
            IndividualValues.CODEC.fieldOf("ivs").forGetter(i -> i.ivs),
            ResourceLocation.CODEC.listOf().fieldOf("abilities").forGetter(i -> i.abilities),
            Moves.CODEC.fieldOf("moves").forGetter(i -> i.moves),
            Codec.STRING.optionalFieldOf("nickname").forGetter(i -> Optional.ofNullable(i.nickname)),
            ResourceLocation.CODEC.fieldOf("species").forGetter(i -> i.species),
            ExtraCodecs.enumCodec(StatusCondition.class).optionalFieldOf("condition").forGetter(i -> Optional.ofNullable(i.condition)),
            ResourceLocation.CODEC.listOf().fieldOf("transforms").forGetter(i -> i.transforms) // Transforms. (SkinTransforms, ModelTransforms, StatTransforms, etc)
    ).apply(instance, PokemonInstance::new));
    private final Map<String, Integer> battleStatChanges = new HashMap<>();
    private final Map<Object, Object> customLifetimeValueMap = new HashMap<>();
    private final Map<Object, Object> customTurnValueMap = new HashMap<>();
    public final UUID uuid;
    public final FullStatStorage baseStats;
    public final LevelStorage levelInfo;
    public final EffortValues evs;
    public final IndividualValues ivs;
    public final List<ResourceLocation> abilities;
    public final Moves moves;
    public final List<ResourceLocation> transforms;
    @Nullable
    private String nickname;
    public ResourceLocation species;
    @Nullable
    public StatusCondition condition;

    public PokemonInstance(ResourceLocation species) {
        this();
        this.species = species;
    }

    public PokemonInstance() {
        this.uuid = UUID.randomUUID();
        this.baseStats = new FullStatStorage();
        this.levelInfo = new LevelStorage();
        this.evs = new EffortValues();
        this.ivs = new IndividualValues();
        this.moves = new Moves();
        this.abilities = new ArrayList<>();
        this.transforms = new ArrayList<>();
        this.nickname = null;
        this.species = new ResourceLocation("pokecraft", "wooper");
    }

    public PokemonInstance(UUID uuid, FullStatStorage baseStats, LevelStorage levelInfo, EffortValues evs, IndividualValues ivs, List<ResourceLocation> abilities, Moves moves, Optional<String> nickname, ResourceLocation species, Optional<StatusCondition> condition, List<ResourceLocation> transforms) {
        this.uuid = uuid;
        this.baseStats = baseStats;
        this.levelInfo = levelInfo;
        this.evs = evs;
        this.ivs = ivs;
        this.abilities = abilities;
        this.moves = moves;
        this.nickname = nickname.orElse(null);
        this.species = species;
        this.condition = condition.orElse(null);
        this.transforms = transforms;
    }

    public Tag serializeToNbt() {
        return CODEC.encodeStart(NbtOps.INSTANCE, this).result().orElseThrow();
    }

    public void serializeToByteBuf(FriendlyByteBuf buf) {
        buf.writeWithCodec(NbtOps.INSTANCE, CODEC, this);
    }

    public void setNickname(@Nullable String nickname) {
        this.nickname = nickname;
    }

    /**
     * Gets the current display name of the Pokemon
     *
     * @return if the pokemon has no nickname, Display the form and the species if the form is marked as displayable
     */
    public Component getDisplayName() {
        if (nickname != null) return Component.literal(nickname);
        else return Component.translatable(species.getNamespace() + ".species." + species.getPath() + ".name");
    }

    @Override
    public Map<Object, Object> getTurnValueMap() {
        return customTurnValueMap;
    }

    @Override
    public Map<Object, Object> getLifetimeValueMap() {
        return customLifetimeValueMap;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public List<ElementType> getTyping() {
        return null;
    }

    @Override
    public List<Ability> getAbilities() {
        throw new RuntimeException("Not Implemented");
        /*return abilities.stream()
                .map(abilityId -> (Ability) abilityId)
                .toList();*/
    }

    @Override
    public Optional<HeldItem> getItem() {
        return Optional.empty();
    }

    @Override
    public int getLevel() {
        return levelInfo.level;
    }

    @Override
    public int getSpeed() {
        return baseStats.speed;
    }

    @Override
    public void setSpeed(int value) {

    }

    @Override
    public int getEvasiveness() {
        return baseStats.evasiveness;
    }

    @Override
    public void setEvasiveness(int value) {

    }

    @Override
    public int getAccuracy() {
        return baseStats.accuracy;
    }

    @Override
    public void setAccuracy(int value) {

    }

    @Override
    public int getHp() {
        return baseStats.hp;
    }

    @Override
    public void setHp(int value) {

    }

    @Override
    public int getMaxHp() {
        return baseStats.maxHp;
    }

    @Override
    public void setMaxHp(int value) {

    }

    @Override
    public int getAttack() {
        return baseStats.attack;
    }

    @Override
    public void setAttack(int value) {

    }

    @Override
    public int getDefense() {
        return baseStats.defense;
    }

    @Override
    public void setDefense(int value) {

    }

    @Override
    public int getSpecialAttack() {
        return baseStats.specialAttack;
    }

    @Override
    public void setSpecialAttack(int value) {

    }

    @Override
    public int getSpecialDefense() {
        return baseStats.specialDefense;
    }

    @Override
    public void setSpecialDefense(int value) {

    }

    @Override
    public StatusCondition getStatusCondition() {
        return condition;
    }

    @Override
    public void setStatusCondition(StatusCondition value) {
        this.condition = value;
    }

    @Override
    public void writeAsFullObject(FriendlyByteBuf buf) {
        serializeToByteBuf(buf);
    }

    @Override
    public void writeAsReference(FriendlyByteBuf buf) {
        buf.writeUUID(uuid);
    }
}

