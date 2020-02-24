package com.mahmoud.services;

import java.util.List;

import javax.persistence.Query;

import com.mahmoud.entities.Business;
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
	
	public List<Business> getAllBusinesses() {
		Query query = em.createNamedQuery("GetAllBusinesses");
		return query.getResultList();
	}
	public void updateBusiness(Business business) {
		em.getTransaction().begin();
		em.refresh(business);
		em.getTransaction().commit();
	}
	public List<Service> getAllServicesForABusiness(String email) {
		Query query = em.createNamedQuery("GetAllServicesForABusiness");
		query.setParameter("bEmail", email);
		return query.getResultList();
	}
}
