package com.anand.duplicateconfigurationclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args)
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(configurationclass1.class , configurationclass2.class);
        College1 clg1=(College1) context.getBean("college1");
        System.out.println(clg1);

        College2 clg2=(College2) context.getBean("college22");
        System.out.println(clg2);
    }
}
