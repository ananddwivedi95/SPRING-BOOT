package com.anand.application.entity.employee;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer> {

     //jpql
     @Query("select p from EmployeeDetails p where p.city=?1")
     List<EmployeeDetails> viewEmployeeDetailsByCity(String city);

     Optional<List<EmployeeDetails>> findByName(String name);

     List<EmployeeDetails> findByNameAndCity(String name, String city);

     @Transactional
     @Modifying
     @Query(value = "UPDATE Employee_details SET salary = ?2 WHERE id = ?1",nativeQuery = true)
     void updateSalary(int id,String salary);
}
