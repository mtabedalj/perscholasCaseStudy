package com.mahmoud.services;

import java.util.List;

import javax.persistence.Query;

import com.mahmoud.entities.Promotions;
import com.mahmoud.entities.Review;

public class ReviewService extends AbstractServices {
	public ReviewService() {
		super();
	}
	public void addReview(Review review) {
		em.getTransaction().begin();
		em.persist(review);
		em.getTransaction().commit();
	}
  
	public List<Review> getAllReview() {
		Query query = em.createNamedQuery("GetAllReviews");
		return query.getResultList();
	}
	
	public List<Review> GetReviewByEmails(String bEmail, String cEmail) {
		Query query = em.createNamedQuery("GetReviewByEmails");
		query.setParameter("bEmail", bEmail);
		query.setParameter("cEmail", cEmail);

		return query.getResultList();	}
	
	public List<Review> getReviewByBusinessEmail (String bEmail) {
		Query query = em.createNamedQuery("GetReviewByBusinessEmail");
		query.setParameter("bEmail", bEmail);
 		return query.getResultList();	}
	
	public void removeReview(Review review) {
		em.getTransaction().begin();
		em.remove(review);
		em.getTransaction().commit();
	}

 }
