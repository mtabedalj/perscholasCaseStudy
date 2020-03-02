package com.mahmoud.services;

import java.util.List;

import javax.persistence.NamedQuery;
import javax.persistence.Query;

import com.mahmoud.entities.Employees;
import com.mahmoud.entities.Promotions;
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
	
	public List<Service> getServicesByName(String serviceName) {
		Query query = em.createNamedQuery("GetServiceByName");
		query.setParameter("sName", serviceName);
		return query.getResultList();
	}
	
	public List<Service> getAllServicesbyBusEmial(String businessEmail) {
		Query query = em.createNamedQuery("GetAllServicesbyBusEmial");
		query.setParameter("bEmail", businessEmail);
		return query.getResultList();	}
	
	public void removeService(Service service) {
		em.getTransaction().begin();
		em.remove(service);
		em.getTransaction().commit();
	}
	
 

	
}
