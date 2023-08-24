<%@page import="java.util.ArrayList"%>
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
//세션 영역에서 데이터 가져오는 방법
// 특정 타입에 저장할 경우 오브젝트를 다른 자료형으로 전환해야한다. 
// -> 다운캐스팅
	String name= (String)session.getAttribute("name");// 다운 캐스팅을 통해 해결 해야한다.
	//- 기본 타입의 데이터를 세션영역에 저장했을 때는
	//참조 타입으로 변환해줘야 값이 없더라도 null에 대한 예외처리를 할 수 있다.
	// -문자열 -> 정수 ? Integer.parseInt(); --> Integer 정수타입(레퍼런스형)
	// -기본 데이터 타입을 참조타입으로 변환 -> Wraper클래스
	// 문자열: char -> Character
	// 정수: byte -> Byte, short ->Short, int -> Integer, long -> Long
	// 실수: float -> Float, double -> Double
	// 논리: boolean -> Boolean
	Integer age= (Integer)session.getAttribute("age");
	
	ArrayList<String> list=(ArrayList<String>)session.getAttribute("list");
%>

<h1>세션에 저장된 데이터 확인</h1>
<%= name %>
<%= age %>
<%= session.getAttribute("age") %>
<%=list!=null? list.get(0): null %>
<%=list!=null? list.get(1): null %>

</body>
</html>