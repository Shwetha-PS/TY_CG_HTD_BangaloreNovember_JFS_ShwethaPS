package com.capgemini.mywebapp.servlets;

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
@WebServlet("/serachEmployee2")
public class SearchEmployeeServlet2 extends HttpServlet {

	private EmployeeServices service = new EmployeeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false); //we have to pass false because we need not create a new session.
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		out.println("<html>");
		out.println("<body>");
		if(session!=null) {
			//valid session
			 String empIdVal2 = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal2);

			EmployeeInfoBean employeeInfoBean = service.searchEmployee(empId);
			if(employeeInfoBean!=null) {
				out.println("<h3> Employee Id = "+empId+ "Found-  </h3>");
				out.println("<br> Name = "+employeeInfoBean.getName());
				out.println("<br> Age = "+employeeInfoBean.getAge());
				out.println("<br>Salary = "+employeeInfoBean.getSalary());
				out.println("<br> Designation = "+employeeInfoBean.getDesignation());
			}else {
				out.println("<h3 style ='color:red'>Employee ID "+empId+ "NOT FOUND! </h3>");
			}

		}else {
			//Invalid session
			out.println("Please Login First!");
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
		}
		out.println("</body>");
		out.println("</html>");



	}//End of doGet()
}//End of class
