package com.piyush.LAB05_EmployeeManagementSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="EmployeeManagementSystem")
public class Employee {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="first Name")
	private String firstName;
	
	@Column(name="last Name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	

}
