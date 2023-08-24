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
	String item = request.getParameter("item");
	
	Cookie cookie= new Cookie("item", item);
	
	response.addCookie(cookie);
	
	response.sendRedirect("ex05_readCookie.jsp");
%>

</body>
</html>