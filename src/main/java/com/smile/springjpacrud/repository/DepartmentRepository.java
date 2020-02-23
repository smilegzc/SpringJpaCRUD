package com.smile.springjpacrud.repository;

import com.smile.springjpacrud.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
