package com.anand.application.configuration;

import com.anand.application.Swiggy.CartItem;
import com.anand.application.SwiggyInterfaceDI.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

    @Bean
    public CartItem cartItem1()
    {
        System.out.println("CartItem1 Bean is created");
        return new CartItem("1","banana",9);
    }
    @Bean
    public CartItem cartItem2()
    {
        System.out.println("CartItem2 Bean is created");
        return new CartItem("2","Orange",10);
    }
    @Bean
    public CartItem cartItem3()
    {
        System.out.println("CartItem3 Bean is created");
        return new CartItem("3","Mango",11);
    }
    @Bean
    public Car car2()
    {
        System.out.println("car 2 Bean is created");
        return new Car();
    }
}
