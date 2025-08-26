package com.anand.product;

import org.springframework.stereotype.Component;

@Component
public class Product {
    public Product()
    {
        System.out.println("Product bean is created");
    }
}
