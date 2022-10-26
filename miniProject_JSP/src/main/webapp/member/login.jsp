<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="member.bean.MemberDTO"%> 
<%@page import="member.dao.MemberDAO"%> 
  <% request.setCharacterEncoding("UTF-8"); 
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	Map<String, String> map = new HashMap<String, String>(); 
	 map.put("id",id);
	 map.put("pwd",pwd);
	MemberDAO memberDAO = MemberDAO.getInstance();
List<MemberDTO> list = memberDAO.memberlogin(map);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <% 
  if(list.isEmpty()){
	//  response.sendRedirect("loginOk.jsp?name="+name);
	//	HttpSession //session = request.getSession(); 
		//세션생성
		//페이지이동
		  response.sendRedirect("loginFail.jsp");
  }
	  else{
		  String name = list.get(0).getName();
			String email = list.get(0).getEmail1()+"@"+list.get(0).getEmail2();
		session.setAttribute("memName", name);
		session.setAttribute("memId", id);
		session.setAttribute("memEmail", email);
		response.sendRedirect("loginOk.jsp?name="+name);
}
  %>

</body>
</html>