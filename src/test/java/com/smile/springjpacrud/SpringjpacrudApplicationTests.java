package com.smile.springjpacrud;

import com.smile.springjpacrud.repository.DepartmentRepository;
import com.smile.springjpacrud.repository.EmployeeRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringjpacrudApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;
    @Test
    void contextLoads() {
        System.out.println(employeeRepository.findAll());
    }

}
