package com.mahmoud.services;

import java.util.List;

import javax.persistence.Query;

 import com.mahmoud.entities.Employees;

public class EmployeesService extends AbstractServices {
	public EmployeesService() {
		super();
	}
	
	public void addEmployee(Employees employees) {
		em.getTransaction().begin();
		em.persist(employees);
		em.getTransaction().commit();
	}
	
	public List<Employees> getEmployeesByName(String EmployeeName) {
		Query query = em.createNamedQuery("GetEmployeesByName");
		query.setParameter("eName", EmployeeName);
		return query.getResultList();
	}
	
	public List<Employees> getAllBusinesses() {
		Query query = em.createNamedQuery("GetAllEmployees");
		return query.getResultList();
	}
	
	public void removeEmployee(Employees employees) {
		em.getTransaction().begin();
		em.remove(employees);
		em.getTransaction().commit();
	}
	
}
