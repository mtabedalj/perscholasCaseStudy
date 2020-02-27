package com.mahmoud.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Promotions
 *
 */
@Entity
@NamedQueries({ @NamedQuery(query = "Select p from Promotions p", name = "GetAllPromotions"),
	@NamedQuery(query = "Select p from Promotions p where p.promoName = :pName", name = "GetPromotionByName"),
	  @NamedQuery(query = "Select p from Promotions p where p.business.email = :bEmail", name = "GetAllPromotionsbyBusEmial")
	})
public class Promotions implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int promoId;
	private String promoName;
	private String promoContent;
	private String startDate; 
	private String endDate;
	@ManyToOne 
	private Business business;
	private static final long serialVersionUID = 1L;

	public Promotions() {
		super();
	}   
	
	/**
	 * @param promoId
	 * @param promoName
	 * @param startDate
	 * @param endDate
	 */
	 
      
	public String getPromoName() {
		return this.promoName;
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
	 * @param promoName
	 * @param promoContent
	 * @param startDate
	 * @param endDate
	 * @param business
	 */
	public Promotions(String promoName, String promoContent, String startDate, String endDate, Business business) {
		this.promoName = promoName;
		this.promoContent = promoContent;
		this.startDate = startDate;
		this.endDate = endDate;
		this.business = business;
	}

	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}   
	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}   
	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPromoContent() {
		return promoContent;
	}

	public void setPromoContent(String promoContent) {
		this.promoContent = promoContent;
	}

}
