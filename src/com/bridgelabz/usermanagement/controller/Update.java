package com.bridgelabz.usermanagement.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.usermanagement.dao.DAOImplimentation;
import com.bridgelabz.usermanagement.model.LoginModel;

/**
 * servlet to update the user from the given user management database
 * 
 * @author amresh kumar
 * @version 1.0
 *
 */
public class Update extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		DAOImplimentation daoObject = new DAOImplimentation();
		String fname = request.getParameter("FirstName");
		String lname = request.getParameter("LastName");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String age = request.getParameter("age");

		String location = request.getParameter("location");
		LoginModel modelObject = new LoginModel();
		modelObject = daoObject.getData(email, mobile);

		if (modelObject != null) {
			if (fname.equals("")) {
				fname = modelObject.getFirstName();
			}
			if (lname.equals("")) {
				lname = modelObject.getLastName();
			}
			if (age.equals("")) {
				age = modelObject.getAge();
			}
			if (location.equals("")) {
				location = modelObject.getLocation();
			}
		}
		String qry = "UPDATE customer SET FirstName='" + fname + "', LastName='" + lname + "', gender='"
				+ modelObject.getGender() + "', age='" + age + "', location='" + location + "' WHERE email='" + email
				+ "';";
		int status = daoObject.update(qry);
		if (status != 0) {
			try {
				RequestDispatcher dispatcher = request.getRequestDispatcher("Welcome.jsp");
				dispatcher.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			request.getRequestDispatcher("Update.jsp");
		}
	}
}
