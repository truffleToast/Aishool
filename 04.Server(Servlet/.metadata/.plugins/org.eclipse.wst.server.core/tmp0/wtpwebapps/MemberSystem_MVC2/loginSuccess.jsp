<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	String nickname=request.getParameter("nick");
%>
	<h2><%= nickname %>님 환영합니다</h2>
</body>
</html>