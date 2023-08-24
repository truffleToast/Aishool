<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
int cnt=0;
request.setCharacterEncoding("UTF-8");
String id =request.getParameter("id");
String pw =request.getParameter("pw");
String nickname =request.getParameter("nickname");
String email =request.getParameter("email");
String phone =request.getParameter("phone");
String gender =request.getParameter("gender");
int age =Integer.parseInt(request.getParameter("age"));
Connection conn=null;
PreparedStatement psmt=null;
// ResultSet rs=null; select문이 아니므로 필요없음. 
//id, pw, nickname, email, phone, gender, age
// 위의 값을 먼저 다 가져온다음
// id와 pw가 일치하는 계정을 찾아 
// 입력한 nick,email,phone,gender,age를 수정하시오
// 수정성공시 main.jsp
// 수정 실패시 update.jsp
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
String sql = "UPDATE MEMBER SET NICKNAME=?, EMAIL=?, PHONE=?, GENDER=?, AGE=? WHERE ID=? AND PW=?";
psmt=conn.prepareStatement(sql);
psmt.setString(1, nickname);
psmt.setString(2, email);
psmt.setString(3, phone);
psmt.setString(4, gender);
psmt.setInt(5, age);
psmt.setString(6, id); 
psmt.setString(7, pw);
cnt=psmt.executeUpdate();
if (psmt!=null){
	psmt.close();
}
if( conn!=null){
	conn.close();
}
if(cnt!=0){
	response.sendRedirect("main.jsp");
}else
	response.sendRedirect("update.jsp");

%>
</body>
</html>