package com.anand.application.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.Position;
import javax.swing.text.html.parser.Entity;
import java.util.List;


// create the Repository and extends above of them either JpaRepositor or CrudRepository
@Repository
public interface ProductEntityRepository extends JpaRepository<ProductDetails,Integer> {

    @Query("select p from ProductDetails p where p.name= ?1")
    List<ProductDetails> viewByProductName(String name);
}
