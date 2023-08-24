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
		//세션에 모든 데이터를 삭제하는 방법
		// - 로그아웃 기능을 구현할 때
		session.invalidate();
	%>
</body>
</html>