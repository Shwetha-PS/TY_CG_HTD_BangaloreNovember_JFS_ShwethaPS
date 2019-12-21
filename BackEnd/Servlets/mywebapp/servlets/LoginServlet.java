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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private EmployeeServices service = new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the form Data
		String empIdVal = req.getParameter("empId");
		String password = req.getParameter("password");

		int empId = Integer.parseInt(empIdVal);

		EmployeeInfoBean employeeInfoBean = service.authenticate(empId, password);
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		if(employeeInfoBean!=null) {
			//Valid Credentials
			HttpSession session = req.getSession(true);    /*whenever we are creating a session we need to pass true for boolean.
			 *(or) we can use no argument parameter....
			 */
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			out.println("<h2 style ='color:blue'> Welcome "+employeeInfoBean.getName()+ "!</h2>");
			out.println("<br><a href = './addEmpForm.html'> Add Employee</a>");
			out.println("<br><a href = '#'> Update Employee</a>");
			out.println("<br><a href = './searchEmpForm.html'> Search Employee</a>");
			out.println("<br><a href = './deleteEmpForm.html'> Delete Employee</a>");
			out.println("<br><a href = '#'> See All Employee</a>");
			out.println("<br><a href = './logout'> Logout</a>");
				
		}else {
			//Invalid Credentials
			out.println("<h3 style ='color: red'> invalid Credentials</h3> ");
			req.getRequestDispatcher("./loginPage.html").include(req, resp);

		}//end of if-else
		out.println("</body>");
		out.println("</html>");


	}//End of doPost()

}//End of class
