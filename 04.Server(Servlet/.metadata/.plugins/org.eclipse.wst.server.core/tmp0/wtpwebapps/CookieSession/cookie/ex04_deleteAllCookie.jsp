<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>모든 쿠키 삭제</h1>
	<%
	Cookie[] cookies=request.getCookies();
	
	if(cookies != null){
		
		/* for(int i=0 ; i<cookies.length; i++){
		cookies[i].setMaxAge(0);
		response.addCookie(cookies[i]); */
		
		for (Cookie c: cookies){
			c.setMaxAge(0);
			response.addCookie(c);
		}
		
		}
	
	
	%>
</body>
</html>