package com.capgemini.retailermaintainance.service;

import com.capgemini.retailermaintainance.dto.UserInfo;

public interface UserService {
	public UserInfo auth(String email, String password);
	public boolean register(UserInfo bean);
}
