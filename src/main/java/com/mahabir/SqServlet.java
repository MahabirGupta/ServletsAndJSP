package com.mahabir;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
//	create a doGet() method
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int sum =  (int) request.getAttribute("sum");
		
		int product = sum * sum;
		
		PrintWriter out = response.getWriter();
		out.println("Result = " + product);
		
	}

}
