package com.thepokecraftmod.pokecraft.client.render.rks;

import com.mojang.blaze3d.systems.RenderSystem;
import com.thepokecraftmod.rks.pipeline.UniformBlockUploader;
import org.lwjgl.system.MemoryStack;

public class SharedUniformBlock extends UniformBlockUploader {

    public SharedUniformBlock() {
        super(MAT4F_SIZE , 0);
    }

    public void update() {
        try (var stack = MemoryStack.stackPush()) {
            var sharedInfo = stack.nmalloc(MAT4F_SIZE);
            RenderSystem.getProjectionMatrix().getToAddress(sharedInfo);
            upload(0, MAT4F_SIZE, sharedInfo);
        }
    }
}
