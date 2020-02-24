package com.mahmoud.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mahmoud.entities.Business;
import com.mahmoud.entities.Client;
import com.mahmoud.services.BusinessService;
import com.mahmoud.services.ClientService;

/**
 * Servlet implementation class SignInModelServlet
 */
@WebServlet("/SignInModelServlet")
public class SignInModelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignInModelServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);

		String user = request.getParameter("inputEmail");
		String pass = request.getParameter("inputPassword");
		request.setAttribute("userEmail", user);
		request.setAttribute("loggedIn", false);
		request.setAttribute("businessType", false);
		request.setAttribute("clientType", false);
		Business businessObject = new Business();

		BusinessService bs = new BusinessService();
		ClientService cs = new ClientService();
		List<Business> business = bs.getBusinessByEmail(user);
		List<Client> client = cs.getClientByEmail(user);

		for (Business busin : business) {
			if (busin.getEmail().equals(user) && busin.getPassword().equals(pass)) {
				session.setAttribute("theBusiness", busin);
				System.out.println("business value"+ busin);
				request.setAttribute("loggedIn", true);
				request.setAttribute("businessType", true);

				break;     
			}
		}

		for (Client cli : client) {
			if (cli.getEmail().equals(user) && cli.getPassword().equals(pass)) {
				request.setAttribute("loggedIn", true);
				request.setAttribute("clientType", true);

				break;
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
