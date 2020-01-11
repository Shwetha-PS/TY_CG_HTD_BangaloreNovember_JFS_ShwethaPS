package com.capgemini.retailermaintainance.service;

import java.util.List;

import com.capgemini.retailermaintainance.dto.ProductInfo;

public interface ProductService {
	public List<ProductInfo> searchproduct(int product_id);

	public boolean updatePassword(int id, String password);

}
