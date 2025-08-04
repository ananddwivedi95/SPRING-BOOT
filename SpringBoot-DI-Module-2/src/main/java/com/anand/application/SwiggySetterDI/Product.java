package com.anand.application.SwiggySetterDI;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product() {
        System.out.println("Product bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
