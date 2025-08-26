package com.anand;

import com.anand.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.*")
@SpringBootApplication
public class SpringBootModule1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container= SpringApplication.run(SpringBootModule1Application.class, args);
        System.out.println((Student)container.getBean("student"));
        System.out.println((Student)container.getBean("student1"));
        System.out.println((Student)container.getBean("student2"));
        System.out.println((Student)container.getBean("student3"));
        System.out.println((Product)container.getBean("product"));
    }

    @Bean
    public Student student1()
    {
        System.out.println("Student1 bean is created");
        return new Student();
    }

}
