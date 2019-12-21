package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the cookies
		Cookie[] cookies = req.getCookies();
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		req.getRequestDispatcher("./cookiePage.html").include(req, resp);

		out.println("<html>");
		out.println("<body>");
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				out.println("<br>Cookie Name = "+cookie.getName());
				out.println("<br>Cookie Value = "+cookie.getValue());
			}
		}else {
			out.println("<br><h2>Cookies Not Found</h2>");
		}
		out.println("</body>");
		out.println("</html>");


	}//End of doGet()
}//End of Class
