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
import com.mahmoud.entities.Promotions;
import com.mahmoud.services.BusinessService;
import com.mahmoud.services.PromotionsService;

/**
 * Servlet implementation class GetPromotionsServlet
 */
//@WebServlet("/GetPromotionsServlet")
public class GetPromotionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);

		Business business = new Business();
		business = (Business) session.getAttribute("theBusiness");
		BusinessService bs = new BusinessService();
System.out.println("theEmail now is: "+business.getEmail());
	

		PromotionsService ps = new PromotionsService();
		List<Promotions> promotionList = new ArrayList<>();
		promotionList = ps.getAllPromotionsbyBusEmial(business.getEmail());
		
		request.setAttribute("promotionList", promotionList);
 
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/promotions.jsp");
		System.out.println("did i make it");
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
