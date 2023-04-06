package com.thepokecraftmod.pokecraft.fabric.datagen.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUpdater {
    private static final MessageDigest HASH_DIGEST;
    private static final Gson HASH_CHECK_GSON = new Gson();
    private static final Gson OUTPUT_GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws IOException {
        try (var files = Files.list(Paths.get("common/src/main/resources/data/pokecraft/species"))) {
            files.filter(Files::isRegularFile)
                    .forEach(path -> {
                        try {
                            var jsonObject = HASH_CHECK_GSON.fromJson(Files.readString(path), JsonObject.class);
                            jsonObject.remove("hash");

                            var hash = new String(HASH_DIGEST.digest(HASH_CHECK_GSON.toJson(jsonObject).getBytes()), StandardCharsets.UTF_8); // Done to make sure the formatting is always the same. Plus Mojang gives us a JsonElement not a file
                            jsonObject.add("hash", new JsonPrimitive(hash));
                            Files.delete(path);
                            Files.writeString(path, OUTPUT_GSON.toJson(jsonObject));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
    }

    static {
        try {
            HASH_DIGEST = MessageDigest.getInstance("SHA3-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
