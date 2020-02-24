package com.mahmoud.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mahmoud.entities.Business;
import com.mahmoud.entities.BusinessHours;
import com.mahmoud.entities.Client;
import com.mahmoud.entities.Employees;
import com.mahmoud.entities.Promotions;
import com.mahmoud.entities.Review;
import com.mahmoud.entities.Service;
import com.mahmoud.services.BusinessService;
import com.mahmoud.services.ClientService;

/**
 * Servlet implementation class SignUpModelServlet
 */
@WebServlet("/SignUpModelServlet")
public class SignUpModelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("inputEmail");
		String pass = request.getParameter("inputPassword");
		String userType = request.getParameter("userType");
		request.setAttribute("userEmail", user);
		request.setAttribute("exists", false);
		request.setAttribute("userType", userType);

		System.out.println(userType);

		if (userType.equals("business")) {
			BusinessService bs = new BusinessService();
			List<Business> business = bs.getAllBusinesses();
			// request.setAttribute("busList", business);
			System.out.println(business);
			Business b1 = new Business(pass, user, "", "", "", "", "", "", null, null, null, null, null);
			for (Business busin : business) {
				if (busin.getEmail().equals(user)) {
					request.setAttribute("exists", true);
					break;
				}
			}
			if (!(boolean) request.getAttribute("exists")) {
				request.setAttribute("welocmeUser", "Account Created Successfully, Please Login");
				bs.addBusiness(b1);

			} else {
				request.setAttribute("accountExists", "Account already exists, Please Login");

			}
		}

		else if (userType.equals("client")) {
			ClientService cs = new ClientService();
			List<Client> client = cs.getClientByEmail(user);
			// request.setAttribute("busList", business);
 			Client c1 = new Client(user,pass,null);
			for (Client cli : client) {
				if (cli.getEmail().equals(user)) {
					request.setAttribute("exists", true);
					break;
				}
			}
			if (!(boolean) request.getAttribute("exists")) {
				request.setAttribute("welocmeUser", "Account Created Successfully, Please Login");
				cs.addClient(c1);

			} else {
				request.setAttribute("accountExists", "Account already exists, Please Login");

			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
