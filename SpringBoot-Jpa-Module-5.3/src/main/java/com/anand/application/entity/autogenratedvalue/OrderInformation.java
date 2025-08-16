package com.anand.application.entity.autogenratedvalue;

import jakarta.persistence.*;

@Entity
@Table(name = "order_information")
public class OrderInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderid;
    private String name;
    private String address;
    private String payment;
    private Boolean status;


    public OrderInformation()
    {
        System.out.println("orderInformation bean is created");
    }
    public OrderInformation(long orderid, String name, String address, String payment, Boolean status) {
        this.orderid = orderid;
        this.name = name;
        this.address = address;
        this.payment = payment;
        this.status = status;
    }

    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
