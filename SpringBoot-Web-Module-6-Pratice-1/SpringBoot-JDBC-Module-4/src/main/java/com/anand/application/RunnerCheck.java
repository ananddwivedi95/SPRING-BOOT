package com.anand.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerCheck implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("runner loading before application is start");
    }
}
