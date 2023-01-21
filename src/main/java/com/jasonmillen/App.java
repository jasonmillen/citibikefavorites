package com.jasonmillen;

import com.jasonmillen.service.StationStatusService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CompletableFuture;

@SpringBootApplication
public class App  implements CommandLineRunner {

    final StationStatusService stationStatusService;

    public App(StationStatusService stationStatusService) {
        this.stationStatusService = stationStatusService;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        System.out.println("HERE");

        CompletableFuture<Void> completableFuture = stationStatusService.start();
        completableFuture.get();

        // TODO: Read citi bike json data from url.
        // java: how to read jason from url: https://www.baeldung.com/java-read-json-from-url
        // citibike json data: http://gbfs.citibikenyc.com/gbfs/gbfs.json
    }
}
