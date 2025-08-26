package com.anand.Annotation.Componentscan;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product()
    {
        System.out.println("Product bean is created");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
