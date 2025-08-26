package com.anand.application.Swiggy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDetails {
    private String address;
    private String price;

    @Autowired
    private CartItem cartItem;

    @Autowired
    private CartItem cartItem1;

    @Autowired
    private CartItem cartItem2;

    @Autowired
    private CartItem cartItem3;


    public OrderDetails()
    {
        System.out.println("OrderDetails Bean is Created");
    }

    public OrderDetails(String address, String price, CartItem cartItem) {
        this.address = address;
        this.price = price;
        this.cartItem = cartItem;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public CartItem getCartItem1() {
        return cartItem1;
    }

    public void setCartItem1(CartItem cartItem1) {
        this.cartItem1 = cartItem1;
    }

    public CartItem getCartItem2() {
        return cartItem2;
    }

    public void setCartItem2(CartItem cartItem2) {
        this.cartItem2 = cartItem2;
    }

    public CartItem getCartItem3() {
        return cartItem3;
    }

    public void setCartItem3(CartItem cartItem3) {
        this.cartItem3 = cartItem3;
    }
}
