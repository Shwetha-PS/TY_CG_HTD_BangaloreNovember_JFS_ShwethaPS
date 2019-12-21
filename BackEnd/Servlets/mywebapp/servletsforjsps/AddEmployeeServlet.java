package com.capgemini.mywebapp.servletsforjsps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;
import com.capgemini.mywebapp.services.EmployeeServices;

@WebServlet("/addEmployee2")
public class AddEmployeeServlet extends HttpServlet {
	private EmployeeServices service = new  EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Validate the session
		HttpSession session = req.getSession(false);
		if(session!=null) {
			//validate session
			//Get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));  
			double salary = Double.parseDouble(req.getParameter("salary"));
			String designation = req.getParameter("designation");
			String password = req.getParameter("password");

			EmployeeInfoBean employeeInfoBean = new  EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setName(name);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);

			boolean isAdded = service.addEmployee(employeeInfoBean);
			if(isAdded) {
				req.setAttribute("msg", "Employee Details Added");
			}else {
				req.setAttribute("msg", "Unable to Add");
			}
			req.getRequestDispatcher("./addEmpFormjsp.jsp").forward(req, resp);


		}else {
			//Invalidate session
			req.setAttribute("msg", "Please Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}


	}//end of doPost()
}//End of class
