<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>쿠키삭제완료!</h1>
<%
	//쿠키 삭제하는 방법
	Cookie cookie = new Cookie("name","");

	//setMaxAge()로 가능하다. 
	cookie.setMaxAge(0); // 0으로 바꾸면 삭제된다.
	
	response.addCookie(cookie);
	
	
	
%>

</body>
</html>