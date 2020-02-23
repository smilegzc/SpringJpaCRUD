package com.smile.springjpacrud.repository;

import com.smile.springjpacrud.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
