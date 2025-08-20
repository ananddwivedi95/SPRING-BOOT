package com.anand.application;

import com.anand.application.service.DBOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
       ApplicationContext container=SpringApplication.run(Application.class, args);
       DBOperation dbOperation= container.getBean(DBOperation.class);
        dbOperation.addEmployee();
    }

}
