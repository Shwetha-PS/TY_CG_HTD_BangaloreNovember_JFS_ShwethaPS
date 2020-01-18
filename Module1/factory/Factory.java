package com.capgemini.module1.factory;

import com.capgemini.module1.bean.ProductBean;
import com.capgemini.module1.dao.ProductDao;
import com.capgemini.module1.dao.ProductDaoImpl;
import com.capgemini.module1.services.ProductServices;
import com.capgemini.module1.services.ProductServicesImpl;

public class Factory {
	private Factory() {
		
	}
	public static ProductServices getServ1() {
		ProductServicesImpl serv = new ProductServicesImpl();
		return (ProductServices) serv;
	}
	
	public static ProductDao getDao() {
		ProductDaoImpl dao = new ProductDaoImpl();
		return (ProductDao) dao;
	}

	public static ProductBean getBean() {
		ProductBean bean = new ProductBean();
		return bean;
	}
}
