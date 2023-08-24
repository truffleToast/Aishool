<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
h2{font-size: 10pt;}
form{margin:auto;
	text-align:center;
}
</style>

<body>
<fieldset>
<legend>테이블 만들기</legend>
<form action="ex10makeTableResult.jsp" method="post">
	<h2> 몇개의 층을 만들거에요?</h2>
	층<input type="number" name="floor">
	<hr>
	<h2> 몇개의 방을 만드실건가요?</h2>
	방<input type="number" name= "room">
	<br>
	<input type="submit" value="제출!!">







</form>






</fieldset>




</body>
</html>