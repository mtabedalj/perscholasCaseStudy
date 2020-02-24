package com.mahmoud.entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Entity implementation class for Entity: Employees
 *
 */
@Entity
@NamedQueries({ @NamedQuery(query = "Select e from Employees e", name = "GetAllEmployees"),
	@NamedQuery(query = "Select e from Employees e where e.name = :eName", name = "GetEmployeesByName") })
public class Employees implements Serializable {

	@Id
	private int empId;
	private String name;
	private int yearsOfExperince;
	private static final long serialVersionUID = 1L;

	public Employees() {
		super();
	}   
	
	public Employees(int empId, String name, int yearsOfExperince) {
		super();
		this.empId = empId;
		this.name = name;
		this.yearsOfExperince = yearsOfExperince;
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getYearsOfExperince() {
		return yearsOfExperince;
	}
	public void setYearsOfExperince(int yearsOfExperince) {
		this.yearsOfExperince = yearsOfExperince;
	}
	
   
}
