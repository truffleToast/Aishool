package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private int cnt=0;

	// 데이터베이스 연결메소드
	public void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ojdbc6.jar 또는 경로를 체크하세요!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결에 필요한 정보다 맞는지 체크하세요!");
		}

	}

	// 데이터베이스 종료메소드
	public void close() {
		try {
			if (rs != null) {
				rs.close();

			}

			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원가입 메소드
	public void join(MemberDTO dto) {
		getConnection();

		try {
			String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getNickname());
			psmt.setString(4, dto.getEmail());
			psmt.setString(5, dto.getPhone());
			psmt.setString(6, dto.getGender());
			psmt.setInt(7, dto.getAge());

			psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 로그인 메소드
	// - 회원정보가 있는 경우, nick을 반환
	// - 없으면 null을 반환
	public String login(String id, String pw) {
		getConnection();

		try {
			String sql = "SELECT NICKNAME FROM MEMBER WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {
				return rs.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return null;
	}

	public int delete(MemberDTO dto) {
		getConnection();
		String sql = "DELETE FROM MEMBER WHERE ID=? AND PW=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public int update(MemberDTO dto) {
		
		getConnection();
		try {
			String sql = "UPDATE MEMBER SET NICKNAME=?, EMAIL=?, PHONE=?, GENDER=?, AGE=? WHERE ID=? AND PW=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getNickname());
			psmt.setString(2, dto.getEmail());
			psmt.setString(3, dto.getPhone());
			psmt.setString(4, dto.getGender());
			psmt.setInt(5, dto.getAge());
			psmt.setString(6, dto.getId());
			psmt.setString(7, dto.getPw());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	 public ArrayList<MemberDTO> select() {
		   ArrayList<MemberDTO> list = new ArrayList<>(); 
		   
		   getConnection();
		   try {
			   String sql="SELECT * FROM MEMBER";
			   psmt=conn.prepareStatement(sql);
			   rs=psmt.executeQuery();
			   while(rs.next()) {
				  String id= rs.getString(1);
				  String pw= rs.getString(2);
				  String nickname= rs.getString(3);
				  String email= rs.getString(4);
				  String phone= rs.getString(5);
				  String gender= rs.getString(6);
				  int age= rs.getInt(7);
				  MemberDTO dto= new MemberDTO(id,pw,nickname,email, phone, gender, age);
				  list.add(dto);
			   }
			   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		   close();
		}
		   return list; 
		  
	   }	
		

}
