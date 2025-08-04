package com.anand.application.SwiggyInterfaceDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Garrage extends Car {

    @Autowired @Qualifier("car2")
    private Vehicale vehicale;
    public Garrage()
    {
        System.out.println("Garrage bean is created");
    }

    public Garrage(Vehicale vehicale) {
        System.out.println("Garrage bean is created"+" "+vehicale.getClass());
    }

    @Override
    public void drive() {
        System.out.println("vehicle is driving");
    }

    public Vehicale getVehicale() {
        return vehicale;
    }

    public void setVehicale(Vehicale vehicale) {
        this.vehicale = vehicale;
    }
}
