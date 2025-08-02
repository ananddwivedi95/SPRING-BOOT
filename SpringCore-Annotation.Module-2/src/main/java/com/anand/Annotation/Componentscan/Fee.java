package com.anand.Annotation.Componentscan;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSOutput;

@Repository
public class Fee {
    public Fee()
    {
        System.out.println("Fee bean is created");
    }
}
