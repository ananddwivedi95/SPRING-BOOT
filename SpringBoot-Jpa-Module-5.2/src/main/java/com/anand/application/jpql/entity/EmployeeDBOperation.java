package com.anand.application.jpql.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDBOperation {

    @Autowired
    EmployeeJpaRepository employeeJpaRepository;
    public void addAllDetails(ArrayList<Employee1> employee1)
    {
        employeeJpaRepository.saveAll(employee1);
    }
    public void viewAllEmployee()
    {
       List<Employee1> response=employeeJpaRepository.viewAllemployee();
       response.forEach(System.out::println);
    }
    public void viewAllEmployeeName()
    {
        List<String> response=employeeJpaRepository.viewAllEmployeeName();
        response.forEach(System.out::println);
    }
}
