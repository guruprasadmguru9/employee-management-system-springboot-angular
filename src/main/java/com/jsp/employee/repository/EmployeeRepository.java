package com.jsp.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.employee.entity.Employee;
import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
