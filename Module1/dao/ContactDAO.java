package com.capgemini.jdbc.dao;

import java.util.List;

import com.capgemini.jdbc.bean.ContactBean;

public interface ContactDAO {
	public List<ContactBean>getAllContact();
	public boolean deleteContact(String name);
	public boolean updateContact(String name);
	boolean insertContact(ContactBean bean);
	
}
