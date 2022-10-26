package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init() {
		System.out.println("init() 메소드");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get()메소드");
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();//생성
		out.println("<html>");
		out.println("<body>");
		out.println("Hello Servlet!!");
		out.println("<br>");
		out.println("안녕하세요 서블릿!!");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	public void destroy() {
		System.out.println("destroy()메소드");
	}
}
