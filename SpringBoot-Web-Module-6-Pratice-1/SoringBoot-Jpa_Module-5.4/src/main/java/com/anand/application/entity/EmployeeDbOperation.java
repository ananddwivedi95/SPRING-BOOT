package com.anand.application.entity;

import com.anand.application.repository.AddressRepository;
import com.anand.application.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Entity;

import java.util.Optional;

@Component
public class EmployeeDbOperation {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressRepository addressRepository;

    public void addEmployee()
    {
        //Address object
        AddressEntity address = new AddressEntity();
        address.setCity("Bangalore");
        address.setPinCode(560001);
        address.setCountry("India");



        EmployeeEntity employee = new EmployeeEntity();
        employee.setName("shiv");
        employee.setGender("Male");
        employee.setAddress(address);   //setting address object

        //employeeRepository.save(employee);
        //employeeRepository.deleteById(2);

    }
    public void getInformation()
    {
       Optional<EmployeeEntity> response= employeeRepository.findById(3);
       response.ifPresent(System.out::println);
    }
}
