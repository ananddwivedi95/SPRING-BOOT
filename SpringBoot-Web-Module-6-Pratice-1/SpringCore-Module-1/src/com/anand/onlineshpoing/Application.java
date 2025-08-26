package com.anand.onlineshpoing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args)
    {
        ApplicationContext context=  new ClassPathXmlApplicationContext("online_Shoping.xml");
        order order=(order)context.getBean("order");
        System.out.println(order);

    }
}
