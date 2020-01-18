package com.capgemini.module1.services;

import java.util.List;

import com.capgemini.module1.bean.ProductBean;
import com.capgemini.module1.dao.ProductDaoImpl;
import com.capgemini.module1.factory.Factory;

public class ProductServicesImpl implements ProductServices {

	ProductDaoImpl dao = (ProductDaoImpl) Factory.getDao();
	@Override
	public List<ProductBean> allProduct() {
		return dao.allProduct();
	}

	@Override
	public List<ProductBean> searchProduct(String name) {
		// TODO Auto-generated method stub
		return dao.searchProduct(name);
	}


}
