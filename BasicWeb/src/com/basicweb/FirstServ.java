package com.basicweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServ implements Servlet {

	@Override
	public void destroy() {
		System.out.println("destroy method");//this will get called on shutdown of the server
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("INIT MTEHOD");//this is called or the first reqeust only
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("SERVICE METHOD");// tis is called on each request
		PrintWriter pw = arg1.getWriter();
		pw.print("Messge from servlet program, Thak you for contacting");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("GET SERVLET CONFIG METHOD");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("GET SERVLET INFO METHOD");
		return null;
	}

}
