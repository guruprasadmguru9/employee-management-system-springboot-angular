package com.jsp.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	private String email;
	
	@ManyToOne
	private Department department;
	
	
	public Employee(String name , long phone , String email , Department department) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.department = department;
	}
	
	
	
}
