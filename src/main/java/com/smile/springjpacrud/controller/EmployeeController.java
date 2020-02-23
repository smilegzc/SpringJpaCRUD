package com.smile.springjpacrud.controller;

import com.smile.springjpacrud.entities.Department;
import com.smile.springjpacrud.entities.Employee;
import com.smile.springjpacrud.repository.DepartmentRepository;
import com.smile.springjpacrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> emps = employeeRepository.findAll();
        model.addAttribute("emps", emps);
        return "emp/list";
    }
    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentRepository.findAll();
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEdit(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeRepository.findById(id).get();
        Collection<Department> departments = departmentRepository.findAll();
        model.addAttribute("emp", employee);
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    @PutMapping("/emp")
    public String editEmp(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id) {
        employeeRepository.deleteById(id);
        return "redirect:/emps";
    }
}
