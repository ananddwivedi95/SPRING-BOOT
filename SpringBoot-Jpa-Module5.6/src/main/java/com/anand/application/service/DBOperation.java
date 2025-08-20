package com.anand.application.service;

import com.anand.application.entity.Department;
import com.anand.application.entity.Employee;
import com.anand.application.repository.DepartmentRepository;
import com.anand.application.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBOperation {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public void addEmployee() {
        Department dept= new Department("HR");
        departmentRepository.save(dept);
        Department dept1= new Department("Sales");
        departmentRepository.save(dept1);
        Department dept2= new Department("IT");
        departmentRepository.save(dept2);
        Department dept3= new Department("Management");
        departmentRepository.save(dept3);
        Department dept4= new Department("Developers");
        departmentRepository.save(dept4);
        Department dept5= new Department("DEVOPS");
        departmentRepository.save(dept5);


        Employee emp= new Employee("anand","abc@gmail.com","21563545","Male",dept4);
        employeeRepository.save(emp);
    }
}
