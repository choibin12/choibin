<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
		<form name="loginForm" action="./login.jsp" method="post">
			<table border="0" cellpadding="0"cellspacing="0">
				<tr>
					<th>아이디</th>
					<td>
					<input type="text" name="id" id="id" size="10" >
					<div id="idDiv"></div>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>
					<input type="password" name="pwd" id="pwd" size="20">
					<div id="pwdDiv"></div>
					</td>
				</tr>
				<tr>
					<th colspan="2">
						<button type ="button" onclick="checklogin()">로그인</button>
						<button type ="button" onclick="location.href='./writeForm.jsp'">회원가입</button>
					</th>
				</tr>	
			</table>
		</form>
		<script type="text/javascript">
		function checklogin() {
			 document.getElementById("idDiv").InnerText="";
			 document.getElementById("pwdDiv").InnerText="";
			 
			 if(document.getElementById("id").value==""){
				 	document.getElementById("idDiv").innerText = "아이디를 입력하세요";
				 	document.loginForm.id.focus();
			 }
			 else if(document.getElementById("pwd").value==""){
				 	document.getElementById("pwdDiv").innerText = "비밀번호를 입력하세요";
				 	document.loginForm.pwd.focus();
			 }
			 else{
					document.loginForm.submit();
			 }
		}
		
		</script>
</body>
</html>