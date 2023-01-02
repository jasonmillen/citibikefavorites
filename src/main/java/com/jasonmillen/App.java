package com.jasonmillen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App  implements CommandLineRunner {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(App.class, args);
        System.out.println("DONE");
    }

    @Override
    public void run(String... args) {
        System.out.println("HERE");

        // TODO: Read citi bike json data from url.
        // java: how to read jason from url: https://www.baeldung.com/java-read-json-from-url
        // citibike json data: http://gbfs.citibikenyc.com/gbfs/gbfs.json
        
    }
}
