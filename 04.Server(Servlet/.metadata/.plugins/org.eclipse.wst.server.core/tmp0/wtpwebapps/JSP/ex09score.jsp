<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ex09scoreResult.jsp" method="post">
		<fieldset>
			<legend><strong>학점확인프로그램</strong></legend>
				<table style="margin:auto; text-align: center;">
				<tr>
					<td>이름</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>JAVA</td>
					<td><input type="text" name="java"></td>
				</tr>
				<tr>
					<td>WEB</td>
					<td><input type="text" name="web"></td>
				</tr>
				<tr>
				<td>IOT</td>
				<td><input type="text" name="iot"></td>
				</tr>
				<tr>
					<td>Android</td>
					<td><input type="text" name="android"></td>
				</tr>
				<tr>
					<td colspan="2">
					<input type="submit" value="결과확인">
				</td>
				</tr>
				</table>
			</fieldset>
		
			</form>
</body>
</html>