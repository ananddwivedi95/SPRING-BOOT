package com.anand.application.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class DbOperation {

    @Autowired
    ProductEntityRepository repository;
    public DbOperation()
    {
        System.out.println("DbOperation bean is created");
    }

    public void insertData(ProductDetails entity)
    {
        repository.save(entity);
    }
    public void updateData(int id)
    {
        repository.deleteById(id);
    }
    public void insertAllDetails(ArrayList<ProductDetails> detailsArrayList)
    {
        repository.saveAll(detailsArrayList);
    }

    public void viewById(int id)
    {
       Optional<ProductDetails> result =repository.findById(id);
       System.out.println(result);
    }
    public void viewAllDetails()
    {
        List<ProductDetails> details= repository.findAll();
        System.out.println(details);
    }
    public void viewByProductName(String name)
    {
        List<ProductDetails> result= repository.viewByProductName(name);
        System.out.println(result);
    }


}
