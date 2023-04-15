package com.thepokecraftmod.pokecraft.client.render.rks;

import com.mojang.blaze3d.systems.RenderSystem;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.rks.RKS;
import com.thepokecraftmod.rks.model.texture.TextureType;
import com.thepokecraftmod.rks.pipeline.Shader;
import com.thepokecraftmod.rks.pipeline.UniformBlockReference;
import com.thepokecraftmod.rks.scene.FullMesh;
import com.thepokecraftmod.rks.storage.AnimatedObjectInstance;
import com.thepokecraftmod.rks.storage.ObjectInstance;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import org.apache.commons.compress.archivers.tar.TarFile;
import org.jetbrains.annotations.NotNull;
import org.tukaani.xz.XZInputStream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;

public class PokeCraftRKSImpl {
    private static final PokeCraftRKSImpl INSTANCE = new PokeCraftRKSImpl();
    public static final ResourceLocation MODEL_REPOSITORY = PokeCraft.id("repositories/pokemon/models.fsrepo");
    public static final ResourceLocation ANIMATION_REPOSITORY = PokeCraft.id("repositories/pokemon/animations.fsrepo");
    private static final List<String> ERRORS = new ArrayList<>(); // TODO: popup menu
    private final RKS rks = new RKS(RenderSystem::assertOnRenderThread);
    private final SharedUniformBlock sharedUniforms = new SharedUniformBlock();
    public final ThreadPoolExecutor modelLoadingThreads = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    public final Map<String, Shader> shaders = new HashMap<>();
    public final Map<String, Function<String, Shader>> shadingMethods = new HashMap<>();
    private final long globalAnimationTimer = System.currentTimeMillis();
    private final Map<ResourceLocation, RepoFs> openRepositories = new HashMap<>();

    public void render() {
        sharedUniforms.update();
        rks.render((System.currentTimeMillis() - globalAnimationTimer) / 1000d);
        rks.objectManager.reset();
    }

    public void addToFrame(AnimatedObjectInstance instance) {
        rks.objectManager.add(instance.object, instance);
    }

    public void onInitialize() {
        var resourceManager = Minecraft.getInstance().getResourceManager();

        shaders.put("default_pokemon", new Shader.Builder().shader(getShader(PokeCraft.id("shaders/pokemon.vsh")), getShader(PokeCraft.id("shaders/pokemon.fsh")))
                .uniform(new UniformBlockReference("SharedInfo", 0))
                .uniform(new UniformBlockReference("InstanceInfo", 1))
                .texture(TextureType.ALBEDO)
                .texture(TextureType.NORMALS)
                .texture(TextureType.METALNESS)
                .texture(TextureType.ROUGHNESS)
                .texture(TextureType.AMBIENT_OCCLUSION)
                .texture(TextureType.EMISSIVE)
                .build()
        );

        shadingMethods.put("pokemon", s -> shaders.get("default_pokemon"));

        try {
            if (resourceManager.getResource(MODEL_REPOSITORY).isEmpty())
                PokeCraftRKSImpl.ERRORS.add("Missing Model Repo");
            else
                openRepositories.put(MODEL_REPOSITORY, new RepoFs(PokeCraft.MOD_ID, new TarFile(new XZInputStream(resourceManager.open(MODEL_REPOSITORY)).readAllBytes()))); // FIXME: this means the entire archive is in memory. There has to be something we can do...
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onResourceManagerReload() {
        modelLoadingThreads.purge();
        shaders.clear();
        shadingMethods.clear();
        rks.objectManager.reset();
        openRepositories.values().forEach(is -> {
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        openRepositories.clear();
        onInitialize();
    }

    @NotNull
    public RepoFs getRepo(ResourceLocation location) {
        if (openRepositories.containsKey(location)) return openRepositories.get(location);
        else throw new RuntimeException("Fs Repo does not exist \"" + location + "\"");
    }

    private static String getShader(ResourceLocation id) {
        var resourceManager = Minecraft.getInstance().getResourceManager();

        try (var is = resourceManager.open(id)) {
            return new String(is.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PokeCraftRKSImpl getInstance() {
        return INSTANCE;
    }
}
