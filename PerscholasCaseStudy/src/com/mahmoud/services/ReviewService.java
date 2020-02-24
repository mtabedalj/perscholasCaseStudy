package com.mahmoud.services;

import java.util.List;

import javax.persistence.Query;

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
}
