<%@page import="member.bean.MemberDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="board.dao.BoardDAO"%>
<%@page import="board.bean.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 	BoardDAO  boardDAO = BoardDAO.getInstance();
    int seq = Integer.parseInt(request.getParameter("seq"));
    int hit = Integer.parseInt(request.getParameter("hit"));
    int pg = Integer.parseInt(request.getParameter("pg"));
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("seq", seq);
	map.put("hit", hit);
	boardDAO.hitupdate(map);
	BoardDTO boardDTO = boardDAO.boardListSelect(map); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
    pre {    
    white-space: pre-wrap;
    word-break: break-all;
    overflow: auto;    
  }		
  </style>
</head>
<body>
	<table border="1" cellpadding="6"cellspacing="0">
				<tr>
					<th>제목</th>
					<td>
					<%=boardDTO.getSubject() %>
					</td>
					<th width="50">글번호</th>
					<td><%= seq %></td>
					<th width="50">조회수</th>
					<td><%= boardDTO.getHit() %></td>
				</tr>
				<tr>
					<th>내용</th>
					<td colspan="5" height="300px" width="300px">
					<pre><%= boardDTO.getContent() %></pre>
					</td>
				</tr>
				<tr>
					<th colspan="6" align="center">
						<button type ="button"  onclick="location.href='./boardList.jsp?pg=<%=pg%>'">목록</button>
						<input type="button" value="메인메뉴" onclick="location.href='../index.jsp'">
					</th>
				</tr>	
	</table>
</body>
</html>