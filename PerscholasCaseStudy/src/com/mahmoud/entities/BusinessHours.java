package com.mahmoud.entities;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: BusinessHours
 *
 */
@Entity
@NamedQueries({ @NamedQuery(query = "Select bh from BusinessHours bh", name = "GetAllBusinessHours"),
	  @NamedQuery(query = "Select b from BusinessHours b where b.business.email = :bEmail", name = "GetAllBusinessHoursbyBusEmial")
	
})
public class BusinessHours implements Serializable {
	   
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

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Map<String,String> openTimes;
	private Map<String,String> closeTimes;
	private Map <String,String> shopOpenDays ;
	@OneToOne (targetEntity = Business.class) 
	private Business business;
	private static final long serialVersionUID = 1L;

	/**
	 * @param openTime
	 * @param closeTime
	 */

	public BusinessHours() {
		super();
	}

	/**
	 * @param openTimes
	 * @param closeTimes
	 * @param shopOpenDays
	 */
 

	/**
	 * @return the openTimes
	 */
	public Map<String, String> getOpenTimes() {
		return openTimes;
	}

	/**
	 * @param openTimes
	 * @param closeTimes
	 * @param shopOpenDays
	 * @param business
	 */
	public BusinessHours(Map<String, String> openTimes, Map<String, String> closeTimes,
			Map<String, String> shopOpenDays, Business business) {
		this.openTimes = openTimes;
		this.closeTimes = closeTimes;
		this.shopOpenDays = shopOpenDays;
		this.business = business;
	}

	/**
	 * @param openTimes the openTimes to set
	 */
	public void setOpenTimes(Map<String, String> openTimes) {
		this.openTimes = openTimes;
	}

	/**
	 * @return the closeTimes
	 */
	public Map<String, String> getCloseTimes() {
		return closeTimes;
	}

	/**
	 * @param closeTimes the closeTimes to set
	 */
	public void setCloseTimes(Map<String, String> closeTimes) {
		this.closeTimes = closeTimes;
	}

	/**
	 * @return the shopOpenDays
	 */
	public Map<String, String> getShopOpenDays() {
		return shopOpenDays;
	}

	/**
	 * @param shopOpenDays the shopOpenDays to set
	 */
	public void setShopOpenDays(Map<String, String> shopOpenDays) {
		this.shopOpenDays = shopOpenDays;
	}   
	 
   
}
