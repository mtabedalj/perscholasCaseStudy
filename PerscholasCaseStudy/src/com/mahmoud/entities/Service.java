package com.mahmoud.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Service
 *SELECT Orders.OrderID, Customers.CustomerName
FROM Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
 */
@Entity
@NamedQueries({ @NamedQuery(query = "Select s from Service s where s.business.email = :bEmail", name = "GetAllServicesbyBusEmial"),
	@NamedQuery(query = "Select s from Service s where s.serviceName = :sName", name = "GetServiceByName"),
})
public class Service implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int serviceId;
private String serviceName;
private double price;
@ManyToOne
private Business business;

 

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
 * @param serviceId
 * @param serviceName
 * @param price
 * @param business
 */
public Service(  String serviceName, double price, Business business) {
	 
	this.serviceName = serviceName;
	this.price = price;
	this.business = business;
}

public String getServiceName() {
	return serviceName;
}

public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

	private static final long serialVersionUID = 1L;

	public Service() {
		super();
	}
   
}
