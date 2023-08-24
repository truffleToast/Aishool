<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>

/* */ css주석
</style>

<script>
// javascript주석

</script>
<body>




	<!--  각종 주석 설명 -->
	<!--  HTML 주석 -->
	<%--  JSP 주석은 바깥으로보이지 않아용--%>
	
	<h1> 오늘은 금요일</h1>
	<%--스크립트 잇, 자바코드 적을 수 잇음 --%> 
	<%
		int num=100;
		String name="액션가면 정의의 가면"; 
	%>
	<%
		int age=20;
		int size= 20;
		String color="yellow";
	%>
	<%-- 자바값 호출 --%>
	<%= name %>
	<hr size="<%=size%>>" color="<%=color %>">
	
</body>
</html>