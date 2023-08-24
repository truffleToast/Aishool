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
//Request Scope
//하나 이상의 jsp 페이지에서 정볼르 유지시키는 영역
// -forWard방식으로 이동할 때 정보를 유지시킬 수 있음
request.setAttribute("nickName", "스코프");
// 다음 페이지로 이동하는 방법: redirect
// -단순히 페이지를 이동한다거나 데이터베이스에 변화를 주는 이동을 할때 사용
// -요청이 두번 발생(정보전달X)
// -내부 or 외부 페이지 접근
//response.sendRedirect("ex04_getRequestScope.jsp");

//다음 페이지로 정보를 전달할 때 사용하는 방법: forward
RequestDispatcher dispatcher = request.getRequestDispatcher("ex04_getRequestScope.jsp");
dispatcher.forward(request, response);
%>
<h1>Request영역</h1>
<%= request.getAttribute("nickName") %>
</body>
</html>