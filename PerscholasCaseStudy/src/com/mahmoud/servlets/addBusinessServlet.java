package com.mahmoud.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mahmoud.entities.Business;
import com.mahmoud.entities.BusinessHours;
import com.mahmoud.entities.Promotions;
import com.mahmoud.entities.Service;
import com.mahmoud.services.BusinessHoursServic;
import com.mahmoud.services.BusinessService;
import com.mahmoud.services.PromotionsService;
import com.mahmoud.services.ServiceService;

/**
 * Servlet implementation class addBusinessServlet
 */
@WebServlet("/addBusinessServlet")
public class addBusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
 		
 		RequestDispatcher rd = getServletContext().getRequestDispatcher("/SignInModelServlet");
		rd.include(request, response);
		HttpSession session = request.getSession(true);

		Business business = new Business();

		business = (Business) session.getAttribute("theBusiness");
		BusinessService bs = new BusinessService();
System.out.println("theEmail now is: "+business.getEmail());
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String about = request.getParameter("about");

		String addressLine = request.getParameter("addressLine");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
	//	String profile_pic = request.getParameter("profile_pic");
	//	String zipcode = request.getParameter("zipcode");
		
		
//		PromotionsService ps = new PromotionsService();
//		List<Promotions> promotionList = new ArrayList<>();
//		promotionList = ps.getAllPromotionsbyBusEmial(business.getEmail());
//		
//  		ServiceService ss = new ServiceService();
//		List<Service> allServices = new ArrayList<>();
//		allServices = ss.getAllServicesbyBusEmial(business.getEmail());
//
//		
//		BusinessHoursServic bhs = new BusinessHoursServic();
//		List<BusinessHours> businessHoursList = new ArrayList<>();
//		businessHoursList = bhs.getAllBusinessHoursbyBusEmial(business.getEmail());
//		BusinessHours businessHours = new BusinessHours();
//		if(!businessHoursList.isEmpty())
//		{  
//			  businessHours = businessHoursList.get(0);
//			
//		}
		
		Business newBusiness = new Business(business.getPassword(),business.getEmail(),name,about,phone,addressLine,city,state,null,null,null,null,null);
		List<Business> businessList = new ArrayList<>();
 		businessList = bs.getBusinessByEmail(business.getEmail());
 		 
		if(!businessList.isEmpty())
		{  
			
			
		request.setAttribute("businessList", businessList.get(0));
 		}
 		
		 Boolean isIn = false;
		 
		for (Business b : businessList) {
			if (b.getEmail().equals(business.getEmail())) {
				bs.updateBusiness(newBusiness);
				isIn = true;
			}
		}
		 if(!isIn)
		bs.addBusiness(newBusiness);
		
		
		rd = getServletContext().getRequestDispatcher("/GetBusinessServlet");
		rd.forward(request, response);
 		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
