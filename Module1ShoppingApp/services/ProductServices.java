package com.capgemini.module1.services;

import java.util.List;

import com.capgemini.module1.bean.ProductBean;

public interface ProductServices {
	public List<ProductBean> allProduct();
	public List<ProductBean> searchProduct(String name);
	
}
