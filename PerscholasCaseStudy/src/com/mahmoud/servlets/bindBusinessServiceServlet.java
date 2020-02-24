package com.mahmoud.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mahmoud.entities.Business;

/**
 * Servlet implementation class bindBusinessServiceServlet
 */
@WebServlet("/bindBusinessServiceServlet")
public class bindBusinessServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
RequestDispatcher rd = getServletContext().getRequestDispatcher("/SignInModelServlet");
		
		rd.include(request, response);
			Business business = new  Business();

			 
			request.setAttribute("theBus", request.getAttribute("theBusiness"));
 			rd = getServletContext().getRequestDispatcher("/AddServiceServlet");
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
