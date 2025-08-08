package com.anand.application.db.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataBaseOperation {

    @Autowired
    JdbcTemplate jdbcTemplate; //JdbcTemplate is the preedefind class


    public void addEmployeeData()
    {
        String query="INSERT INTO EMPLOYEEDATA Values(3,'jem',334443)";
        jdbcTemplate.update(query);
    }

    public void viewEmployeeData()
    {
        String query="Select * from EMPLOYEEDATA";
      List<EmployeeData> empData= jdbcTemplate.query(query,new BeanPropertyRowMapper<>(EmployeeData.class));
      for(EmployeeData emp:empData)
      {
          System.out.println("ID: "+emp.getId()+",name: "+ emp.getName()+", salary: "+ emp.getSalary());
      }
    }
}
