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
@WebServlet("/searchEmployee3")

public class GetEmployeeServlet extends HttpServlet {
	private EmployeeServices service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//validate the session
		HttpSession session = req.getSession(false);
		if(session!=null) {
			//Valid credentials
			//Get the Form Data
			int empId = Integer.parseInt(req.getParameter("empId"));
			EmployeeInfoBean employeeInfoBean = service.searchEmployee(empId);
			req.setAttribute("employeeInfoBean", employeeInfoBean);
			req.getRequestDispatcher("./SearchEmpFormJsp.jsp").forward(req, resp);
			
		}else {
			//Invalid credentials
			req.setAttribute("msg", "Please Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);	
		}


	}//End of doGet()

}//End of class
