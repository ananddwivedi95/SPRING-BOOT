package com.anand.Annotation.Qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class PaymentGatway {
    private int amount;
    private String userEmail;

    @Autowired
    @Qualifier("upiPayment")
    private PaymentType paymentType;

    @Autowired
    @Qualifier("creditCardPayment")
    private PaymentType paymentType1;

    @Autowired
    @Qualifier("debitCardPayment")
    private PaymentType paymentType2;

    public PaymentGatway()
    {
        System.out.println("PaymentGatway bean is created");
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
