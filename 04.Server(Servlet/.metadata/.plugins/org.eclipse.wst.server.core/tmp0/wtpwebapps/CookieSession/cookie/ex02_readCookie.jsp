<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>쿠키 정보 가져오기</h1>
	<%
		//쿠키 정보를 가져오는 방법
		Cookie[] cookies= request.getCookies();
	
		if(cookies != null){
			for(int i=0; i<cookies.length; i++){
				out.print("쿠키이름: "+ cookies[i].getName()+"<br>");
				out.print("쿠키값: "+ cookies[i].getValue()+"<br>");
				out.print("유지기간: "+ cookies[i].getMaxAge()+"<br>");
				out.print("<hr>");
			}
		}
	
		
	%>

</body>
</html>