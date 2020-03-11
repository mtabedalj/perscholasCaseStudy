package com.mahmoud.services;

import java.util.List;

import javax.persistence.Query;

import com.mahmoud.entities.Business;
import com.mahmoud.entities.Promotions;
import com.mahmoud.entities.Service;

public class BusinessService extends AbstractServices {
	public BusinessService() {
		super();
	}
	
	public void addBusiness(Business business) {
		em.getTransaction().begin();
		em.persist(business);
		em.getTransaction().commit();
	}
	
	public List<Business> getBusinessByEmail(String businessEmail) {
		Query query = em.createNamedQuery("GetBusinessByEmail");
		query.setParameter("bEmail", businessEmail);
		return query.getResultList();
	}
	
	public List<Business> getBusinessByName(String name) {
		Query query = em.createNamedQuery("GetBusinessByName");
		query.setParameter("name", name);
		return query.getResultList();
	}
	
	public List<Business> getAllBusinesses() {
		Query query = em.createNamedQuery("GetAllBusinesses");
		return query.getResultList();
	}
	public void updateBusiness(Business business) {
		em.getTransaction().begin();
		Business b = em.find(Business.class, business.getEmail());
		b.update(business);
		em.getTransaction().commit();
	}
	public List<Service> getAllServicesForABusiness(String email) {
		Query query = em.createNamedQuery("GetAllServicesForABusiness");
		query.setParameter("bEmail", email);
		return query.getResultList();
	}
	
	public void removeBusiness(Business b) {
		em.getTransaction().begin();
		em.remove(b);
		em.getTransaction().commit();
	}
}
