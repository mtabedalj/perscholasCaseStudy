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
 * Servlet implementation class deletePromotionServlet
 */
@WebServlet("/deletePromotionServlet")
public class deletePromotionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/SignInModelServlet");
		rd.include(request, response);
		HttpSession session = request.getSession(true);

		Business business = new Business();
		business = (Business) session.getAttribute("theBusiness");
		BusinessService bs = new BusinessService();
System.out.println("theEmail now is: "+business.getEmail());
		String promoName = request.getParameter("thePromo");
		 System.out.println(promoName);
		PromotionsService ps = new PromotionsService();
	 if(!ps.getPromotionsByName(promoName).isEmpty()) {
		 ps.removePromotion(ps.getPromotionsByName(promoName).get(0));
	 }
		 rd = getServletContext().getRequestDispatcher("/GetPromotionsServlet");
		System.out.println("did i make it");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
