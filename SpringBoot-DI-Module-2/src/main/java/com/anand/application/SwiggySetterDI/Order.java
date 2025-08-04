package com.anand.application.SwiggySetterDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
    private String cartId;
    private Product product;

    public Order()
    {
        System.out.println("Order bean is created");
    }

    @Autowired
    void setProduct(Product product)
    {
        this.product=product;

    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Product getProduct() {
        return product;
    }
}
