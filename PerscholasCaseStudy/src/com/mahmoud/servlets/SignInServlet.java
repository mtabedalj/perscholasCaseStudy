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
 * Servlet implementation class SignInServlet
 */
//@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/SignInModelServlet");
		
		rd.include(request, response);
     if((boolean) request.getAttribute("businessType")) {
		if ((boolean) request.getAttribute("loggedIn")) {
			Business business = new  Business();

			business =  (Business) request.getAttribute("theBusiness");
			request.setAttribute("theBus", business);
 			rd = getServletContext().getRequestDispatcher("/GetServicesServlet");
			rd.forward(request, response);
		} else {
			

			rd = getServletContext().getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		}
     }
     else if((boolean) request.getAttribute("clientType")) {
		if ((boolean) request.getAttribute("loggedIn")) {
		 
			rd = getServletContext().getRequestDispatcher("/client.jsp");
			rd.forward(request, response);
		} else {
			

			rd = getServletContext().getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		}
     }
     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
