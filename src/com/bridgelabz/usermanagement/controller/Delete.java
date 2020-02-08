package com.bridgelabz.usermanagement.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.usermanagement.dao.DAOImplimentation;

/**
 * Servlet to delete the user from the database
 * 
 * @author amresh kumar
 * @version 1.0
 *
 */
public class Delete extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		DAOImplimentation daoObject = new DAOImplimentation();
		String email = request.getParameter("email");
		System.out.println(email);
		String qry = "DELETE FROM customer WHERE email='" + email + "';";
		int status = daoObject.update(qry);
		if (status != 0) {
			try {
				RequestDispatcher dispatcher = request.getRequestDispatcher("LoginPage.jsp");
				dispatcher.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			request.getRequestDispatcher("Delete.jsp");
		}
	}
}
