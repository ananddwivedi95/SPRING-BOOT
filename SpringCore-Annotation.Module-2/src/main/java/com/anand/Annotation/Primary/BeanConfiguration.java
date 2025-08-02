package com.anand.Annotation.Primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.anand.Annotation.Primary")
public class BeanConfiguration {


    @Primary
    @Bean
    public PaymentType getPaymentType()
    {
        System.out.println("upiPayment type bean is created");
        return new PaymentType();
    }


    @Bean
    public PaymentType getPaymentType1()
    {
        System.out.println("creditPayment type bean is created");
        return new PaymentType();
    }

    @Bean
    public PaymentType getPaymentType2()
    {
        System.out.println("debitPayment type bean is created");
        return new PaymentType();
    }
}
