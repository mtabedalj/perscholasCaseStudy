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
	@NamedQuery(query = "Select p from Promotions p where p.promoName = :pName", name = "GetPromotionByName") })
public class Promotions implements Serializable {

	   
	@Id
	private int promoId;
	private String promoName;
	private String promoContent;
	private String startDate; 
	private String endDate;
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
	public Promotions(int promoId, String promoName,String promoContent, String startDate, String endDate) {
		this.promoId = promoId;
		this.promoName = promoName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.promoContent = promoContent;
	}
   
	public int getPromoId() {
		return this.promoId;
	}

	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}   
	public String getPromoName() {
		return this.promoName;
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
