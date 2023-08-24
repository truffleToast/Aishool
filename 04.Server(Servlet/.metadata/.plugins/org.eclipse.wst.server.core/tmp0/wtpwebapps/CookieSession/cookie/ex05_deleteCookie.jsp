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
	//쿠키 삭제하기

	Cookie cookie=new Cookie("item","");//새로운 쿠키 생성자
 	cookie.setMaxAge(0);
	
	response.addCookie(cookie);
	
	/*
	Cookie[] cookies=request.getCookies();
	//age를 0으로 하여 쿠키를 삭제
	 
	for(Cookie cookie: cookies){
		if (cookie.getName().equals("item"))
			cookie.setMaxAge(0);
			response.addCookie(cookie);	
	}
	*/
	response.sendRedirect("ex05_readCookie.jsp");
	
	


%>
</body>
</html>