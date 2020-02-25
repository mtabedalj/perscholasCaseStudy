package com.mahmoud.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * Entity implementation class for Entity: Business
 *
 */ 
@Entity    
 @NamedQueries({ @NamedQuery(query = "Select b from Business b", name = "GetAllBusinesses"),
 	@NamedQuery(query = "Select b from Business b where b.email = :bEmail", name = "GetBusinessByEmail") ,
 	//@NamedQuery(query = "Select s from Service s INNER JOIN business_service bs ON s.serviceId = bs.serviceList_SERVICEID INNER JOIN Business b ON bs.Business_EMAIL= :bEmail ", name = "GetAllServicesForABusiness")
 })

public class Business implements Serializable {

	@Id 
	private String email;
 	private String password;

	private String name;
	private String aboutSection;
	private String phone;
	private String addressLine;
	private String city;
	private String state;
	private static final long serialVersionUID = 1L;
	
	@OneToMany (targetEntity = Service.class)  
	private List <Service> serviceList;

	@OneToMany (targetEntity = Promotions.class)
	private List <Promotions> promotionList;
	
	@OneToMany (targetEntity = Employees.class)
	private List <Employees> employeesList;
	
	@OneToOne (targetEntity = BusinessHours.class)
	private BusinessHours businessHours;
	
	@OneToMany (targetEntity = Review.class)
	private List <Review> reviewList;
	private String accountType;
	

	
	
	public Business() {
		super();
	}   
	   
	/**
	 * @param businessId
	 * @param password
	 * @param email
	 * @param name
	 * @param aboutSection
	 * @param phone
	 * @param addressLine
	 * @param city
	 * @param state
	 * @param serviceList
	 * @param promotionList
	 * @param employeesList
	 * @param businessHours
	 * @param reviewList
	 */
	public Business(String password, String email, String name, String aboutSection, String phone,
			String addressLine, String city, String state, List<Service> serviceList, List<Promotions> promotionList,
			List<Employees> employeesList, BusinessHours businessHours, List<Review> reviewList) {
 		this.password = password;
		this.email = email;
		this.name = name;
		this.aboutSection = aboutSection;
		this.phone = phone;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.serviceList = serviceList;
		this.promotionList = promotionList;
		this.employeesList = employeesList;
		this.businessHours = businessHours;
		this.reviewList = reviewList;
		this.accountType = "business";
	}

 
	/**
	 * @return the serviceList
	 */
	public List<Service> getServiceList() {
		return serviceList;
	}

	/**
	 * @param serviceList the serviceList to set
	 */
	public void setServiceList(List<Service> serviceList) {
		this.serviceList = serviceList;
	}

	/**
	 * @return the promotionList
	 */
	public List<Promotions> getPromotionList() {
		return promotionList;
	}

	/**
	 * @param promotionList the promotionList to set
	 */
	public void setPromotionList(List<Promotions> promotionList) {
		this.promotionList = promotionList;
	}

	/**
	 * @return the employeesList
	 */
	public List<Employees> getEmployeesList() {
		return employeesList;
	}

	/**
	 * @param employeesList the employeesList to set
	 */
	public void setEmployeesList(List<Employees> employeesList) {
		this.employeesList = employeesList;
	}

	/**
	 * @return the businessHours
	 */
	public BusinessHours getBusinessHours() {
		return businessHours;
	}

	/**
	 * @param businessHours the businessHours to set
	 */
	public void setBusinessHours(BusinessHours businessHours) {
		this.businessHours = businessHours;
	}

	/**
	 * @return the reviewList
	 */
	public List<Review> getReviewList() {
		return reviewList;
	}

	/**
	 * @param reviewList the reviewList to set
	 */
	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getAboutSection() {
		return this.aboutSection;
	}

	public void setAboutSection(String aboutSection) {
		this.aboutSection = aboutSection;
	}   
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}   
	public String getAddressLine() {
		return this.addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}   
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}   
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
   
}
