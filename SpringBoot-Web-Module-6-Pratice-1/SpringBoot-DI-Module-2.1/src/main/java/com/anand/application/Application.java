package com.anand.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:awsdatabase.properties")
@SpringBootApplication
public class Application {

    public static void main(String[] args)
    {
        ConfigurableApplicationContext conatiner= SpringApplication.run(Application.class, args);
        Student st1= (Student) conatiner.getBean("student");
        Student st2= (Student) conatiner.getBean("student2");
        System.out.println(st1.getAddress());


        Address adr1= (Address) conatiner.getBean("address");
        System.out.println(adr1);


        Address adr2= (Address) conatiner.getBean("address2");
        st2.setAddressRef(adr2);
        System.out.println(adr2);
        System.out.println(st2);

        AwsDataBase aws1=(AwsDataBase) conatiner.getBean("awsDataBase");
        System.out.println(aws1);
    }

    @Bean("student2")
  public Student student()
  {
      System.out.println("Student 2 bean is created");
      return new Student("anand","B.Tech",23,"Bangalore");
  }
    @Bean("address2")
    public Address address()
    {
        System.out.println("Student 2 bean is created");
        return new Address("Bangalore","Uttar Pradesh","India","201010");
    }
}
