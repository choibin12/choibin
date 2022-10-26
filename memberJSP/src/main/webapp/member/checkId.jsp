<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="member.bean.MemberDTO"%> 
<%@page import="member.dao.MemberDAO"%> 
  <% request.setCharacterEncoding("UTF-8"); 
	String id = request.getParameter("id");
	Map<String, String> map = new HashMap<String, String>(); 
	map.put("id", id);
	MemberDAO memberDAO = MemberDAO.getInstance();
	boolean exist =  memberDAO.idExistId(map);%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="checkId.jsp" method=""><!-- 자기자신으로 돌아가는 파일 -->
	
	<%if(exist) {%>
			<h3>
			<%=id%>은(는) 중복된 아이디 입니다
			</h3>
			<input type="text" name="id">
			<input type="submit" value="중복체크" >
			<%}else {%>
				<h3>
			<%=id%>은(는) 사용가능한 아이디 입니다
			<input type="button" value="사용하기" onclick="checkIdClose('<%=id%>')"><!-- javascript함수로 변수값 보내기 -->
			
			</h3>			
			<%}%>

</form>
</body>
<script type="text/javascript">
function checkIdClose(id) {
	opener.check=1;
//	opener.writeForm.idcheck.value = "1";
	opener.writeForm.id.value = id;
	opener.writeForm.pwd.focus();
	
	window.close();  
	
	
	/* 켜져있는 writeForm의 아이디에 사용가능한 id를 보내고 writeForm의 비밀번호로 포커스, 열려있던
		checkId 종료*/
	
}</script>
</html>