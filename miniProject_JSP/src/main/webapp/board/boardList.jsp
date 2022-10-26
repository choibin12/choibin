<%@page import="board.bean.BoardPaging"%>
<%@page import="board.bean.BoardDTO"%>
<%@page import="board.dao.BoardDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Date"%>
    
<%
	//데이터
	int pg = Integer.parseInt(request.getParameter("pg"));

	//페이징 처리 - 1페이지당 5개씩
	int endNum = pg*5;
	int startNum = endNum-4;
	
	
	BoardDAO  boardDAO = BoardDAO.getInstance();
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("startNum", startNum);
	map.put("endNum", endNum);
	List<BoardDTO> list = boardDAO.boardlist(map);
	int totalA = boardDAO.getTotalA();//총글수
	BoardPaging boardPaging = new BoardPaging();
	boardPaging.setCurrentPage(pg);
	boardPaging.setPageBlock(3);
	boardPaging.setPageSize(5);
	boardPaging.setTotalA(totalA);
	boardPaging.makingPagingHTML();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#currentPaging{
	border: 1px solid;
	padding: 5px 10px;
	
	text-decoration: underline;
	cursor: pointer;
}
#paging{
	cursor: pointer;
	color: black;
	padding:5px 10px;
	text-decoration: none;
	margin: 2px;
} 
#main{
	position: relative;
	top: -30px;
}
.subjectA:hover {
	text-decoration: underline;
	color:green;
}		
.subjectA{
	color:black;
	text-decoration: none;
}
</style>
</head>
<body>
<table border="0" cellpadding="5" cellspacing="0" >
			<tr>
				<th width="50">글번호</th>
				<th width="100">제목</th>
				<th width="70">작성자</th>
				<th width="50">조회수</th>
				<th width="100">작성일</th>
			</tr>				
			<hr>
<%  if(list != null){%>
<%	for(int i=0;i<list.size();i++){
		BoardDTO boardDTO = list.get(i);%>
			<tr>
				<td align="center"><%=boardDTO.getSeq()%></td>
				<td onclick="islogin(<%=boardDTO.getSeq()%>)"><a class="subjectA" id="<%=boardDTO.getSeq()%>" 
				href="./boardListSelect.jsp?seq=<%=boardDTO.getSeq()%>&hit=<%=boardDTO.getHit()+1%>&pg=<%=pg %>">
				<%=boardDTO.getSubject()%></a></td>
				<td align="center"><%=boardDTO.getName() %></td>
				<td align="center"><%=boardDTO.getHit() %></td>
				<td align="center"><%=boardDTO.getLogtime() %></td>
			</tr>
		<%}%>		
	<%}%>
		</table>
	<!--페이지 번호  -->
	<div align="center">
	<%= boardPaging.getPagingHTML() %>
	</div>
<div id="main">
 <button  type ="button" onclick="location.href='../index.jsp'">메인</button>
</div>	
</body>
<script type="text/javascript">
function boardPaging(pg) {
	location.href="boardList.jsp?pg="+pg;
	
}
function islogin(id) {
	<% if((String)session.getAttribute("memName")==null){ %>
		alert("먼저 로그인하세요");
		document.getElementById(id).removeAttribute("href");
	<%}%>
}
</script>
</html>