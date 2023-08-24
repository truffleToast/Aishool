<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 전체삭제  필요  -->
	<h1>장바구니</h1>
	<fieldset>
		<legend>상품리스트</legend>
		<!-- 쿠키에 저장된 상품을 출력하는 기능을 구현하시오 -->
		<ul>
			<%
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (int i = 0; i < cookies.length; i++) {
					if (!cookies[i].getName().equals("JSESSIONID"))
				out.print("<li>" + cookies[i].getValue().replace("product", "상품") + "</li>");
				}

			}
			%>
		</ul>
	</fieldset>
	<p>
		<a href="productList.jsp">계속 쇼핑하기</a>
	</p>
	<p>
		<a href="productDeleteAll.jsp">모든 상품삭제</a>
	</p>

</body>
</html>