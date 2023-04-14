package com.thepokecraftmod.pokecraft.client.render.rks;

import net.minecraft.resources.ResourceLocation;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarFile;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RepoFs implements Closeable {
    private final TarFile tarFile;
    protected final Map<ResourceLocation, TarArchiveEntry> entries = new HashMap<>();

    public RepoFs(String namespace, TarFile tarFile) {
        this.tarFile = tarFile;

        for (var entry : tarFile.getEntries()) {
            entries.put(new ResourceLocation(namespace, entry.getName()), entry);
        }
    }

    public byte[] getResource(ResourceLocation id) {
        try {
            return tarFile.getInputStream(entries.get(id)).readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException("Failed to read resource " + id, e);
        }
    }

    @Override
    public void close() throws IOException {
        tarFile.close();
    }
}
