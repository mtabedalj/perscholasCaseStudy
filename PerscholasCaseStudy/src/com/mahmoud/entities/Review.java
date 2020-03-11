package com.mahmoud.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Review
 *
 */
@Entity
@NamedQueries({ 
	@NamedQuery(query = "Select r from Review r", name = "GetAllReviews"),
	@NamedQuery(query = "Select r from Review r where r.business.email = :bEmail", name = "GetReviewByBusinessEmail"),
	@NamedQuery(query = "Select r from Review r where r.business.email = :bEmail and r.client.email = :cEmail", name = "GetReviewByEmails"),
	@NamedQuery(query = "Select r from Review r where r.id = :rId", name = "GetReviewById") })
public class Review implements Serializable {

	    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String revContent;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne 
	private Business business;
	
	@ManyToOne 
	private Client client; 

	public Review() {
		super();
	}   
	
	/**
	 * @param id
	 * @param revContent
	 * @param business
	 * @param client
	 */
	public Review( String revContent, Business business, Client client) {
 		this.revContent = revContent;
		this.business = business;
		this.client = client;
	}

	/**
	 * @return the business
	 */
	public Business getBusiness() {
		return business;
	}

	/**
	 * @param business the business to set
	 */
	public void setBusiness(Business business) {
		this.business = business;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
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
