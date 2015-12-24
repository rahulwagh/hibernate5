package com.hibernate.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "id")
	Long id;

	@Column(name="employee_name")
	String employeeName;

	@Column(name="employee_address")
	String employeeAddress;

	public Employee(Long id, String employeeName, String employeeAddress) {
		this.id = id;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	public Employee() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

}
