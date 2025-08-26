package com.anand;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student()
    {
        System.out.println("Student bean is created");
    }
}
