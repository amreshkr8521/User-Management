package com.bridgelabz.usermanagement.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * servlet for the welcome page after the login
 * 
 * @author amresh kumar
 * @version 1.0
 *
 */
public class Welcome extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		HttpSession httpSession = request.getSession();
		httpSession.getAttribute("user");

		httpSession.invalidate();

		try {
			response.sendRedirect("LoginPage.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
