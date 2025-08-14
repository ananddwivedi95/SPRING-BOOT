package com.anand.application;

import com.anand.application.entity.employee.EmployeeDBOperation;
import com.anand.application.entity.employee.EmployeeDetails;
import com.anand.application.entity.product.ProductDBOperation;
import com.anand.application.entity.product.ProductDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext container=SpringApplication.run(Application.class, args);
        EmployeeDBOperation empDbOperation =container.getBean(EmployeeDBOperation.class);
        ArrayList<EmployeeDetails> empList=new ArrayList<>();
        empList.add(new EmployeeDetails(11,"shiva","ab@gmail.com","545854554","pune","99999"));
        empList.add(new EmployeeDetails(12,"sem","ab@gmail.com","545854554","hyderabad","99999"));
        empList.add(new EmployeeDetails(30,"shiva","ab@gmail.com","545854554","noida","99999"));
        empList.add(new EmployeeDetails(24,"raam","ab@gmail.com","545854554","indore","99999"));
        empList.add(new EmployeeDetails(15,"krishna","ab@gmail.com","545854554","kerala","99999"));
        empList.add(new EmployeeDetails(46,"jai","ab@gmail.com","545854554","bangalore","99999"));
        empList.add(new EmployeeDetails(70,"thamoes","ab@gmail.com","545854554","gurugram","99999"));
        empList.add(new EmployeeDetails(80,"jems","ab@gmail.com","545854554","switzerland","99999"));

        empDbOperation.saveAllEmployeeDetails(empList);
        empDbOperation.findAllDetailsAsc();
        empDbOperation.findAllDetailsDec();
        empDbOperation.findAllDetailsBYPagination();
        empDbOperation.getEmployeeDetailsByPageNumber(1,3);
        empDbOperation.getEmployeeDetailsByPageNumberAndSorting(1,8);
        empDbOperation.findById(1055);
        empDbOperation.viewEmployeeDetailsByCity("pune");
        empDbOperation.viewEmployeeDetailsByName("shiva");
        empDbOperation.viewEmployeeDetailByNameAndCity("shiv","pune");
        empDbOperation.deleteEmployeeDetailById(3);
        empDbOperation.UpdateSalary(6,"155555555");

        ProductDBOperation container2=container.getBean(ProductDBOperation.class);
        ArrayList<ProductDetails> details= new ArrayList<>();
        details.add(new ProductDetails(1,"Laptop","10000","10"));
        details.add(new ProductDetails(2,"Mobile","20000","20"));
        details.add(new ProductDetails(3,"Tablet","30000","30"));
        details.add(new ProductDetails(4,"Headphone","40000","40"));
        details.add(new ProductDetails(5,"Watch","50000","50"));
        details.add(new ProductDetails(6,"Camera","60000","60"));
        container2.saveAllProductDetails(details);
        container2.findAllProductDetails();
        //empDbOperation.saveEmployeeDetails(new EmployeeDetails(1,"shiv","ab@gmail.com","545854554","pune"));
    }

}
