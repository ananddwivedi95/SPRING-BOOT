package com.anand.application;

import com.anand.application.jpql.entity.Employee1;
import com.anand.application.jpql.entity.EmployeeDBOperation;
import com.anand.application.nativesql.entity.Product1;
import com.anand.application.nativesql.entity.ProductDBOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext container=SpringApplication.run(Application.class, args);
        EmployeeDBOperation emp1= container.getBean(EmployeeDBOperation.class);
        ProductDBOperation prod1=container.getBean(ProductDBOperation.class);

        ArrayList<Employee1> empList=new ArrayList<>();
        empList.add(new Employee1(11,"shiva","ab@gmail.com","545854554","pune","99999"));
        empList.add(new Employee1(12,"sem","ab@gmail.com","545854554","hyderabad","99999"));
        empList.add(new Employee1(30,"shiva","ab@gmail.com","545854554","noida","99999"));
        empList.add(new Employee1(24,"raam","ab@gmail.com","545854554","indore","99999"));
        empList.add(new Employee1(15,"krishna","ab@gmail.com","545854554","kerala","99999"));
        empList.add(new Employee1(46,"jai","ab@gmail.com","545854554","bangalore","99999"));
        empList.add(new Employee1(70,"thamoes","ab@gmail.com","545854554","gurugram","99999"));
        empList.add(new Employee1(80,"jems","ab@gmail.com","545854554","switzerland","99999"));


        emp1.addAllDetails(empList);
        emp1.viewAllEmployee();
        emp1.viewAllEmployeeName();


        ArrayList<Product1> details= new ArrayList<>();
        details.add(new Product1(1,"Laptop","10000","10"));
        details.add(new Product1(2,"Mobile","20000","20"));
        details.add(new Product1(3,"Tablet","30000","30"));
        details.add(new Product1(4,"Headphone","40000","40"));
        details.add(new Product1(5,"Watch","50000","50"));
        details.add(new Product1(6,"Camera","60000","60"));


        prod1.addAllProduct(details);
        prod1.FindByProductName("watch");
        prod1.findByProductNameAndProductPrice("watch","50000");
        prod1.findByProductNameUsingNameParameter("Laptop");
        prod1.findByProductNameAndProductPriceUsingNameParameter("Laptop","100000");
        prod1.addProduct();
    }

}
