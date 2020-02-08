package com.bridgelabz.usermanagement.controller;

import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.usermanagement.dao.DAOImplimentation;

/**
 * servlet to fetch the location fo the user of the user management
 * 
 * @author amresh kumar
 * @version 1.0
 *
 */
public class Location extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		DAOImplimentation daoImplimentationObject = new DAOImplimentation();
		String qry = "SELECT location FROM customer ;";
		LinkedList<String> list = (LinkedList<String>) daoImplimentationObject.getData(qry);
		request.setAttribute("location", list);
		try {
			PrintWriter out = response.getWriter();
			out.print("<link rel=\"stylesheet\"\n"
					+ "	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
			out.print("<ul class=" + "list-group" + ">");
			for (int count = 0; count <= list.size(); count++) {
				out.print("<li class=" + "list-class-item" + ">" + list.pop() + "</li>");
			}
			out.print("</ul>");
			request.getRequestDispatcher("graph.html");
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
