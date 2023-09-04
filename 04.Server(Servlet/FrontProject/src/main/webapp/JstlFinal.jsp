<%@page import="com.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<String> idol = new ArrayList<String>();
	idol.add("제이홉");
	idol.add("지수");
	idol.add("제니");
	idol.add("로제");
	idol.add("리사");
	pageContext.setAttribute("idol", idol);
%>
<c:forEach items="${idol}" var= "name">
	${name}

</c:forEach>
<br>
<%
	MemberDTO dto1 = new MemberDTO("pbk","1234","호두아빠","광주");
	MemberDTO dto2 = new MemberDTO("iu","1234","아이유","서울");
	MemberDTO dto3 = new MemberDTO("son","1234","흥민손","영국");
	MemberDTO dto4 = new MemberDTO("jjy","1234","준용쌤","전주");
	MemberDTO dto5 = new MemberDTO("imh","1234","명훈공듀","제주");
	
	ArrayList<MemberDTO> list =new ArrayList<MemberDTO>();
	list.add(dto1);
	list.add(dto2);
	list.add(dto3);
	list.add(dto4);
	list.add(dto5);
	pageContext.setAttribute("list",list);
%>

<c:set var ="list" value ="list"  scope = "session" />


<table border= "1px solid black">
<tr>
	<th>번호</th>
	<th>아이디</th>
	<th>비밀번호</th>
	<th>닉네임</th>
	<th>주소</th>
</tr>



<c:forEach varStatus ="i" items ="${list}" var= "name"> 
	<tr>
	<td>${i.count}</td>
	<td>${name.id}</td>
	<td>${name.pw}</td>
	<td>${name.nick}</td>
	<td>${name.addr}</td>
	</tr>
</c:forEach>
</table>










</body>
</html>