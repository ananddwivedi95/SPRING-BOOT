package com.anand.application;

import com.anand.application.db.operations.DataBaseEmployeeManagement;
import com.anand.application.db.operations.DataBaseOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcModuleApplication {

    public static void main(String[] args) {

        System.out.println("Application is before loading.....");
       ApplicationContext conntainer= SpringApplication.run(SpringBootJdbcModuleApplication.class, args);
        System.out.println("Application is start");

        DataBaseOperation dbOperation =(DataBaseOperation)conntainer.getBean("dataBaseOperation");
        dbOperation.addEmployeeData();
        dbOperation.viewEmployeeData();
        DataBaseEmployeeManagement dataBaseEmployeeManagement= conntainer.getBean(DataBaseEmployeeManagement.class);
        dataBaseEmployeeManagement.addEmployeeData(4,"Shiv",4877878);
        System.out.println("------------------------------------------------------");
        dataBaseEmployeeManagement.viewAllEmployeeDetails();

    }

}
