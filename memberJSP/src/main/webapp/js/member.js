function checkWrite() {
	
			 document.getElementById("nameDiv").InnerText="";
			 document.getElementById("idDiv").InnerText="";
			 document.getElementById("pwdDiv").InnerText="";
			 if(document.getElementById("name").value==""){
					document.getElementById("nameDiv").innerText = "이름을 입력하세요";
			 }else if(document.getElementById("id").value==""){
				 	document.getElementById("idDiv").innerText = "아이디를 입력하세요";
			 }
			 else if(document.getElementById("pwd").value==""){
				 	document.getElementById("pwdDiv").innerText = "비밀번호를 입력하세요";
			 }
			 else if(document.getElementById("pwd").value!=document.getElementById("repwd").value){
				 	document.getElementById("pwdDiv").innerText = "비밀번호가 맞지 않습니다";
			 }
//			 else if(document.getElementById("idcheck").value == "0"){
//				alert("중복체크를 해주세요");
//				alert(check);
//			}
			else if(check==0){
				alert("중복체크를 해주세요")
			}
			 else{
					document.writeForm.submit();
			 }
			
		}
function change() {
	document.writeForm.email2.value = document.writeForm.email3.value;
			
}
 //중복체크
function checkId(){
	
	var id=document.getElementById("id").value;
	if(document.getElementById("id").value==""){
				 	//document.getElementById("idDiv").innerText = " 먼저 아이디를 입력하세요";
			document.getElementById("idDiv").innerHTML="<font color='magenta'>먼저 아이디를 입력하세요</font>";				 	
	}
	else{
		
		window.open("checkId.jsp?id="+id, "checkId","width=300 height=150 left=700 top=200");
		
	}
}
function inputIdcheck(){
	check=0;
	//document.writeForm.idcheck.value="0";
}