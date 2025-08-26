package com.anand.application.SwiggySetterDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("OrderDelivery")
public class OrderDelivery {
    private Order order;

    public OrderDelivery()
    {
        System.out.println("OrderDelivery bean is created");
    }
    @Autowired
    void setOrder(Order order)
    {
        this.order= order;
    }
    public Order gertOrder()
    {
        return order;
    }


}
