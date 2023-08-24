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
			<legend>오늘 저녁은?? 두구두구</legend>
			<form action="ex11createInput.jsp">
				<input type="number" name="rdin">
				<br>
				<input type="submit">
			</form>
		</fieldset>
	</div>



</body>
</html>