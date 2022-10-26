<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="member.bean.MemberDTO"%> 
<%@page import="member.dao.MemberDAO"%> 
  <% request.setCharacterEncoding("UTF-8"); 
  String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String gender = request.getParameter("gender");
	String email1 = request.getParameter("email1");
	String email2 = request.getParameter("email2");
	String tel1 = request.getParameter("tel1");
	String tel2 = request.getParameter("tel2");
	String tel3 = request.getParameter("tel3");
	String zipcode = request.getParameter("zipcode");
	String addr1 = request.getParameter("addr1");
	String addr2 = request.getParameter("addr2");
	Map<String, String> map = new HashMap<String, String>();
   map.put("name",name);
   map.put("id",id);
   map.put("pwd",pwd);
   map.put("gender",gender);
   map.put("email1",email1);
   map.put("email2",email2);
   map.put("tel1",tel1);
   map.put("tel2",tel2);
   map.put("tel3",tel3);
   map.put("zipcode",zipcode);
   map.put("addr1",addr1);
   map.put("addr2",addr2);
	MemberDAO memberDAO = MemberDAO.getInstance();
int su = memberDAO.memberWrite(map);%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <% if(su == 1) { %>
<h3>
회원가입 성공
</h3>
 <% } else {%>
<h3>
 회원가입 실패
</h3>
 <% } %> --%>
 <script type="text/javascript">
 window.onload=function(){
	<% if(su==1){%>
 	alert("회원가입 성공");
 	location.href = '../index.jsp';
	 <% } else {%>
	alert("회원가입 실패")	
 <% } %>
 }
 </script>
</body>
</html>
<!-- 1.중복체크버튼 안누르면
	alert("아이디 중복체크 필수")
	2.아이디 변경했을때 다시 중복체크 버튼 
  -->
