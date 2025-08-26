package com.anand.application.db.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataBaseEmployeeManagement {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addEmployeeData(int id,String name,double salary)
    {
        jdbcTemplate.update("INSERT INTO EMPLOYEEDATA VALUES (? ,? ,?)",id ,name,salary);

    }

    public void viewAllEmployeeDetails()
    {
        String query="Select * from EmployeeData";
        List<EmployeeData> allEmpData=jdbcTemplate.query(query, new BeanPropertyRowMapper<>(EmployeeData.class));
        for(EmployeeData empData:allEmpData)
        {
            System.out.println("ID: "+empData.getId()+",name: "+ empData.getName()+", salary: "+ empData.getSalary());
        }
    }
}
