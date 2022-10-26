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
String name = memberDAO.memberlogin(map);%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
  <% 
  if(name!=null){
	//  response.sendRedirect("loginOk.jsp?name="+name);
	//	HttpSession //session = request.getSession(); 
		//세션생성
		//session.setAttribute("memName", name);
		//쿠키 이용해보기
		Cookie cookie = new Cookie("memName",name);	
		cookie.setMaxAge(30*60);//초
		
		Cookie cookie2 = new Cookie("memId",id);
		cookie2.setMaxAge(30*60);
		
		//send to client
		response.addCookie(cookie);
		response.addCookie(cookie2);
		//페이지이동
		response.sendRedirect("loginOk.jsp?name="+name);
  }
	  else{
		  response.sendRedirect("loginFail.jsp");
}
  %>

<%-- <%if(su!= null) {%>
			<%=su %>님 로그인
			<%}else {%>
		아이디 또는 비밀번호가 틀렷습니다
			<%}%> --%>

<script type="text/javascript">
<%-- window.onload=function(){
	<%if(su!= null) {%>
			alert("<%=su %>님 로그인");
			
				<%}else {%>
		alert("아이디 또는 비밀번호가 틀렷습니다");
		location.href = 'loginForm.jsp';
			<%}%>
} --%>
</script>
</body>
</html>