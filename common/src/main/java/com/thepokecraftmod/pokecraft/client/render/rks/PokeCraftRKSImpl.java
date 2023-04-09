package com.thepokecraftmod.pokecraft.client.render.rks;

import com.thepokecraftmod.rks.RKS;
import com.thepokecraftmod.rks.scene.AnimatedMeshObject;
import com.thepokecraftmod.rks.scene.MultiRenderObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;

public class PokeCraftRKSImpl {
    private static final RKS RKS = new RKS();
    private static final ThreadPoolExecutor MODEL_LOADING_THREADS = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    private static final Queue<Function<Runnable, AnimatedMeshObject>> UPLOAD_QUEUE = new ConcurrentLinkedQueue<>();
    private static final List<MultiRenderObject<AnimatedMeshObject>> UNUSED_MODELS = new ArrayList<>(); // Should be checked every 30 seconds (configurable) and dropped
    private static final long GLOBAL_ANIMATION_TIMER = System.currentTimeMillis();
    private static double lastFrameTime;

    public static void onInitialize() { // TODO: call this on client resource reload to reload the renderer
        MODEL_LOADING_THREADS.purge();
        UPLOAD_QUEUE.clear();
        UNUSED_MODELS.clear();
        RKS.objectManager.clearObjects();
        lastFrameTime = System.currentTimeMillis();
    }

    public RKS getInstance() {
        return RKS;
    }
}
