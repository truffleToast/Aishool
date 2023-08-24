<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
<%--
	리다이렉트 방식
	-Server 요청한 Client에게 이동할 URL 전달함으로
	 Client는 받아온 URL을 통해 다시 접근하는 방식
 --%>
 
 <%-- 현재페이지 요청시 네이버 페이지로 이동하게 하는 예시 --%>
<%
response.sendRedirect("https://www.naver.com");
%>
</html>