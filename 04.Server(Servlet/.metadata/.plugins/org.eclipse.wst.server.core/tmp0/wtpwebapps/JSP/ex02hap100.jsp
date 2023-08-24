<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% int su100=0;
	for(int i=1 ; i<101; i++) su100+=i; %>
	<h1> 1부터 100까지의 합 -> <%= su100 %> </h1>
	
	
</body>
</html>