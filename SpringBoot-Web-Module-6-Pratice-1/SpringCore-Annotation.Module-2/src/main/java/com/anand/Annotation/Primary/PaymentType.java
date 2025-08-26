package com.anand.Annotation.Primary;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class PaymentType {
    private String paymentType;

    public PaymentType()
    {
        System.out.println("PaymentType bean is created");
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
