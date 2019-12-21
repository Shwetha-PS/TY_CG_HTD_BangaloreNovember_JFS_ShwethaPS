package com.capgemini.jdbc.services;

import com.capgemini.jdbc.bean.UserBean;

public interface UserServices
{
	public UserBean userLogin(String username, String password);
	
	

}
