package com.anand.Annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args)
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);

        Student std=(Student)context.getBean("student");
        Address adr=(Address)context.getBean("address");


        adr.setAddress("pryj");
        adr.setPincode("4548545");


        std.setName("anand");
        std.setCource("B.Tech");
        std.setId(123588);

        System.out.println(std);
        System.out.println(std.getAddress());
    }
}
