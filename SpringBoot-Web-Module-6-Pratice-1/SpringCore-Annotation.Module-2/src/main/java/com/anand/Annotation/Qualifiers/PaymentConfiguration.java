package com.anand.Annotation.Qualifiers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.anand.Annotation.Qualifiers")
public class PaymentConfiguration {


    @Bean
    public PaymentType creditCardPayment()
    {
        System.out.println("credit card payment is created");
        return new PaymentType();
    }



    @Bean
    public PaymentType debitCardPayment()
    {
        System.out.println("debit card payment is created");
        return new PaymentType();
    }
}
