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
import com.mahmoud.entities.Service;
import com.mahmoud.services.ServiceService;

/**
 * Servlet implementation class GetServicesServlet
 */
//@WebServlet("/GetServicesServlet")
public class GetServicesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Business business = new  Business();
		HttpSession session = request.getSession(true);
		business = (Business) session.getAttribute("theBusiness");

  		ServiceService ss = new ServiceService();
	 
		List<Service> allServices = new ArrayList<>();
		allServices = ss.getAllServicesbyBusEmial(business.getEmail());
		request.setAttribute("allServices", allServices);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/services.jsp");
		System.out.println("did i make it");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
