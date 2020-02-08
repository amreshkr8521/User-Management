package com.bridgelabz.usermanagement.controller;

import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.usermanagement.dao.DAOImplimentation;

/**
 * servlet to fetch the registration history upto the last five registration
 * 
 * @author amresh kumar
 * @version 1.0
 *
 */
public class RegistrationHistory extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		HttpSession httpSession = request.getSession();
		request.getParameter("history");
		String qry = "SELECT email FROM customer ;";
		DAOImplimentation daoImplimentationObject = new DAOImplimentation();
		LinkedList<String> email = daoImplimentationObject.getData(qry);
		request.setAttribute("email", email);

		try {
			PrintWriter out = response.getWriter();
			out.print("<html><link rel=\"stylesheet\"\n"
					+ "	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\"></html>");
			out.print("<ul class=" + "list-group" + ">");
			int size = email.size();
			if (size < 5)
				for (int count = 0; count <= 5; count++) {
					out.print("<li class=" + "list-class-item" + ">" + email.pop() + "</li>");
				}
			else
				for (int count = 0; count <= size; count++) {
					out.print("<li class=" + "list-class-item" + ">" + email.pop() + "</li>");
				}
			out.print("</ul>");
			response.sendRedirect("graph.html");

			String html = "<html>";
			html = html + "";
		} catch (Exception e) {
			e.getMessage();
			request.getRequestDispatcher("Welcome.java");
		}

	}
}
