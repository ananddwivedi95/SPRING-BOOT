package com.anand.application.nativesql.entity;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductJpaRepository extends JpaRepository<Product1, Integer> {

    @Query(value="Select * from Product1 where product_name=?1 ",nativeQuery = true)
    List<Product1> findByProductName(String name);

    @Query(value="Select * from Product1 where product_name=?1 and product_price=?2 ",nativeQuery = true)
    List<Product1> findByProductNameAndProductPrice(String name,String price);

    //name parameter

    @Query(value="Select * from product1 where product_name=:productName",nativeQuery=true)
    List<Product1> findByProductNameUsingNameParameter(String productName);

    @Query(value="Select * from Product1 where product_name=:name and product_price< :price ",nativeQuery = true)
    List<Product1> findByProductNameAndProductPriceUsingNameParameter(String name, String price);

    @Modifying
    @Transactional
    @Query(value = "insert into Product1 values (:id,:productName,:productPrice,:productQuentity)",nativeQuery = true)
    public void  addProduct(int id,String productName,String productPrice,String productQuentity);
}
