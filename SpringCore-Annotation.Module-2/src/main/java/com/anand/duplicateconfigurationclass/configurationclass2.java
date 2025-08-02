package com.anand.duplicateconfigurationclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configurationclass2 {

    @Bean
    public College2 college21()
    {
        System.out.println("college 3 is created");
        return new College2("shiv","kailesh","4548545");
    }

    @Bean
    public College2 college22()
    {
        System.out.println("college 4 is created");
        return new College2("parvati","kailesh","4548545");
    }
}
