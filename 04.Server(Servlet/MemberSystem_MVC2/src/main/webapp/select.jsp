<%@page import="com.model.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1px">
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>닉네임</th>
		<th>이메일</th>
		<th>전화번호</th>
		<th>성별</th>
		<th>나이</th>
	</tr> 
	<%
		MemberDAO dao =new MemberDAO();
		ArrayList<MemberDTO> list=dao.select();
		//System.out.println("현재 회원 수: "+list.size());
	for(MemberDTO dto: list){ // for-each문 외우기
	out.print("<tr>");
	out.print("<td>"+(list.indexOf(dto)+1)+"</td>");	
	out.print("<td>"+dto.getId()+"</td>");
	out.print("<td>"+dto.getNickname()+"</td>");
	out.print("<td>"+dto.getEmail()+"</td>");
	out.print("<td>"+dto.getPhone()+"</td>");
	out.print("<td>"+dto.getGender()+"</td>");
	out.print("<td>"+dto.getAge()+"</td>");
	out.print("</tr>");
	}
	%>
	</table>
	

</body>
</html>	 