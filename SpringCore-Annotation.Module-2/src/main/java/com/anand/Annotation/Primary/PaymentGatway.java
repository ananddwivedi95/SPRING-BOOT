package com.anand.Annotation.Primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatway {


    @Autowired
    //@Qualifier("getPaymentType")
    private PaymentType paymentType;


    @Autowired
    //@Qualifier("getPaymentType1")
    private PaymentType getPaymentType1;


    @Autowired
    //@Qualifier("getPaymentType2")
    private PaymentType paymentType2;

    public PaymentGatway()
    {
        System.out.println("PaymentGatway bean is created");
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }


}
