<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<strong>월요일 좋아 최고로 좋아 오늘은 월요일 내일도 월요일  오 좋아 월요일 좋아</strong>
	<br>
	오늘 당신의 행운의 숫자는?
	<%
	Random rd=new Random();
	
	int luckyNum=rd.nextInt(10)+1;
	%>
	
	<strong><%=luckyNum%>입니다.</strong>
</body>
</html>