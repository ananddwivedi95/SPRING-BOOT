package com.anand.application;

import com.anand.application.entity.autogenratedvalue.OrderDBOperation;
import com.anand.application.entity.autogenratedvalue.OrderInformation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(Application.class, args);
        OrderDBOperation order = container.getBean(OrderDBOperation.class);
        OrderInformation orderInfo = new OrderInformation();
        orderInfo.setAddress("pune");
        orderInfo.setName("Anand");
        orderInfo.setPayment("Cash");
        orderInfo.setStatus(true);
        order.addOrderInformation(orderInfo);
    }

}
