package com.mahmoud.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: BusinessHours
 *
 */
@Entity
@NamedQueries({ @NamedQuery(query = "Select bh from BusinessHours bh", name = "GetAllBusinessHours") })
public class BusinessHours implements Serializable {

	   
	@Id
	private int id;
	private int openTime;
	private int closeTime;
	private static final long serialVersionUID = 1L;

	public BusinessHours() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getOpenTime() {
		return this.openTime;
	}

	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}   
	public int getCloseTime() {
		return this.closeTime;
	}

	public void setCloseTime(int closeTime) {
		this.closeTime = closeTime;
	}
   
}
