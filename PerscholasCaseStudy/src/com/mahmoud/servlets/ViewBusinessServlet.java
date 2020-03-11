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
import com.mahmoud.entities.Review;
import com.mahmoud.entities.Service;
import com.mahmoud.services.BusinessHoursServic;
import com.mahmoud.services.BusinessService;
import com.mahmoud.services.PromotionsService;
import com.mahmoud.services.ReviewService;
import com.mahmoud.services.ServiceService;

/**
 * Servlet implementation class ViewBusinessServlet
 */
//@WebServlet("/ViewBusinessServlet")
public class ViewBusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/SignInModelServlet");
		rd.include(request, response);
	//	HttpSession session = request.getSession(true);
    
 System.out.println("val is"+request.getParameter("emailVal"));
		
		BusinessService bs = new BusinessService();
 
		PromotionsService ps = new PromotionsService();
		List<Promotions> promotionList = new ArrayList<>();
		promotionList = ps.getAllPromotionsbyBusEmial(request.getParameter("emailVal"));

		ServiceService ss = new ServiceService();
		List<Service> allServices = new ArrayList<>();
		allServices = ss.getAllServicesbyBusEmial(request.getParameter("emailVal"));

		BusinessHoursServic bhs = new BusinessHoursServic();
		List<BusinessHours> businessHoursList = new ArrayList<>();
		businessHoursList = bhs.getAllBusinessHoursbyBusEmial(request.getParameter("emailVal"));
		
		ReviewService rs = new ReviewService();
		List <Review> rList = rs.getReviewByBusinessEmail(request.getParameter("emailVal"));
		if (!rList.isEmpty()) {
 			request.setAttribute("rList", rList);

 		}
		

 		if (!businessHoursList.isEmpty()) {
			BusinessHours businessHours  = businessHoursList.get(0);
			request.setAttribute("hoursList", businessHours);

 		}
 		
 		if (!promotionList.isEmpty()) {
 			request.setAttribute("promotionList", promotionList);
 			System.out.println("here promo");

 		}
 		
 		if (!allServices.isEmpty()) {
 			request.setAttribute("allServices", allServices);

 		}
 		
 		List<Business> businessList = new ArrayList<>();
 		businessList = bs.getBusinessByEmail(request.getParameter("emailVal"));
 		 
		if(!businessList.isEmpty())
		{  
		request.setAttribute("business", businessList.get(0));
 		}
 	 
 		  rd = getServletContext().getRequestDispatcher("/clientView.jsp");
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
