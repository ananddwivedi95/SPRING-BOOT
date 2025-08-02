package com.anand.Annotation.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

    @Bean("student1")
  public Student student()
  {
      System.out.println("bean 1 is created");
      return new Student("Anand", 23, "BTech", "CSE", "IIT", "<EMAIL>");
  }
    @Bean("student2")
    public Student student2()
    {
        System.out.println("bean 2 is created");
        return new Student("shiv", 23, "BTech", "CSE", "IIT", "<EMAIL>");
    }
    @Bean("student3")
    public Student student3()
    {
        System.out.println("bean 3 is created");
        return new Student("ram", 23, "BTech", "CSE", "IIT", "<EMAIL>");
    }
    @Bean("student1")
    public Student student4()
    {
        System.out.println("bean 4 is created");
        return new Student("raam", 23, "BTech", "CSE", "IIT", "<EMAIL>");
    }

}
