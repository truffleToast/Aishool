<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 유저가 선택한 상품들을 쿠키에 저장되게 하기 
넘겨받은 Value값을 쿠키의 name으로 사용
-->
<%
request.setCharacterEncoding("UTF-8");

String[] productList=request.getParameterValues("product");
if(productList !=null){
	
for(int i= 0 ; i<productList.length; i++){
	//쿠키이름을 하나로 통일하게 되면 마지막에 저장된 값만 쿠키로 생성한다.
	Cookie cookie= new Cookie(productList[i], productList[i]);
	response.addCookie(cookie);
}
	response.sendRedirect("productList.jsp");
}

 

%>

</body>
</html>