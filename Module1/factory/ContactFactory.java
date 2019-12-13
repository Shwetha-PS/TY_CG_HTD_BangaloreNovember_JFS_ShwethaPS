package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.ContactDAO;
import com.capgemini.jdbc.dao.ContactDAOImpl;
import com.capgemini.jdbc.services.ContactServices;

public class ContactFactory {
	private ContactFactory() {
		
	}
	public static ContactDAO instanceOfUserDAOImpl() {
		ContactDAO dao = new ContactDAOImpl();
		return dao;
	}
	
	public static ContactServices instanceOfContactServices() {
		ContactServices services = new ContactServices();
		return services;
	}
}
