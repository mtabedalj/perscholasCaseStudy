package com.mahmoud.services;

import java.util.List;

import javax.persistence.Query;

import com.mahmoud.entities.BusinessHours;
import com.mahmoud.entities.Promotions;
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
	
	public void removeBusinessHours(BusinessHours businessHours) {
		em.getTransaction().begin();
		em.remove(businessHours);
		em.getTransaction().commit();
	}
	public List<BusinessHours> getAllBusinessHoursbyBusEmial(String businessEmail) {
		Query query = em.createNamedQuery("GetAllBusinessHoursbyBusEmial");
		query.setParameter("bEmail", businessEmail);
		return query.getResultList();	}
	

	
	//you still have to implement the update method
 }