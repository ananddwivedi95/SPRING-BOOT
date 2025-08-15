package com.anand.application.jpql.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee1,Integer> {

    @Query(value = "select e from Employee1 e",nativeQuery = false)
    List<Employee1> viewAllemployee();

    @Query("select e.name from Employee1 e")
    List<String> viewAllEmployeeName();
}
