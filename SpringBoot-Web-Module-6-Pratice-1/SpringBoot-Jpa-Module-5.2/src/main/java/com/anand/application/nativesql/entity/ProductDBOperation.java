package com.anand.application.nativesql.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDBOperation {
    @Autowired
    ProductJpaRepository productJpaRepository;

  public void addAllProduct(ArrayList<Product1> product1s)
    {
        productJpaRepository.saveAll(product1s);
        System.out.println("successfully add");
    }
    public void FindByProductName(String name)
    {
        List<Product1> response=productJpaRepository.findByProductName(name);
        response.forEach(System.out::println);
    }

    public void findByProductNameAndProductPrice(String name,String price )
    {
       List<Product1> response= productJpaRepository.findByProductNameAndProductPrice(name,price);
       response.forEach(System.out::println);
    }
    public void findByProductNameUsingNameParameter(String productName)
    {
        List<Product1> response=productJpaRepository.findByProductNameUsingNameParameter(productName);
        response.forEach(System.out::println);
    }

    public void findByProductNameAndProductPriceUsingNameParameter(String name,String price)
    {
        List<Product1> response=productJpaRepository.findByProductNameAndProductPriceUsingNameParameter(name,price);
        response.forEach(System.out::println);
    }
    public void addProduct()
    {
        productJpaRepository.addProduct(1110111,"Laptop","1000000","10");
    }
}
