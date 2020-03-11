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
import com.mahmoud.services.BusinessHoursServic;
import com.mahmoud.services.BusinessService;

/**
 * Servlet implementation class GetBusinessServlet
 */
//@WebServlet("/GetBusinessServlet")
public class GetBusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);

		Business business = new Business();
		business = (Business) session.getAttribute("theBusiness");
		if(business==null) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		}
		else {
		BusinessService bs = new BusinessService();
	
		
 		List<Business> businessList = new ArrayList<>();
 		businessList = bs.getBusinessByEmail(business.getEmail());
 		 
		if(!businessList.isEmpty())
		{  
		request.setAttribute("businessList", businessList.get(0));
 		}
 		RequestDispatcher rd = getServletContext().getRequestDispatcher("/business.jsp");
		rd.forward(request, response);	}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
