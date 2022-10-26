package com.person;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;


@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init() throws ServletException{
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//데이터
		String name = request.getParameter("name");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String color = request.getParameter("color");
		String []hobby = request.getParameterValues("hobby");
		String []subject = request.getParameterValues("subject");
		
		//응답
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();//생성
		out.println("<html>");
		out.println("<style>");
		out.println("li{color : "+request.getParameter("color")+";}");
		out.println("</style>");
		
		out.println("<body>");
		out.println("<ul>");
		out.println("<li>이름 : "+name+"</li>");
		out.println("<li>성별 : "+gender+"</li>");
		out.println("<li>색깔 : "+color+"</li>");
		out.println("<li>취미 : ");
		for(int i=0; i<hobby.length; i++) {
			out.println(hobby[i]+"&nbsp;");
		}
		out.println("</li>");
		out.println("<li>과목 :");
		for(String data : subject) {
			out.println(data+"&emsp;");
		}
		out.println("</li>");
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}


	public void destroy() {
		
	}
    

}
