package com.anand.Application;

import com.anand.Application.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Assignment1Module2Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext container=SpringApplication.run(Assignment1Module2Application.class, args);
       Student std1= (Student)container.getBean("student");
        System.out.println(std1);
    }

}
