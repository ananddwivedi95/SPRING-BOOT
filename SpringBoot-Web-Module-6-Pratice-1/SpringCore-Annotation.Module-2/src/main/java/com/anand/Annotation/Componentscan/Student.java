package com.anand.Annotation.Componentscan;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student()
    {
        System.out.println("Student bean is created");
    }
}
