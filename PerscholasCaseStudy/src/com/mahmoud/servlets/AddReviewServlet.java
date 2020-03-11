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
import com.mahmoud.entities.Client;
import com.mahmoud.entities.Promotions;
import com.mahmoud.entities.Review;
import com.mahmoud.entities.Service;
import com.mahmoud.services.BusinessHoursServic;
import com.mahmoud.services.BusinessService;
import com.mahmoud.services.PromotionsService;
import com.mahmoud.services.ReviewService;
import com.mahmoud.services.ServiceService;

/**
 * Servlet implementation class AddReviewServlet
 */
@WebServlet("/AddReviewServlet")
public class AddReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 	HttpSession session = request.getSession(true);
	    
 				
			Client client = new  Client();
 			client = (Client) session.getAttribute("theClient");
			
			String emailVal = request.getParameter("emailVal");
			BusinessService bs = new BusinessService();
			String rev = request.getParameter("rev");
			List<Business> businessList = new ArrayList<>();
	 		businessList = bs.getBusinessByEmail(emailVal );
			ReviewService rs = new ReviewService();

			
			
			List <Review> rList = rs.GetReviewByEmails(emailVal, client.getEmail());
			
			for(Review r: rList) {
				if(r.getBusiness().getEmail().equals(emailVal)&&r.getClient().getEmail().equals(client.getEmail())) {
					rs.removeReview(r);
				}
			}
			if(!businessList.isEmpty())
			{  
			Review theReview = new Review(rev,businessList.get(0),client);
			rs.addReview(theReview);
}
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/ViewBusinessServlet");
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
