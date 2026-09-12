package com.jsp.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.employee.entity.Department;

public interface DepartmentRepository  extends JpaRepository<Department, Integer>{

}
