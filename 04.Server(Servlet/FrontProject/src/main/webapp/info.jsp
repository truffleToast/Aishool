<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "result.jsp", method ="post">
	<input type="text" name ="food"><br>
	좋아하는 생선 :
	참치 <input type ="checkbox" name = "fish" value="참치"> 
	연어 <input type ="checkbox" name = "fish" value="연어"> 
	광어 <input type ="checkbox" name = "fish" value="광어"> 
	우럭 <input type ="checkbox" name = "fish" value="우럭"> 
	도미 <input type ="checkbox" name = "fish" value="도미"> 
	대구 <input type ="checkbox" name = "fish" value="대구"> 
	<input type="submit">	
	</form>

</body>
</html>