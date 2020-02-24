package com.mahmoud.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Review
 *
 */
@Entity
@NamedQueries({ @NamedQuery(query = "Select r from Review r", name = "GetAllReviews"),
	@NamedQuery(query = "Select r from Review r where r.id = :rId", name = "GetReviewById") })
public class Review implements Serializable {

	   
	@Id
	private int id;
	private String revContent;
	private static final long serialVersionUID = 1L;

	public Review() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getRevContent() {
		return this.revContent;
	}

	public void setRevContent(String revContent) {
		this.revContent = revContent;
	}
   
}
