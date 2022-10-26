<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="board.bean.BoardDTO"%> 
<%@page import="board.dao.BoardDAO"%> 
  <% request.setCharacterEncoding("UTF-8"); 
   String id = (String)session.getAttribute("memId");
   String name = (String)session.getAttribute("memName");
   String email = (String)session.getAttribute("memEmail");
   String subject = request.getParameter("subject"); 
   String content = request.getParameter("content"); 
   Map<String, String> map = new HashMap<String, String>();
   map.put("id", id);
   map.put("name", name);
   map.put("email", email);
   map.put("subject", subject);
   map.put("content", content);
	BoardDAO boardDAO = BoardDAO.getInstance();
int su = boardDAO.boardWrite(map);%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(su == 1) { %>
 작성한 글을 저장했습니다
 <% } else {%>
 저장실패
 <% } %>
 <button type ="button" onclick="location.href='./boardList.jsp?pg=1'">목록</button>
 <button type ="button" onclick="history.go(-1)">뒤로</button>
 <button type ="button" onclick="location.href='../index.jsp'">메인</button>
 

</body>
</html>