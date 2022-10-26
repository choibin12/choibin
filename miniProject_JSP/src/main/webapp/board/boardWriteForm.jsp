<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div {
	color: red;
	font-size: 8pt;
	font-weight: bold;
}
</style>
</head>
<body>
<form action="./boardWrite.jsp" name="boardWriteForm" method="post">
	<table border="1" cellpadding="5"cellspacing="0">
				<tr>
					<th>제목</th>
					<td>
					<input type="text" name="subject" id="subject" size="40" placeholder="제목 입력">
					<div id="subjectDiv"></div>
					</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>
					<textarea rows="5" cols="40" name="content" id="content"  placeholder="내용 입력" style="height: 300px; 
					white-space: pre-wrap; overflow: auto; word-break: break-all;"></textarea>
					<div id="contentDiv"></div>
					</td>		
				</tr>
				<tr>
					<th colspan="2" align="center">
						<input type="button" value="글작성" onclick="checkBoardWrite()">
						<input type="reset" value="다시작성">
						<input type="button" value="메인메뉴" onclick="location.href='../index.jsp'">
					</th>
				</tr>	
	</table>
</form>
	<script type="text/javascript">
	function checkBoardWrite() {
		document.getElementById("subjectDiv").InnerText="";
		document.getElementById("contentDiv").InnerText="";
		  if(document.getElementById("subject").value==""){
			 	document.getElementById("subjectDiv").innerText = "제목을 입력하세요";
			 	document.boardWriteForm.subject.focus();
		 } else if(document.getElementById("content").value==""){
			 	document.getElementById("contentDiv").innerText = "내용을 입력하세요";
			 	document.boardWriteForm.content.focus();
		 }else {
			 document.boardWriteForm.submit();
		 }
		
	}
	</script>
</body>
</html>