<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		div,h2, fieldset{
		margin: auto;
		text-aling: center;
		margin-top: 20px;
		}
		input{
		margin-top: 10px;}


	</style>	
</head>
<body>
<div>
		<h1>랜덤당첨게임</h1>
		<fieldset>
		<legend>랜덤당첨게임!</legend>
			<%--주제를 출력 하고 아이템 중하나를 랜덤으로 선택해서 출력 --%>
			<%
			Random rd=new Random();
			request.setCharacterEncoding("UTF-8");
			String topic= request.getParameter("title");
			String[] dangchum= request.getParameterValues("item");
			int luckynum=rd.nextInt(dangchum.length);
			String todaymenu= dangchum[luckynum];
			%>
			<h2><%=topic %></h2>
			<h2><%= todaymenu%></h2>
		</fieldset>
</div>	
</body>
</html>