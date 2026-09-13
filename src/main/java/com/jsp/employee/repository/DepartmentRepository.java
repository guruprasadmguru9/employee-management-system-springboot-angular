package com.jsp.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.employee.entity.Department;
import com.jsp.employee.entity.Employee;

public interface DepartmentRepository  extends JpaRepository<Department, Integer>{

	Optional<Department> findByName(String name);
}
