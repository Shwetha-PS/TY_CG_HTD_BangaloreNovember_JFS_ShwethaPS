package com.capgemini.retailermaintainance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintainance.dao.ProductDAO;
import com.capgemini.retailermaintainance.dto.ProductInfo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;

	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public List<ProductInfo> searchproduct(int product_id) {
		return dao.searchproduct(product_id);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		return dao.updatePassword(id, encoder.encode(password));
	}

}
