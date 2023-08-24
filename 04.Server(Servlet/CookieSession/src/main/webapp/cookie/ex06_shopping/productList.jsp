<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 장바구니 버튼 만들어야한다. --> 
	<h1>상품 리스트</h1>
	<form action="productAdd.jsp" method="post">
		<table border="2px">
		<tr>
			<th>선택</th><th>상품명</th><th>담기</th>
		</tr>
		<tr>
			<td><input type="checkbox" name="product" value="product1"></td>
			<td>상품1</td>
			<td><input type="submit" value="장바구니 담기"></td>
		</tr>
		<tr>	
			<td><input type="checkbox" name="product" value="product2"></td>
			<td>상품2</td>
			<td><input type="submit" value="장바구니 담기"></td>
		</tr>
		<tr>	
			<td><input type="checkbox" name="product" value="product3"></td>
			<td>상품3</td>
			<td><input type="submit" value="장바구니 담기"></td>
		</tr>
		<tr>	
			<td><input type="checkbox" name="product" value="product4"></td>
			<td>상품4</td>
			<td><input type="submit" value="장바구니 담기"></td>
		</tr>
		<tr>	
			<td><input type="checkbox" name="product" value="product5"></td>
			<td>상품5</td>
			<td><input type="submit" value="장바구니 담기"></td>
		</tr>
		</table>
	<p><input type="submit" value="선택상품 담기"></p>	
	<p><a href="productBasket.jsp">장바구니 이동</a>
	</form>
	
	
	<%
	
	%>

</body>
</html>