package com.capgemini.retailermaintainance.dao;

import java.util.List;

import com.capgemini.retailermaintainance.dto.ProductInfo;

public interface ProductDAO {

	public List<ProductInfo> searchproduct(int product_id);

	public boolean updatePassword(int id, String password);

}
