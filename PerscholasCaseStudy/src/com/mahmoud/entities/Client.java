package com.mahmoud.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
@NamedQuery(query = "Select c from Client c where c.email = :cEmail", name = "GetClientByEmail")
public class Client implements Serializable {

	   
	@Id
	private String email;
	private String password;
	private String accountType;
	private static final long serialVersionUID = 1L;
	 
	/**
	 * @param clientId
	 * @param email
	 * @param password
	 * @param review
	 */
	public Client( String email, String password, Review review) {
		this.email = email;
		this.password = password;
		this.review = review;
		this.accountType="client";
	}

	@OneToOne (targetEntity = Review.class)
	private Review review;
	public Client() {
		super();
	}   
   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
   
}
