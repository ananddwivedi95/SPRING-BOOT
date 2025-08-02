package com.configuration;

import com.anand.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

    @Bean
    public Student student2()
    {
        System.out.println("Student2 bean is created");
        return new Student();
    }

    @Bean
    public Student student3()
    {
        System.out.println("Student3 bean is created");
        return new Student();
    }
}
