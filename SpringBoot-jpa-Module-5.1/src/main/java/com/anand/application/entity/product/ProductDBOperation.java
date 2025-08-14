package com.anand.application.entity.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDBOperation {

    @Autowired
    ProductDetailsRepository productDetailsRepository;
    public void saveAllProductDetails(ArrayList<ProductDetails> productDetails)
    {
        productDetailsRepository.saveAll(productDetails);
    }
    public void findAllProductDetails()
    {
       List<ProductDetails> response= productDetailsRepository.findAll();
       System.out.println(response);
    }
}
