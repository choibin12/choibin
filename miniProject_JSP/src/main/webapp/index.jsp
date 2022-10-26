<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>메인화면</h3>
<hr>
<h1>
<% if((String)session.getAttribute("memName")!=null){ %>
<a href="http://localhost:8080/miniProject_JSP/member/logout.jsp">로그아웃</a><br>
<a href="http://localhost:8080/miniProject_JSP/board/boardWriteForm.jsp">글쓰기</a><br>
<% } else { %>
<a href="http://localhost:8080/miniProject_JSP/member/writeForm.jsp">회원가입</a><br>
<a href="http://localhost:8080/miniProject_JSP/member/loginForm.jsp">로그인</a><br>
<% } %>
<a href="http://localhost:8080/miniProject_JSP/board/boardList.jsp?pg=1">목록</a><br>
</h5>
</body>
</html>

<%-- index.jsp메인화면 
	1.세션있을때 로그아웃,글쓰기,목록
	없을때 회원가입 로그인 목록
	if문 써서
	
	2.세션등록
	memId
	memName
	memEmail -> @~~.com
	
	3.글쓰기
	folder:board
	
	package : board.dao
	package : BoardDAO.java
 --%>