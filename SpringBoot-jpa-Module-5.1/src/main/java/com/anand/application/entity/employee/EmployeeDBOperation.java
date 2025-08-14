package com.anand.application.entity.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDBOperation {

    @Autowired
    EmployeeDetailsRepository empRepository;
    public void saveAllEmployeeDetails(ArrayList<EmployeeDetails> employeeDetails)
    {
        empRepository.saveAll(employeeDetails);
    }

    public void findById(int id)
    {
        empRepository.findById(id).ifPresent(System.out::println);

    }
    public void findAllDetailsAsc()
    {
        System.out.println("============ Sorted accenting by id  ==============");
        List<EmployeeDetails> empDetails=empRepository.findAll(Sort.by("id").ascending());
        empDetails.forEach(System.out::println);
    }

    public void findAllDetailsDec()
    {
        System.out.println("============ Sorted descending by id  ==============");
        List<EmployeeDetails> empDetails=empRepository.findAll(Sort.by("id").descending());
        empDetails.forEach(System.out::println);
    }

    public void findAllDetailsBYPagination()
    {
        System.out.println("============ Pagination ==============");
        Page<EmployeeDetails> empDetails=empRepository.findAll(Pageable.ofSize(5));
        empDetails.forEach(System.out::println);
    }

    public void getEmployeeDetailsByPageNumber(int pageNo,int recordsPerPage)
    {
        System.out.println("============ Pagination by page number and records  ==============");
        PageRequest pageRequest=PageRequest.of(pageNo,recordsPerPage);
        Page<EmployeeDetails> response=empRepository.findAll(pageRequest);
        response.forEach(System.out::println);
    }
    public void getEmployeeDetailsByPageNumberAndSorting(int pageNo,int recordsPerPage)
    {
        System.out.println("============ Pagination and Sorting by page number and records  ==============");
        //PageRequest pageRequest=PageRequest.of(pageNo,recordsPerPage);
        List<EmployeeDetails> response=empRepository.findAll(PageRequest.of(pageNo,recordsPerPage, Sort.by("id"))).getContent();
        response.forEach(System.out::println);
    }
    public void viewEmployeeDetailsByCity(String city)
    {
        System.out.println("============ View employee details by city  ==============");
        List<EmployeeDetails> response= empRepository.viewEmployeeDetailsByCity(city);
        response.forEach(System.out::println);

    }
    public void viewEmployeeDetailsByName(String name)
    {
        System.out.println("============ View employee details by name  ==============");
        Optional<List<EmployeeDetails>> response = empRepository.findByName(name);

        if (response.isPresent()) {
            response.get().forEach(System.out::println);
        } else {
            System.out.println("No employees found with name: " + name);
        }

    }
    public void viewEmployeeDetailByNameAndCity(String name,String city)
    {
        System.out.println("============ View employee details by name and city  ==============");
       List<EmployeeDetails> result=empRepository.findByNameAndCity(name,city);
        System.out.println(result);
    }
    public void deleteEmployeeDetailById(int id)
    {

        empRepository.deleteById(id);
    }

    //update the salary of the employee where id= 6
    public void UpdateSalary(int id,String salary)
    {
        empRepository.updateSalary(id,salary);
    }
}
