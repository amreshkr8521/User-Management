package com.bridgelabz.usermanagement.services;

import com.bridgelabz.usermanagement.model.LoginModel;

/**
 * contains only the method declaration for the user Management
 * 
 * @author amresh kumar
 * @since 1.0
 *
 */
public interface ILoginDAO {
	public LoginModel getUser(String name, String pwd);

	public int addUser(LoginModel model);

}
