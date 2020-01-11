package com.capgemini.retailermaintainance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintainance.dao.UserDAO;
import com.capgemini.retailermaintainance.dto.ProductInfo;
import com.capgemini.retailermaintainance.dto.UserInfo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public UserInfo auth(String email, String password) {
		return dao.auth(email, password);
	}

	@Override
	public boolean register(UserInfo bean) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);

//		List<ProductInfo> info = bean.getInfo();
//		for (ProductInfo productInfo : info) {
//			productInfo.setUserid(bean);
//		}
	return dao.register(bean);
	}

}
