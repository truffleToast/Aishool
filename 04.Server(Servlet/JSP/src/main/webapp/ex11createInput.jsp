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
<%
int cntmenu=Integer.parseInt(request.getParameter("rdin"));
%>
	<div>
		<h1>랜덤당첨게임</h1>
		<fieldset>
			<legend>랜덤당첨 작성</legend>
			<form action="ex11randomResult.jsp">
				 주제: <input type="text" name="title">
				<br>
				<%-- 입력한 숫자만큼 input태그를생성 --%>
				<% 
				for(int i=1; i<=cntmenu; i++){
				out.print("아이템"+ i+":");
				out.print("\t<input type='text' name='item'><br>");
				}
				%>
				
				<input type="submit" value="시이이작!">
			</form>
		</fieldset>
	</div>

</body>
</html>