package com.mahmoud.services;

import java.util.List;

import javax.persistence.Query;

import com.mahmoud.entities.BusinessHours;
import com.mahmoud.entities.Service;

public class BusinessHoursServic extends AbstractServices {
	public BusinessHoursServic() {
		super();
	}
	
	public void addBusinessHours(BusinessHours businessHours) {
		em.getTransaction().begin();
		em.persist(businessHours);
		em.getTransaction().commit();
	}
	
	 
	
	public List<BusinessHours> getAllBusinessHours() {
		Query query = em.createNamedQuery("GetAllBusinessHours");
		cleanup();
		return query.getResultList();
	}
	
	//you still have to implement the update method
 }