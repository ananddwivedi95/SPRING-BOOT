package com.anand.application.SwiggyInterfaceDI;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicale{

    public Car()
    {
        System.out.println("Car bean is created");
    }
    @Override
    public void drive() {
        System.out.println( "Car is driving");
    }
}
