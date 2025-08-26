package com.anand.duplicateconfigurationclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configurationclass1 {

    @Bean
    public College1 college1()
    {
        System.out.println("college 1 is created");
        return new College1("anand","raipur","4548545");
    }

    @Bean
    public College1 college2()
    {
        System.out.println("college 2 is created");
        return new College1("anand","raipur","4548545");
    }
}
