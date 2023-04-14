package com.thepokecraftmod.pokecraft.client.render.rks;

import com.thepokecraftmod.rks.FileLocator;
import com.thepokecraftmod.rks.model.Model;
import com.thepokecraftmod.rks.pipeline.Shader;
import com.thepokecraftmod.rks.scene.MultiRenderObject;
import com.thepokecraftmod.rks.scene.RenderObject;

import java.util.function.Function;

public record FullModel<T extends RenderObject>(
        MultiRenderObject<T> renderObject,
        Model model,
        Function<String, Shader> shaderFunction,
        FileLocator locator,
        MaterialUploader uploader
) {}
