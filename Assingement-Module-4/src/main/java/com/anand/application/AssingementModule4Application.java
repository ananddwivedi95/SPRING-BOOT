package com.anand.application;

import com.anand.application.database.jdbc.CompanyEmployeeDetail;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssingementModule4Application {

    public static void main(String[] args) {
       ApplicationContext container= SpringApplication.run(AssingementModule4Application.class, args);
        CompanyEmployeeDetail emp=container.getBean(CompanyEmployeeDetail.class);
        emp.viewEmployeeDetails(4);
        emp.deleteEmployee(4);
    }

}
