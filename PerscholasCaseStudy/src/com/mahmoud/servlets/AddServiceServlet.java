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

import com.mahmoud.entities.Business;
import com.mahmoud.entities.Service;
import com.mahmoud.services.BusinessService;
import com.mahmoud.services.ServiceService;

/**
 * Servlet implementation class AddServiceServlet
 */
@WebServlet("/AddServiceServlet")
public class AddServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	RequestDispatcher rd = getServletContext().getRequestDispatcher("/bindBusinessServiceServlet");
		rd.include(request, response);

		Business business = new  Business();
		business = (Business) request.getAttribute("theBus");
		BusinessService bs = new BusinessService();
		 System.out.println("got the bus maybe: "+ request.getAttribute("theBus"));
		
		String serviceName = request.getParameter("serviceName");
		String servicePrice = request.getParameter("servicePrice");
		ServiceService ss = new ServiceService();
		Service service = new Service(serviceName, Double.valueOf(servicePrice),business);
		ss.addService(service);

		 
		 rd = getServletContext().getRequestDispatcher("/GetServicesServlet");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
