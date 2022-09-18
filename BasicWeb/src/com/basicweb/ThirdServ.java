package com.basicweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ThirdServ")
public class ThirdServ extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service method from third servlet");
		PrintWriter pw = arg1.getWriter();
		pw.print("Messge from third servlet program, Thak you for contacting");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method from third servlet");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method from third servlet");
	}

}
