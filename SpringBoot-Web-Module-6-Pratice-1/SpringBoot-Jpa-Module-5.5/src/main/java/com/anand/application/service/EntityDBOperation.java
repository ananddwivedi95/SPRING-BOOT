package com.anand.application.service;

import com.anand.application.entity.AddressEntity;
import com.anand.application.entity.EmployeeEntity;
import com.anand.application.repository.AddressRepository;
import com.anand.application.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EntityDBOperation {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee()
    {
        System.out.println("add address information");

        List<AddressEntity> addressEntity= new ArrayList<>();
        addressEntity.add(new AddressEntity("Bangalore",123456,"India"));
        addressEntity.add(new AddressEntity("Chennai",123456,"India"));
        addressEntity.add(new AddressEntity("mumbai",123456,"India"));


        System.out.println("add employee information");

        EmployeeEntity employeeEntity= new EmployeeEntity();
        employeeEntity.setName("shiv");
        employeeEntity.setGrnder("Male");
        employeeEntity.setAddrrss(addressEntity);

        employeeRepository.save(employeeEntity);

    }
    @Transactional
    public void getInformation()
    {
        Optional<EmployeeEntity> response=employeeRepository.findById(6);
        response.ifPresent(System.out::println);
    }
}
