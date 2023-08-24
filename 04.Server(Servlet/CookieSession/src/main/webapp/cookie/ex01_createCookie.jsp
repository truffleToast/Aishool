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
		//쿠키(Cookie)
		//사용자의 정보를 유지시키기 위한 기술
		// - 사용자 pc에 저장 (key, value 구조로만든후 저장)
		
		//쿠키 생성하는 방법
		Cookie cookie =new Cookie("name", "Justin");
	
		//쿠키에 유지기간 설정하는 방법
		//cookie.setMaxAge(30); // 1분은 60초 , 초단위 기입 
		
		
		//생성된 쿠키를 사용자에게 응답
		response.addCookie(cookie);
		
		Cookie cookie2 =new Cookie("name2", "Jason");
		Cookie cookie3 =new Cookie("name3", "Tim");
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		
		
	%>
	<h1>쿠키생성완료!</h1>
</body>
</html>