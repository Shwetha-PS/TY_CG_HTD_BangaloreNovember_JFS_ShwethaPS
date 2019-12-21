package com.capgemini.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class ReDirectServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String url = "http://www.instagram.com";  //External Resource
		String url = "./currDate";   //Internal Resource
		resp.sendRedirect(url);
		
	}//End od doGet()
}//End of class
