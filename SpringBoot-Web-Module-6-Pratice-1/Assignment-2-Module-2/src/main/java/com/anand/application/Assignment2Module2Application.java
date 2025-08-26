package com.anand.application;

import com.anand.application.propertiessources.AwsDatabase;
import com.anand.application.propertiessources.EmailCradentials;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Assignment2Module2Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext container=SpringApplication.run(Assignment2Module2Application.class, args);
        AwsDatabase aws1=(AwsDatabase) container.getBean("awsDatabase");
        System.out.println(aws1);

        EmailCradentials eml1=(EmailCradentials) container.getBean("emailCradentials");
        System.out.println(eml1);
    }

}
