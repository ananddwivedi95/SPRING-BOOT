package com.anand.application.entity.autogenratedvalue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDBOperation {

    @Autowired
    OrderJpaRepository orderJpaRepository;

    public void addOrderInformation(OrderInformation orderInformation){
        orderJpaRepository.save(orderInformation);
    }
}
