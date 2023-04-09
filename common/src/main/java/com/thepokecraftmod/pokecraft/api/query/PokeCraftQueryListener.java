package com.thepokecraftmod.pokecraft.api.query;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class PokeCraftQueryListener {

    private static HttpServer server;

    public static void onInitialize() {
        try {
            server = HttpServer.create(new InetSocketAddress("localhost", 25569), 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
