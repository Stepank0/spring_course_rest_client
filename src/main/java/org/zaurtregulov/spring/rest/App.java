package org.zaurtregulov.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zaurtregulov.spring.rest.configuration.MyConfig;
import org.zaurtregulov.spring.rest.entity.Employee;

import java.util.List;


public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        for(Employee emp: allEmployees){
//            System.out.println(emp);
//        }

//        Employee empById = communication.getEmployee(5);
//        System.out.println(empById);

//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 650);
//        communication.saveEmployee(emp);

//        Employee emp = new Employee(10 ,"Sveta", "Sokolova", "IT", 1150);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(10);
    }
}
