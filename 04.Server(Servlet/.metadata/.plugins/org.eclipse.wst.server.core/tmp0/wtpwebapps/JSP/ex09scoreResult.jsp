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
request.setCharacterEncoding("UTF-8");
String studentName=request.getParameter("name");
int jas=Integer.parseInt(request.getParameter("java"));
int webs=Integer.parseInt(request.getParameter("web"));
int iots=Integer.parseInt(request.getParameter("iot"));
int android=Integer.parseInt(request.getParameter("android"));
int allgrade=jas+webs+iots+android;
double average= allgrade/4.0;
%>

<fieldset> 
<legend>학점확인프로그램</legend>
	<table style= "margin:auto; text-align:center" >
	<tr>
		<td>이름:</td>
		<td><%= studentName %></td>				
	</tr>
	<tr>
		<td>Java점수:</td>
		<td><%=jas%></td>
	</tr>
	<tr>
		<td>WEB점수:</td>
		<td><%= webs %></td>
	</tr>
	<tr>
		<td>IOT점수:</td>
		<td><%= iots %></td>
	<tr>
		<td>ANDROID점수:</td>
		<td><%= android %></td>
	</tr>
	<tr>
		<td>평균:</td>
		<td><%= average %></td>
	<tr>
		<td>학점</td>
		<td><strong>
			<% 
			if (average>=95)
				out.print("A+");
			else if(average>=85)
				out.print("A");
			else if(average>=80)
				out.print("B+");
			else if(average>=70)
				out.print("C");
			else
				out.print("F");
			%>
		</strong></td>
	</tr>
	</table>
	</fieldset>

</body>
</html>