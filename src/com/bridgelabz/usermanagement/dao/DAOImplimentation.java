package com.bridgelabz.usermanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.bridgelabz.usermanagement.model.LoginModel;
import com.bridgelabz.usermanagement.services.ILoginDAO;

/**
 * This class contains the method to get the data rom the database and send the
 * data to the database
 * 
 * @author Amresh kumar
 * @version 1.0
 *
 */
public class DAOImplimentation implements ILoginDAO {
	JDBCConnection connection = new JDBCConnection();
	PreparedStatement preparedstatement;
	static LoginModel model = null;

	/**
	 * to get the user informaion from the database
	 * 
	 * @param email string
	 * @param pwd   String
	 * @return LoginModel
	 */
	@Override
	public LoginModel getUser(String email, String pwd) {
		model = new LoginModel();
		try {
			Connection con = connection.jdbcConnection();
			String qry = "SELECT * FROM customer WHERE email='" + email + "' and password='" + pwd + "';";
			preparedstatement = con.prepareStatement(qry);
			ResultSet resultSet = preparedstatement.executeQuery(qry);

			while (resultSet.next()) {

				model.setEmail(resultSet.getString(4));
				model.setPwd(resultSet.getString(8));
				model.setFirstName(resultSet.getString(2));
				model.setLastName(resultSet.getString(3));
				model.setMobileNo(resultSet.getString(5));
				model.setGender(resultSet.getString(6));
				model.setAge(resultSet.getString(7));
				model.setLocation(resultSet.getString(9));

			}
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		return model;
	}

	/**
	 * To fetch the user data from the database
	 * 
	 * @param email  String
	 * @param mobile String
	 * @return LoginModel
	 */
	public LoginModel getData(String email, String mobile) {
		model = new LoginModel();
		try {
			Connection con = connection.jdbcConnection();
			String qry = "SELECT * FROM customer WHERE email='" + email + "' AND mobile='" + mobile + "';";
			preparedstatement = con.prepareStatement(qry);
			ResultSet resultSet = preparedstatement.executeQuery(qry);

			while (resultSet.next()) {

				model.setEmail(resultSet.getString(4));
				model.setPwd(resultSet.getString(8));
				model.setFirstName(resultSet.getString(2));
				model.setLastName(resultSet.getString(3));
				model.setMobileNo(resultSet.getString(5));
				model.setGender(resultSet.getString(6));
				model.setAge(resultSet.getString(7));
				model.setLocation(resultSet.getString(9));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	/**
	 * to alter the user password of the user
	 * 
	 * @param email    String
	 * @param password String
	 * @return int
	 */
	public int alterUser(String email, String password) {
		int status = 0;
		try {
			Connection con = connection.jdbcConnection();
			String qry = "update customer set password='" + password + "' where email='" + email + "';";
			preparedstatement = con.prepareStatement(qry);
			status = preparedstatement.executeUpdate();

		} catch (Exception e) {
			e.getStackTrace();
		}
		System.out.println(status);
		return status;
	}

	/**
	 * To add a user in the database
	 * 
	 * @param model LoginModel
	 * @return int
	 */
	@Override
	public int addUser(LoginModel model) {
		int status = 0;
		try {
			Connection con = connection.jdbcConnection();
			String qry = "insert into customer (FirstName,LastName,email,mobile,gender, age,password,location )  values('"
					+ model.getFirstName() + "','" + model.getLastName() + "','" + model.getEmail() + "','"
					+ model.getMobileNo() + "','" + model.getGender() + "','" + model.getAge() + "','" + model.getPwd()
					+ "','" + model.getLocation() + "');";
			preparedstatement = con.prepareStatement(qry);
			status = preparedstatement.executeUpdate();

		} catch (Exception e) {
			e.getStackTrace();
		}
		return status;
	}

	/**
	 * To check if the email is present in database or not
	 * 
	 * @param email String
	 * @return boolean
	 */
	public boolean IsEmail(String email) {
		Connection con = connection.jdbcConnection();
		String qry = "SELECT email FROM customer WHERE email='" + email + "';";
		try {
			preparedstatement = con.prepareStatement(qry);
			ResultSet resultSet = preparedstatement.executeQuery();
			resultSet.next();
			if (resultSet.getString(1).equals(email)) {

				return true;
			} else {

				return false;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return false;
	}

	/**
	 * To fetch the name of the users from the database
	 * 
	 * @param qry String
	 * @return LinkedList<String>
	 */
	public LinkedList<String> getData(String qry) {
		LinkedList<String> obj = new LinkedList();
		try {
			Connection con = connection.jdbcConnection();
			preparedstatement = con.prepareStatement(qry);
			ResultSet resultSet = preparedstatement.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString(1);
				obj.add(name);
			}

		} catch (Exception e) {
			e.getStackTrace();
		}
		return obj;
	}

	/**
	 * To update the databse
	 * 
	 * @param qry String
	 * @return int
	 */
	public int update(String qry) {
		int status = 0;
		System.out.println(qry);
		try {
			Connection con = connection.jdbcConnection();

			preparedstatement = con.prepareStatement(qry);

			status = preparedstatement.executeUpdate();

		} catch (Exception e) {
			e.getStackTrace();
		}
		return status;
	}

}
