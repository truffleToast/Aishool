<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
fieldset{margin:auto;
		text-align:center;}
table{margin:auto;}

</style>

<body>
<%
request.setCharacterEncoding("UTF-8");
int floor= Integer.parseInt(request.getParameter("floor"));
int room= Integer.parseInt(request.getParameter("room"));
%>

	
	<fieldset>
		<legend>JSP호텔</legend>
		<h3><%=floor %>층</h3>
		<h3><%=room %>방</h3>
		<table border= "1px solid black">
		<% for (int i=0; i<floor ;i++){
			out.print("<tr>");
			for (int j=1; j<=room; j++){
				out.print("<td>"+j+"</td>");
			}
			out.print("</tr>");
		}
		%>
		</table>		
		</fieldset>
</body>
</html>