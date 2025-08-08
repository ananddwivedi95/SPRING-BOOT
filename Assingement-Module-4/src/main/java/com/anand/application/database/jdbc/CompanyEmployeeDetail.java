package com.anand.application.database.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyEmployeeDetail {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //select Query
     public void viewEmployeeDetails(int id)
     {
         String query="SELECT * FROM employeedata where ID=?";
        List<Employee> emp=jdbcTemplate.query(query,new BeanPropertyRowMapper<>(Employee.class),id);
        for(Employee e:emp)
        {
            System.out.println("id :"+e.getId()+" name :"+e.getName()+" salary :"+e.getSalary());
        }

     }

     //for delete data from a table
     public void deleteEmployee(int id)
     {
         String query="DELETE From employeedata where ID=?";
         jdbcTemplate.update(query,id);
     }
}
