package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.services.EmployeeServiceImpl;
import com.capgemini.mywebapp.services.EmployeeServices;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {

	private EmployeeServices service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if(session!=null) {
			//Valid Session
			int empId = Integer.parseInt(req.getParameter("empId"));

			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(service.deleteEmployee(empId)) {
				out.println("<h3 style = 'color:red'>Employee record for "+empId+ " Deleted!!!</h3>");
			}else {
				out.println("<h3 style = 'color:red'> Employee Id "+empId+ "Not Found!!!</h3>");
			}
			out.println("</html>");
			out.println("</body>");
			
			req.getRequestDispatcher("./deleteEmpForm.html").include(req, resp);
			
		}else {
			//Invalid Session
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style = 'color: red'>Please Login First!!!!</h3>");
			out.println("</body>");
			out.println("</html>");
			
			req.getRequestDispatcher("./loginPage.html").include(req, resp);

		}//End of if-else
		}//End of doGet()
	}//End of Class
