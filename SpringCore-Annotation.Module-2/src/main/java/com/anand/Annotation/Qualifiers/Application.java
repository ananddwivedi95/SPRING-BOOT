package com.anand.Annotation.Qualifiers;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args)
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(PaymentConfiguration.class);
       // context.getBean("creditCardPayment");
    }
}
