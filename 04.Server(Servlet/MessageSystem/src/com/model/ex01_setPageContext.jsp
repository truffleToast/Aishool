<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
서버 자체에 저장되기때문에한글 데이터도 인코딩할 필요는 없다.
Page Scope
하나의 JSP 페이지 내에 저장하는 영역
현재 페이지에서 지역변수 활용하거나, 저장한 값을 EL표기법으로 활용
-->
<%pageContext.setAttribute("nickName", "스코프");%>
<%=pageContext.getAttribute("nickName") %>

</body>
</html>