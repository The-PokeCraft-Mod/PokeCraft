package com.thepokecraftmod.pokecraft.client.render.rks;

import com.thepokecraftmod.rks.FileLocator;
import com.thepokecraftmod.rks.model.Model;
import com.thepokecraftmod.rks.pipeline.Shader;
import com.thepokecraftmod.rks.scene.FullMesh;

import java.util.function.Function;

public record ModelContext(
        FullMesh renderObject,
        Model model,
        Function<String, Shader> shaderFunction,
        FileLocator locator,
        MaterialUploader uploader
) {}
