package com.anand.application;

import com.anand.application.entity.AddressDBOperation;
import com.anand.application.entity.EmployeeDbOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
       ApplicationContext container =SpringApplication.run(Application.class, args);
       EmployeeDbOperation employee= container.getBean(EmployeeDbOperation.class);
       employee.addEmployee();
       employee.getInformation();
    }

}
