package com.spring.ec2_demo;

import Model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Spring Boot Application Running on AWS Ec2 Test ";
    }

    @GetMapping("/login")
    public String login() {
        return "Login Successful";
    }
    @GetMapping("/load")
    public List<Employee> loadData() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1L, "Ganesh", "Java"));
        employees.add(new Employee(2L, "Ravi", "Spring Boot"));
        employees.add(new Employee(3L, "Kiran", "Microservices"));
        employees.add(new Employee(4L, "John", "AWS"));

        System.out.println("===== Employee Data =====");

        employees.forEach(System.out::println);

        return employees;
    }

   
}
