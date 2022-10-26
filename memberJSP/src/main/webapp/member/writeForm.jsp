<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
var check = 0;
</script>
<style type="text/css">
div{
	color: red;
}
</style>
</head>
<body>
	<h2>회원가입</h2>
		<form name="writeForm" action="./write.jsp" method="get">
			<table border="1" cellpadding="5"cellspacing="0">
				<tr>
					<th>이름</th>
					<td>
					<input type="text" name="name" id="name" placeholder="이름 입력">
					<div id="nameDiv"></div>
					</td>
				</tr>
				<tr>
					<th>아이디</th>
					<td>
					<input type="text" name="id" id="id" size="30" placeholder="아이디 입력" onkeydown="inputIdcheck()">
					<input type="button" value="중복체크" onclick="checkId()" >
					<!-- <input type="hidden" name= "idcheck" id="idcheck" value="0"> -->
					<div id="idDiv"></div>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>
					<input type="password" name="pwd" id="pwd" size="40">
					<div id="pwdDiv"></div>
					</td>
				</tr>
				<tr>
					<th>재확인</th>
					<td>
					<input type="password" name="repwd" id="repwd" size="40">
					</td>
				</tr>
				<tr>
					<th>성별</th>
					<td>
					<input type="radio" name="gender" id="gender_m" value="0" checked="checked" />
					<label for="gender_m">남자</label>			
					<input type="radio" name="gender" id="gender_f" value="1" />
					<label for="gender_f">여자</label>	
					</td>		
				</tr>
				<tr>
					<th>이메일</th>
					<td>
					<input type="email" id="email1" name="email1" style="width:120px;">
					@
					<input type="email" name="email2" id="email2" style="width:120px;">
					<select name="email3" onchange="change()" id="email3" style="width:120px;">
						<option value="">직접입력</option>
						<option value="naver.com">naver.com</option>
 						<option value="gmail.com">gmail.com</option>
 						<option value="nate.com">nate.com</option>	
					</select>
					</td>
				</tr>
				<tr>
					<th>휴대폰</th>
					<td>
					<select name="tel1" id="tel1" style="width:60px;">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="019">019</option>
 					</select>
 					<label for="tel2">-</label>
 					<input type="tel" name="tel2" id="tel2" style="width:60px;" >
 					<label for="tel3">-</label>
 					<input type="tel" name="tel3" id="tel3" style="width:60px;">
 					</td>
				</tr>
				<tr>
					<th>주소</th>
					<td>
					<input type="text" id="zipcode" readonly/>
					<input type="button" value="우편번호검색" onclick="checkPost()"><br>
					<input type="text" name="addr1" id="addr1" style="width:400px;" placeholder="주소" readonly/><br>
					<input type="text" name="addr2" id="addr2" style="width:400px;" placeholder="상세주소">
					</td>
				</tr>
				<tr>
					<th colspan="2">
						<button type ="button" onclick="checkWrite()">회원가입</button>
						<button type ="reset">다시작성</button>
						<button type ="button" onclick="location.href='./loginForm.jsp'">로그인</button>
					</th>
				</tr>	
			</table>
		</form>
		<script src="../js/member.js"></script>
		<!-- 우편번호 -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="../js/post.js"></script>
</body>
</html>