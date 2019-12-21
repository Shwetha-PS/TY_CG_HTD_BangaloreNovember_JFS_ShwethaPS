package com.capgemini.mywebapp.services;

import java.util.List;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.dao.EmployeeDAO;
import com.capgemini.mywebapp.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeServices {

	private EmployeeDAO dao = new EmployeeDAOImpl(); 
		
	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
		return dao.searchEmployee(empId);
	}//End of searchEmployee()

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
	}//End of authenticate()

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.addEmployee(employeeInfoBean);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.updateEmployee(employeeInfoBean);
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		return dao.getAllEmployees();
	}
	
	
}//End of class
