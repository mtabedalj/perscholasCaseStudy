package com.mahmoud.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mahmoud.entities.Business;
import com.mahmoud.entities.BusinessHours;
import com.mahmoud.services.BusinessHoursServic;
import com.mahmoud.services.BusinessService;

/**
 * Servlet implementation class GetBusinessHoursServlet
 */
//@WebServlet("/GetBusinessHoursServlet")
public class GetBusinessHoursServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);

		Business business = new Business();
		business = (Business) session.getAttribute("theBusiness");
		BusinessService bs = new BusinessService();
	

		BusinessHoursServic bhs = new BusinessHoursServic();
		List<BusinessHours> businessHoursList = new ArrayList<>();
		businessHoursList = bhs.getAllBusinessHoursbyBusEmial(business.getEmail());
 		 
		if(!businessHoursList.isEmpty())
		{  
		request.setAttribute("hoursList", businessHoursList.get(0));
 		}
 		RequestDispatcher rd = getServletContext().getRequestDispatcher("/businessHours.jsp");
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
