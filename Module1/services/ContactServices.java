package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.ContactBean;
import com.capgemini.jdbc.bean.UserBean;

public class ContactServices {
	public List<ContactBean>getAllContact();
	public boolean deleteContact(String name);
	public boolean insertContact(String name);
	public boolean updateContact(String name);
	
	
	/*
	 * 
	 * public List<UserBean>getAllUsers();
	public UserBean userLogin(String name, String password);
	public boolean updateUser(int userid, String password, String email);
	public boolean deleteUser(int userid, String password);
	//public boolean insertUser(int userid, String username, String password, String emailid);
	public boolean insertUser(UserBean user);
}
	 */

}
