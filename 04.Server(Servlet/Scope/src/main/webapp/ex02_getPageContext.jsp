<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>PageScope에 저장된 정보는 다른 페이지에서 접근이 불가능하다!</h2>
	<%=pageContext.getAttribute("nickName") %>
</body>
</html>