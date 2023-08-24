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
	<div id="wrap">
		<h2>회원가입페이지</h2>
		<form action="JoinService" method ="post">
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
				<td>Nickname</td>			
				<td><input type ="text" name="nickname"></td>			
			</tr>
			<tr>	
				<td>E-mail</td>			
				<td><input type ="email" name="email"></td>			
			</tr>
			<tr>	
				<td>PHONE</td>			
				<td><input type ="tel" name="phone"></td>			
			</tr>
			<tr>	
				<td>GENDER</td>			
				<td>
				남자 <input type ="radio" name="gender" value="남자">
				여자 <input type ="radio" name="gender" value="여자">
				</td>			
			</tr>
			<tr>
				<td>나이:</td>
				<td> <input type="number" name="age"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="회원가입">
					<input type="reset" value="입력정보 초기화">
				</td>
			</tr>
		</table>
		</form>
	
	
	</div>
</body>
</html>