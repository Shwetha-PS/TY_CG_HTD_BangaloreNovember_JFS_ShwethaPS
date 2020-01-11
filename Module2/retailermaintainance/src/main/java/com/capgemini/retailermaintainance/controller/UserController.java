package com.capgemini.retailermaintainance.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintainance.dto.UserInfo;
import com.capgemini.retailermaintainance.dto.UserResponse;
import com.capgemini.retailermaintainance.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping(path = "/auth", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse auth(@RequestBody UserInfo bean) {
		UserInfo userBean = service.auth(bean.getEmail(), bean.getPassword());

		UserResponse response = new UserResponse();
		if (userBean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Found For the credentials");
			response.setBeans(Arrays.asList(userBean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Credentials Invalid");
		}
		return response;
	}

	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse register(@RequestBody UserInfo bean) {
		UserResponse response = new UserResponse();
		if (service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Registered");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Email already exists");
		}
		return response;
	}

}
