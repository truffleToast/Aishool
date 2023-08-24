<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>

</style>


<body>
<table border ="1px solid black">
<%-- 
	<tr>
	<% for(int i =1; i<=10; i++){ %>
	<td> <%= i %> </td>
	<%} %>
</tr> 
--%>
<tr>
<% String td="";
for(int i = 1; i<=10; i++) td+= "<td>"+ i+ "</td>";%>
<%= td %> <%-- 자바로 코드 만들기 --%>
</tr>
</table>


	



</body>
</html>