<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 모든 상품정보를 삭제한 후 장바구니로 이동 -->

	<% 

Cookie[] cookies = request.getCookies();
if (cookies!=null){
	for (int i =0; i<cookies.length; i++){
		
		cookies[i].setMaxAge(0);
		response.addCookie(cookies[i]); //역시 이준영이야
	}
}
response.sendRedirect("procuctBasket.jsp");

	%>






</body>
</html>