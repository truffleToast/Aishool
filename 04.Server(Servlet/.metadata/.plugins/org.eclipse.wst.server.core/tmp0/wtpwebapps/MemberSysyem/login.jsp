<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#wrap,h2,table{
	margin:auto;
	text-algin:center;
}
</style>
</head>
<body>
<h2>여기는 로그인 페이지입니다.</h2>
	<div id="wrap">
		<h2>로그인</h2>
		<form action="loginService.jsp" method ="post">
		<table>
			<tr>
				<td>ID</td>			
				<td><input type ="text" name="id"></td>			
			</tr>
			<tr>	
				<td>PW</td>			
				<td><input type ="password" name="pw"></td>			
			</tr>	
			<tr>
			<td colspan="2"><input type="submit" value="로그인"><input type="reset">
			</tr>
		</table>
		</form>
	
	
	</div>
</body>
</html>