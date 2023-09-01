<%@page import="com.MemberDTO"%>
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
		session.setAttribute("id", "hodoodady");
		String id = (String) session.getAttribute("id");
	%>
	
	<!--  session에 저장된 id라는 이름의 값을 웹페이지에 표현 -->
	<address> <%= id %></address>
	${id} 님 환영합니다.
	<%-- 
	EL의 조건
	- EL은 java의 저장된 아무 변수의 값을 꺼내서 슬 수 있는 것이 이나리ㅏ
	Scope에 저장된 영역만 사용할 수 있다.
	 ❤️❤ Scope 영역이란 - page, request, session, application
	 --%>
	 
	 <%--
	 EL의 다양한 연산자
	  --%>
	  
	  <%
	  pageContext.setAttribute("num", 10);
	  pageContext.setAttribute("isCheck", true);
	  
	  %>
	  ${num}<br>
	  ${num + 10}<br>
	  ${num - 5}<br>
	  ${num * 3}<br> 
	  ${num / 2}<br> 
	  ${num div 2}<br>
	  ${num % 3}<br>
	  ${num mod 3}<br> 
	  ${num > 5 && num > 3}<br> 
	  ${num > 5 and num > 3}<br> 
	  ${num > 5 || num > 3}<br> 
	  ${num > 5 or num > 3}<br> 
	  ${isCheck}<br>
	  ${!ischeck}<br>
	  ${not ischeck}<br>
	  ${num > 3} ${num gt 3}<br>
	  ${num > 3} ${num ge 3}<br>
	  ${num < 20} ${num lt 20}<br>
	  ${num < 20} ${num le 20}<br>
	  ${num == 10} ${num eq 10}<br>
	  ${num != 10} ${num ne 10}<br>

	  <% MemberDTO dto = new MemberDTO("pbk","1234","호두아빠","광주");
	  pageContext.setAttribute("dto", dto);
	  MemberDTO info = (MemberDTO) pageContext.getAttribute("dto");
	   id= info.getId();
	  %>
	  
	  <%= id %>&bigstar;
	  <br>
	  ${dto.id}&sung;
	  <address>${dto.addr}&oast; </address>
	  "good"은 비어잇습니까? ${empty good}<br> 
	  "good"은 비어잇습니까? ${not empty good}<br> 
	  <!-- 
	  	만약에 동일한 이름의 값이 여러 영역에 들어가있다면
	  	EL에서는 어떻게 값을 가져올가
	  	
	  	찾는 순서 page -> request -> session -> application
	  	
	  	그런데 
	  	내가 EL에서 특정영역만 찾고자할 때
	   -->
		<% 
		pageContext.setAttribute("name", "박병관");
		request.setAttribute("name", "김미화");
		session.setAttribute("name", "황해도");
		application.setAttribute("name", "조준용");
		
		%>
		
		${name}&sung;<br>
		${sessionScope.name}&hearts;<br>	
	  <footer>
			&COPY;
			&cap;
			&sacute;
			&agrave;
			&hearts;
            &infintie;
            &quaternions;
            &sung;  
		  </footer>


</body>
</html>