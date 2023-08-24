<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
선언문
	-jsp안에서 필드 또는 메소드를 만들고 싶을 때 사용
 --%>
 
 
 	<%!
 		//선언문
 		public String name = "박박박";
 		public int plus(int num1, int num2){
 			return num1+num2;
 		}
 	
 	%> 
 	<%
 		//스크립트릿'
 		String name2= "조조조";
 	%>
 	
 	<%= plus(30, 40) %>
</body>
</html>