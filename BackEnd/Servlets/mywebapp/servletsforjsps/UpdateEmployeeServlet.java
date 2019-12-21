package com.capgemini.mywebapp.servletsforjsps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;
import com.capgemini.mywebapp.services.EmployeeServices;

@WebServlet("/updateEmployee2")
public class UpdateEmployeeServlet extends HttpServlet {
	private EmployeeServices service = new  EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Validate the session
		HttpSession session = req.getSession();
		if(session!=null) {
			//valid session
			//Get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String name = req.getParameter("name");
			String ageVal = req.getParameter("age");  
			String salaryVal = req.getParameter("salary");
			String designation = req.getParameter("designation");
			String password = req.getParameter("password");

			EmployeeInfoBean employeeInfoBean = new  EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setName(name);
			if(ageVal!=null && !ageVal.isEmpty() ) {
				int age = Integer.parseInt(ageVal);
				employeeInfoBean.setAge(age);
			}
			if(salaryVal!=null && !salaryVal.isEmpty()) {
				double sal = Double.parseDouble(salaryVal);
				employeeInfoBean.setSalary(sal);
			}
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);

			boolean isUpdated = service.updateEmployee(employeeInfoBean);
			if(isUpdated) {
				req.setAttribute("msg", "Employee Details Updated");
			}else {
				req.setAttribute("msg", "Unable to Update successfully");
			}
			req.getRequestDispatcher("./updateEmpJsp.jsp").forward(req, resp);

		}
		else {
			//Invalid session
			req.setAttribute("msg", "Please login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}//End of doPost()
}//End of class
