<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> session 영역</h1>

<%
	/* Session Scope
	JESSIONID로 사용자를 구분
	브라우저가 꺼지거나 임의적으로 삭제하면 더 이상 유지X
 	*/
session.setAttribute("nickName", "스코프");
response.sendRedirect("ex06_getSessionScope.jsp");
%>
</body>
</html>