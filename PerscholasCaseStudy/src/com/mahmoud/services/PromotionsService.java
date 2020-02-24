package com.mahmoud.services;

import java.util.List;

import javax.persistence.Query;

import com.mahmoud.entities.Employees;
import com.mahmoud.entities.Promotions;

public class PromotionsService extends AbstractServices {
	public PromotionsService() {
		super();

	}
	public void addPromotion(Promotions promotions) {
		em.getTransaction().begin();
		em.persist(promotions);
		em.getTransaction().commit();
	}
	
	public List<Promotions> getPromotionsByName(String PromotionName) {
		Query query = em.createNamedQuery("GetPromotionsByName");
		query.setParameter("pName", PromotionName);
		return query.getResultList();
	}
	
	public List<Promotions> getAllPromotions() {
		Query query = em.createNamedQuery("GetAllPromotions");
		return query.getResultList();
	}
	
	public void removePromotion(Promotions promotions) {
		em.getTransaction().begin();
		em.remove(promotions);
		em.getTransaction().commit();
	}
}
