package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.jdbc.bean.ContactBean;

public class ContactDAOImpl implements ContactDAO {
	FileReader reader;
	Properties prop;
	ContactBean bean;
	
	public ContactDAOImpl() {
	try {
		reader = new FileReader("db.properties");
		prop = new Properties();
		prop.load(reader);
		Class.forName(prop.getProperty("driverClass"));
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	@Override
	public List<ContactBean> getAllContact() {
		List<ContactBean> list = new ArrayList<ContactBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				ContactBean bean = new ContactBean();
				bean.setName(rs.getString(1));
				bean.setNumber(rs.getInt(2));
				bean.setGroup(rs.getString(3));
				list.add(bean);
			}return list;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}   
	
	@Override
	public boolean insertContact(ContactBean bean) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery"))){
			pstmt.setString(1, bean.getName());
			pstmt.setLong(2,bean.getNumber());
			pstmt.setString(3, bean.getGroup());
			int count = pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

	@Override
	public boolean deleteContact(String name) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean updateContact(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}
