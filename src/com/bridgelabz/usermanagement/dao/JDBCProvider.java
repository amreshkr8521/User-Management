package com.bridgelabz.usermanagement.dao;

/**
 * To contain the jdbc Link,user name and password for the database
 * 
 * @author amresh kumar
 * @version 1.0
 *
 */
public class JDBCProvider {
	private String link = "jdbc:mysql://localhost:3306/amresh";
	private String name = "root";
	private String password = "12345";

	public String getLink() {
		return link;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
}
