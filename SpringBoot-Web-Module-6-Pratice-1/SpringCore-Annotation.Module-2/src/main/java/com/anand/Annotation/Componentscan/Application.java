package com.anand.Annotation.Componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args)
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Product product=(Product) context.getBean("product");
        System.out.println(product);
    }
}
