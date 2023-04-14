package com.thepokecraftmod.pokecraft.client.render.rks;

import com.thepokecraftmod.rks.storage.AnimatedObjectInstance;
import org.joml.Vector3f;

import java.util.List;

public class PokemonUniformUploader {

    private final MaterialUploader uploader;
    private AnimatedObjectInstance instance;

    public PokemonUniformUploader(MaterialUploader uploader) {
        this.uploader = uploader;
    }

    public void upload(String materialName) {
        var shader = uploader.materials.get(materialName).shader;
        var color = 1;

        shader.uploadVec3fs(
                "lightColors",
                new Vector3f(color, color, color),
                new Vector3f(color, color, color)
        );

        var distance = 400;
        var worldSpacePositions = List.of(
                new Vector3f(-distance, distance, distance),
                new Vector3f(distance, distance, distance)
        ).toArray(Vector3f[]::new);

        shader.uploadVec3fs(
                "lightPositions",
                worldSpacePositions
        );
        uploader.handle(materialName);
    }

    public void setInstance(AnimatedObjectInstance newInstance) {
        this.instance = newInstance;
    }
}
