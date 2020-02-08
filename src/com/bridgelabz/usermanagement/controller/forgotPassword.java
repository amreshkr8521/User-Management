package com.bridgelabz.usermanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.usermanagement.dao.DAOImplimentation;
import com.bridgelabz.usermanagement.model.LoginModel;

/**
 * servlet to set the new passord if the user forgot his password or wants to
 * change the password
 * 
 * @author amresh kumar
 * @version 1.0
 *
 */
public class forgotPassword extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		int i = 0;
		DAOImplimentation daoObject = new DAOImplimentation();
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		String RePassword = request.getParameter("RePassword");
		LoginModel loginModel = daoObject.getData(email, mobile);

		System.out.println(loginModel.getAge());
		if (loginModel != null) {
			loginModel.setPwd(password);
			System.out.println(loginModel.getEmail());
			i = daoObject.alterUser(loginModel.getEmail(), password);
			if (i != 0) {
				HttpSession session = request.getSession();
				session.setAttribute("email", "password change");
				try {
					response.sendRedirect("LoginPage.jsp");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			request.setAttribute("notchanged", "Password not changed");
			try {
				request.getRequestDispatcher("forgotPassword.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
