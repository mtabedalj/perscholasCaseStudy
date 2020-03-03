package com.mahmoud.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mahmoud.entities.Business;
import com.mahmoud.entities.BusinessHours;
import com.mahmoud.entities.Promotions;
import com.mahmoud.services.BusinessHoursServic;
import com.mahmoud.services.BusinessService;

/**
 * Servlet implementation class AddHoursServlet
 */
@WebServlet("/AddHoursServlet")
public class AddHoursServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		// ["SundayOpen","MondayOpen","TuesdayOpen","WednesdayOpen","ThursdayOpen","FridayOpen","SaturdayOpen"];
		String[] openD = { "SundayOpen", "MondayOpen", "TuesdayOpen", "WednesdayOpen", "ThursdayOpen", "FridayOpen",
				"SaturdayOpen" };
		String[] closeD = { "SundayClose", "MondayClose", "TuesdayClose", "WednesdayClose", "ThursdayClose",
				"FridayClose", "SaturdayClose" };
		String[] shopStatus = { "isSundayClose", "isMondayClose", "isTuesdayClose", "isWednesdayClose",
				"isThursdayClose", "isFridayClose", "isSaturdayClose" };
		Business business = new Business();
		business = (Business) session.getAttribute("theBusiness");
		BusinessService bs = new BusinessService();
		Map<String, String> openTimes = new HashMap<>();
		Map<String, String> closeTimes = new HashMap<>();
		Map<String, String> shopOpenDays = new HashMap<>();

		for (String d : openD) {
			openTimes.put(d, request.getParameter(d));
		}
		for (String d : closeD) {
			closeTimes.put(d, request.getParameter(d));
		}
		for (String d : shopStatus) {
			if(request.getParameter(d)==null) {
				shopOpenDays.put(d, "off");

			}
			else {shopOpenDays.put(d, "on");
}
		}
System.out.println("im inthere"+shopOpenDays.toString());
		BusinessHoursServic bhs = new BusinessHoursServic();
		BusinessHours bh = new BusinessHours(openTimes, closeTimes, shopOpenDays, business);
		List<BusinessHours> businessHoursList = new ArrayList<>();
		businessHoursList = bhs.getAllBusinessHoursbyBusEmial(business.getEmail());

		for (BusinessHours b : businessHoursList) {
			if (b.getBusiness().getEmail().equals(business.getEmail())) {
				bhs.removeBusinessHours(b);
			}
		}

		bhs.addBusinessHours(bh);
		
		RequestDispatcher  rd = getServletContext().getRequestDispatcher("/GetBusinessHoursServlet");
		rd.forward(request, response);
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
