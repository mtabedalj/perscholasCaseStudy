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
import com.mahmoud.entities.Service;
import com.mahmoud.services.BusinessService;
import com.mahmoud.services.PromotionsService;
import com.mahmoud.services.ServiceService;

/**
 * Servlet implementation class AddPromotionServlet
 */
@WebServlet("/AddPromotionServlet")
public class AddPromotionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/SignInModelServlet");
		rd.include(request, response);
		HttpSession session = request.getSession(true);

		Business business = new Business();
		business = (Business) session.getAttribute("theBusiness");
		BusinessService bs = new BusinessService();
System.out.println("theEmail now is: "+business.getEmail());
		String promoName = request.getParameter("promotionName");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		String promoContent = request.getParameter("promoContent");

		PromotionsService ps = new PromotionsService();
		List<Promotions> promotionList = new ArrayList<>();
		promotionList = ps.getAllPromotionsbyBusEmial(business.getEmail());
		
		request.setAttribute("promotionList", promotionList);
		//String promoName,String promoContent, String startDate, String endDate
		Promotions promotions = new Promotions(promoName,promoContent,startDate,endDate,business);

		for (Promotions p : promotionList) {
			if (p.getPromoName().equals(promoName)) {
				ps.removePromotion(p);
			}
		}

		ps.addPromotion(promotions); 
		
		
		 rd = getServletContext().getRequestDispatcher("/GetPromotionsServlet");
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
