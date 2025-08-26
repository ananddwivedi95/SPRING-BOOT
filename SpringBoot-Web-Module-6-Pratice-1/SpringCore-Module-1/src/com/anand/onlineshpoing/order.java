package com.anand.onlineshpoing;

public class order {
     private String orderNo;
     private cart cart;
     private cart cart1;

    public cart getCart1() {
        return cart1;
    }

    public void setCart1(cart cart1) {
        this.cart1 = cart1;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public cart getCart() {
        return cart;
    }

    public void setCart(cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "order{" +
                "orderNo='" + orderNo + '\'' +
                ", cart=" + cart +
                '}';
    }
}
