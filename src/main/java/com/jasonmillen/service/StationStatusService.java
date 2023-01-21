package com.jasonmillen.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

@Service
public class StationStatusService {



    public CompletableFuture<Void> start() {
        System.out.println("starting service");

        CompletableFuture<Void> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            try {
                while (true) {
                    System.out.println("running");
                    Thread.sleep(15000); // Sleep 15 seconds.
                }
            }
            catch (Exception e) {
                System.out.println("Error: " + e);
                completableFuture.complete(null);
            }
        });

        return completableFuture;
    }
}
