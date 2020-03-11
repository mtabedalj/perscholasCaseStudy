package com.mahmoud.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mahmoud.entities.Business;
import com.mahmoud.entities.Client;
import com.mahmoud.services.BusinessService;

/**
 * Servlet implementation class LookUpServlet
 */
@WebServlet("/LookUpServlet")
public class LookUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client client = new  Client();
		HttpSession session = request.getSession(true);
		client = (Client) session.getAttribute("theClient");
		
		String busName = request.getParameter("busName");
		
		
		BusinessService bs = new BusinessService();
		List <Business> businessList  = bs.getBusinessByName(busName);
		
		if(!businessList.isEmpty())
		{  
		request.setAttribute("businessList", businessList);
 		}
		else
			request.setAttribute("emptyList", "No results found for your query");

 		RequestDispatcher rd = getServletContext().getRequestDispatcher("/client.jsp");
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
