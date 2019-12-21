package com.capgemini.jdbc.dao;
import com.capgemini.jdbc.bean.UserBean;

public interface UserDAO 
{
	public UserBean userLogin(String username, String password);
	

}
