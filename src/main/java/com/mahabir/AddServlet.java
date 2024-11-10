package com.mahabir;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class AddServlet extends HttpServlet  {
	
//	create a method to perform the add operation
//	must use the name service for the method
	
//	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		
//		int firstNumber = Integer.parseInt(request.getParameter("num1"));
//		int secondNumber = Integer.parseInt(request.getParameter("num2"));
//		int sum = firstNumber + secondNumber;
//		System.out.println("Sum = " + sum);
//		
//		PrintWriter out = response.getWriter();
//		out.println("Sum = " + sum);
//		
////		or
////		response.getWriter().println("Sum = " + sum);
//		
//	}
	
//	use doPost method
	
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		
//		int firstNumber = Integer.parseInt(request.getParameter("num1"));
//		int secondNumber = Integer.parseInt(request.getParameter("num2"));
//		int sum = firstNumber + secondNumber;
//		System.out.println("Sum = " + sum);
//		
//		PrintWriter out = response.getWriter();
//		out.println("Sum = " + sum);
////		
//////		or
//////		response.getWriter().println("Sum = " + sum);
////		
//	}

//	use doGet method
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int firstNumber = Integer.parseInt(request.getParameter("num1"));
		int secondNumber = Integer.parseInt(request.getParameter("num2"));
		int sum = firstNumber + secondNumber;
		

		System.out.println("Sum = " + sum);
		
		request.setAttribute("sum", sum);
		
//		Do not want to print in this servlet
		
//		PrintWriter out = response.getWriter();
//		out.println("Sum = " + sum);
//		
////		or
////		response.getWriter().println("Sum = " + sum);
		
//		to call another servlet
//		1. Use Request Dispatcher
//		2. Redirect
		
//		using Request Dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("sq");
		requestDispatcher.forward(request, response);
	}
}
