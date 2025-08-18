package com.anand.application;

import com.anand.application.service.EntityDBOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext container=SpringApplication.run(Application.class, args);
        EntityDBOperation entityDbOperation= container.getBean(EntityDBOperation.class);
        entityDbOperation.addEmployee();
        entityDbOperation.getInformation();
    }

}
