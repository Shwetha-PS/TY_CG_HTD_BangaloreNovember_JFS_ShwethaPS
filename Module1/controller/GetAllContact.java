package com.capgemini.jdbc.controller;

import java.util.List;

import com.capgemini.jdbc.bean.ContactBean;
import com.capgemini.jdbc.services.ContactServices;

public class GetAllContact {
	public static void main(String[] args) {
		ContactServices services = ContactFactory.instanceOfContactServices();
		List<ContactBean> list = services.GetAllContact();

		if(list!=null) {
			for (ContactBean contact : list) {
				System.out.println(contact);
			}
		}

	}

}
