<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- JSTL을 사용하기 위한 taglib추가 -->
<!--  추가로 JSTL 라이브러리 프로젝트에 추가 -->
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
@font-face {
    font-family: 'Bazzi';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-04@2.1/Bazzi.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}
@font-face {
    font-family: 'IAMAPLAYER';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2307-2@1.0/IAMAPLAYER.woff2') format('woff2');
    font-weight: normal;
    font-style: normal;
}

body{
	font-family: 'IAMAPLAYER', 'Bazzi'
}
table{
	font-family: 'IAMAPLAYER', 'Bazzi';
	background-color: greenyellow;
	text-align: center;
	margin :'center';
}




</style>
</head>
<body>
<!--  JSTL 사용하기 -->
<!--  JSTL을 사용하여 PAGE영역에 값 넣기 -->
<!--  <% pageContext. setAttribute("num", "100");%> -->
<!-- c: set 기본적으로 page영역에 저장이 된다 특정 영역에 저장하고 싶다면 scope 속성을 활용하자 -->
<c:set var ="num" value ="100"  scope = "session" />
<c:out value ="${num}"/><br>
${num}

<!-- JSTL을 활용한 조건문 -->
<!-- NUM의 값이 100보다 크면 100보다 큽니다 아니면 작습니다를 출력 -->
<c:if test="${num ge 100}">
	<p> 100보다 크거나 같습니다. ge than 100 </p>
</c:if>

<c:if test ="${(num lt 100)}">
	<p> 100보다 작습니다</p>
</c:if>
<br>
<c:set var ="time" value ="점심" />
<!-- 
	time값이 
	아침: 토스트
	점심: 비빔밥
	저녁: 족발
	그 외: 라면
 -->
 <c:choose>
 	<c:when test="${time =='아침'}">토스트</c:when>
 	<c:when test="${time =='점심'}">비빔밥</c:when>
 	<c:when test="${time =='저녁'}">족발</c:when>
 	<c:otherwise>라면</c:otherwise>
 </c:choose><br>
 <!-- JSTL 반복문 
 	for(int i =1 ; i<=10; i++){
 	}
 -->
 <c:forEach var= "i" begin ="1" end="10" step ="1">
 	<p>하하 ${i}</p>
 </c:forEach><hr>
 <table border="1">
 <tr>
 <th colspan ="9"> 구구단을 해보자</th>
 </tr>
 <c:forEach var="i" begin ="2" end ="9" step ="1">
 	<tr>
 	<c:forEach var="j" begin ="1" end ="9" step ="1">
 		<td>${i} ✶ ${j} = ${i*j}</td>		
 	</c:forEach>
 	</tr>
 </c:forEach>
 </table>
 
 
 
 
 
</body>
</html>