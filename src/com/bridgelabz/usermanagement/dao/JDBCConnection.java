package com.bridgelabz.usermanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**************************************************************
 * To create the database connection
 * 
 * @author amresh kumar
 * @since 30-12-2019
 * 
 *************************************************************
 */
public class JDBCConnection extends JDBCProvider {

	/**
	 * To create the connection between the mysql and the application
	 * 
	 * @param link     --> String
	 * @param name     --> String
	 * @param password --> String
	 * @return Connection
	 */
	public Connection jdbcConnection() {
		JDBCConnection jdbcConnection = new JDBCConnection();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connction = DriverManager.getConnection(jdbcConnection.getLink(), jdbcConnection.getName(),
					jdbcConnection.getPassword());
			return connction;
		} catch (Exception e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		return null;
	}
}