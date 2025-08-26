package com.anand.Annotation.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args)
    {
        /*ApplicationContext context= new FileSystemXmlApplicationContext("Beans.xml");*/

        //creating the Spring container
        ApplicationContext context= new AnnotationConfigApplicationContext(StudentConfiguration.class);

        /*Student student= (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student.getName());
        Student student1= (Student) context.getBean("student1");
        System.out.println(student1);
        System.out.println(student1.getName());
        Student student2= (Student) context.getBean("student2");
        System.out.println(student2);
        System.out.println(student2.getName());*/

        Student student1= (Student) context.getBean("student1");
        System.out.println(student1);
        Student student2= (Student) context.getBean("student2");
        System.out.println(student2);
        Student student3= (Student) context.getBean("student3") ;
        System.out.println(student3);
        Student student4= (Student) context.getBean("student1") ;
        System.out.println(student4);
        System.out.println(student1.equals(student4));

    }
}
