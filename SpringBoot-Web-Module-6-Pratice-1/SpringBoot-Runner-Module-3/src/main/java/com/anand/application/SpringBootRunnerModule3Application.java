package com.anand.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootRunnerModule3Application {

    public static void main(String[] args) {

        System.out.println("before the runner loading....");
        ApplicationContext container=SpringApplication.run(SpringBootRunnerModule3Application.class, args);
        System.out.println("after the  runner loading....");
        Product pro1= (Product)container.getBean("product");
        System.out.println(pro1);
    }

}
