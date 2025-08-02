package com.anand.Annotation.Qualifiers;

import org.springframework.stereotype.Component;

@Component("upiPayment")
public class PaymentType {
    private String paymentType;
    public PaymentType()
    {
        System.out.println("PaymentType bean is created");
    }

    public String getPaymentType()
    {
        return paymentType;
    }
    public void setPaymentType(String paymentType)
    {
        this.paymentType=paymentType;
    }
}
