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

@WebServlet("/deleteEmployee2")
public class DeleteEmployeeServlet extends HttpServlet {
	private EmployeeServices service = new  EmployeeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Validate the session
		HttpSession session = req.getSession(false);
		if(session!=null) {
			//Valid Session
			//Get paramater data
			int empId = Integer.parseInt(req.getParameter("empId"));
			boolean isDeleted = service.deleteEmployee(empId);
			if(isDeleted) {
				req.setAttribute("msg", "Record for empId "+empId+ " is deleted!!");
			}else {
				req.setAttribute("msg", "Employee Id "+empId+ " Not found");
			}
			req.getRequestDispatcher("./deleteEmpFormJsp.jsp").forward(req, resp);

		}else {
			//Invalid session
			req.setAttribute("msg", "Please Login First!!!!");
			req.getRequestDispatcher("./loginForm").forward(req, resp);	
		}


	}//End of doGet()
}//End of class
