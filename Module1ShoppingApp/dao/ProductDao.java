package com.capgemini.module1.dao;

import java.util.List;

import com.capgemini.module1.bean.ProductBean;

public interface ProductDao {
	public List<ProductBean> allProduct();
	List<ProductBean>searchProduct(String name);
	boolean deleteProduct();
	
}
