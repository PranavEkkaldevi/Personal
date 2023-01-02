package com.coder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/First")
public class First implements Servlet{
	
	ServletConfig config = null;
	
	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed");
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return "copyright 2007-1010";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Servlet is initialized.");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html");
		
		PrintWriter printWriter = arg1.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<b>Hello simple servlet</b>");
		printWriter.print("</body></html>");
	}

}
