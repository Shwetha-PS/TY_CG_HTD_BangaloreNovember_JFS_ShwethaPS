package com.capgemini.retailermaintainance.dao;

import com.capgemini.retailermaintainance.dto.UserInfo;

public interface UserDAO {
	public UserInfo auth(String email, String password);
	public boolean register(UserInfo bean);
}
