<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>

<%-- 반복문을 사용하여 열개짜리 테이블 만들기 --%>
<table border = "1px solid black">
<tr>

	<% for(int i=1; i<=10; i++){
		out.print("<td>"+i+"</td>"); 
	}
	%>
	

</tr>

</table>




</html>