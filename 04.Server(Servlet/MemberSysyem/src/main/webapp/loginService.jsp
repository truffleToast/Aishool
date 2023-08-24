<%@page import="java.sql.SQLException"%>
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

//		넘어온 데이터를 기준으로 JDBC를 통해 테이블에 값 넣기(회원가입)
//		이쪽으로 넘오는 데이터
//		ID,PW,NICKNAME,EMAIL,PHONE,GENDER,AGE
		

//		JDBC순서
//		0. 프로젝트에 드라이버 파일넣기
//	    1.드라이버 동적로딩
//		2. 커넥션 연결
//		3. SQL문 실행
//		4. 연결종료


// 문제 
// 회원가입 후 main 페이지로 돌아가는 기능을 완성하시오
Connection conn=null;
PreparedStatement psmt=null;
ResultSet rs = null;
request.setCharacterEncoding("UTF-8");
String id =request.getParameter("id");
String pw =request.getParameter("pw");


	
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
	String sql = "SELECT * FROM MEMBER WHERE ID=? AND PW=?";
	psmt = conn.prepareStatement(sql);
	psmt.setString(1, id);
	psmt.setString(2, pw);
	rs = psmt.executeQuery();
	if(rs.next()){
		String nickname=rs.getString(3);
		response.sendRedirect("loginSuccess.jsp?nickname="+nickname);	
	}
	else{
		response.sendRedirect("login.jsp");
	}
	if (psmt != null) 
		
		psmt.close();
	if (conn != null) 
		conn.close();
	 
	

%>
</body>
</html>