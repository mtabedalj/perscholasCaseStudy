package com.mahmoud.services;

import java.util.List;

import javax.persistence.Query;

import com.mahmoud.entities.Employees;
import com.mahmoud.entities.Service;

public class ServiceService extends AbstractServices {
	public ServiceService() {
		super();
	}
	
	public void addService(Service service) {
		em.getTransaction().begin();
		em.persist(service);
		em.getTransaction().commit();
	}
	
	 
	
	public List<Service> getAllServices() {
		Query query = em.createNamedQuery("GetAllServices");
		return query.getResultList();
	}
	
	public void removeEmployee(Service service) {
		em.getTransaction().begin();
		em.remove(service);
		em.getTransaction().commit();
	}
	

	
}
