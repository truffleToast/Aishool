<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
Connection conn=null;
PreparedStatement psmt=null;
ResultSet rs = null;
request.setCharacterEncoding("UTF-8");

// 드라이버 불러오기 및 sql접속
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String db_id = "shopping";
	String db_pw = "12345";
	conn = DriverManager.getConnection(db_url, db_id, db_pw);
	if (conn != null) {
		System.out.println("DB연결 성공!");
	} else {
		System.out.println("DB연결 실패...");
	}
	// sql문 작성 or 입력
	String sql = "SELECT ID, NICKNAME, EMAIL, PHONE, GENDER, AGE FROM MEMBER";
	psmt = conn.prepareStatement(sql);
	rs=psmt.executeQuery();
	out.print("<table border='1'>");
		out.print("<tr>");
		out.print("<th>ID</th><th>NICKNAME</th><th>EMAIL</th><th>PHONE</th><th>GENDER</th><th>AGE</th>");
		out.print("</tr>");
		//rs.next();
	while(rs.next()){
		String id= rs.getString(1);
		String nickname= rs.getString(2);
		String email= rs.getString(3);
		String phone= rs.getString(4);
		String gender= rs.getString(5);
		int age= rs.getInt(6);
		System.out.println(id+"/"+nickname+"/"+email+"/"+phone+"/"+gender+"/"+age);
		//id가 "admin"이 아닌 회원만 출력하는 조건
		if(!id.equals("ADMIN")){
		out.print("<tr>");
		out.print("<td>"+id+"</td>");
		out.print("<td>"+nickname+"</td>");
		out.print("<td>"+email+"</td>");
		out.print("<td>"+phone+"</td>");
		out.print("<td>"+gender+"</td>");
		out.print("<td>"+age+"</td>");
		out.print("</tr>");
		}
	}
	out.print("</table>");
	
	
%>


</body>
</html>