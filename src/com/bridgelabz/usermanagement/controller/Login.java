package com.bridgelabz.usermanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.usermanagement.dao.DAOImplimentation;
import com.bridgelabz.usermanagement.model.LoginModel;

/**
 * servlet to verify and login the user
 * 
 * @author amresh kumar
 * @version 1.0
 *
 */
public class Login extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOImplimentation daoImplimentationObject = new DAOImplimentation();
		String user = request.getParameter("userId");
		String password = request.getParameter("pwd");
		LoginModel loginModel = null;

		loginModel = daoImplimentationObject.getUser(user, password);
		if (loginModel.getEmail() != null) {

			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("user", loginModel.getEmail());
			request.setAttribute("message", loginModel.getFirstName());

			response.sendRedirect("Welcome.jsp");
						
		} else {

			request.setAttribute("message1", "data not found please register");
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginPage.jsp");
			dispatcher.forward(request, response);
		}
	}
}
