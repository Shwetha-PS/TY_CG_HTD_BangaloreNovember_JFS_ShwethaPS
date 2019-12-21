package com.capgemini.mywebapp.servletsforjsps;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;
import com.capgemini.mywebapp.services.EmployeeServices;
@WebServlet("/seeAllEmployees")
public class SeeAllEmployeeServlet extends HttpServlet {
	private EmployeeServices service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//validate the session
		HttpSession session = req.getSession(false);
		if(session!=null) {
			//Valid session
			List<EmployeeInfoBean> employeeslist = service.getAllEmployees();
			if(employeeslist!=null && !employeeslist.isEmpty()) {
				req.setAttribute("employeesList", employeeslist);
			}else {
				req.setAttribute("msg", "There is no employee record to display");
			}
			req.getRequestDispatcher("./seeAllEmployeesJsp.jsp").forward(req, resp);

		}else {
			//Invalid session
			req.setAttribute("msg", "Please Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}

	}//End of doGet()
}//End of class
