package com.thepokecraftmod.pokecraft.api.query;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class PokeCraftQueryListener {
    private static final ThreadPoolExecutor THREAD_POOL_EXECUTOR = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
    private static HttpServer server;

    public static void onInitialize() {
        try {
            server = HttpServer.create(new InetSocketAddress("localhost", 25569), 0);
            server.createContext("/party", PokeCraftQueryListener::party);
            server.setExecutor(THREAD_POOL_EXECUTOR);
            server.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void party(HttpExchange httpExchange) {

    }
}
