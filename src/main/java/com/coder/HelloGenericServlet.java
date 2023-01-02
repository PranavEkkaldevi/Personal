package com.coder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;

//@WebServlet("/HelloWorld")
public class HelloGenericServlet extends GenericServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1>Hello Wolrd example using"+" GenericServlet class.</h1>");
		printWriter.close();
	}

	
}
