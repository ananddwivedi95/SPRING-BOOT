package com.anand.Annotation.Componentscan;

import org.springframework.stereotype.Component;

@Component
public class Subjects {

    public Subjects()
    {
        System.out.println("Subjects bean is created");
    }
}
