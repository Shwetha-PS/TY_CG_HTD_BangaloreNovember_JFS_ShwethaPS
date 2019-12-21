package com.capgemini.mywebapp.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		//Get the Query String
		  String idVal = req.getParameter("id");
		  
		//Get the context Param
			ServletContext context = getServletContext();
			String contextParamVal1 = context.getInitParameter("myContextParam");
			
		  resp.setContentType("text/html");
		  PrintWriter out = resp.getWriter();
		  out.println("<html>");
		  out.println("<body>");
		  out.println("Employee Id = "+idVal);
		  out.println("<br> Name = Shwetha");
		  out.println("<br> Salary = 6lpa");
		  
		  
		  out.println("<br><br>Context Param Value = "+contextParamVal1);
		  
		  out.println("</body>");
		  out.println("</html>");
		  
	}//End of doGet()
}//End of class
