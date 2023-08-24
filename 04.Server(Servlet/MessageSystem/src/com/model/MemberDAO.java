package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private int cnt=0;
	
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
			System.out.println("DB연결에 필요한 정보가 맞는지 체크하세요!");
		}

	}
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
	public int join(MemberDTO dto) {
		getConnection();
		try {
			String sql = "INSERT INTO MSGMEMBER VALUES(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getEmail());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getPhone());
			psmt.setString(4, dto.getAddr());
			cnt= psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	public MemberDTO login(MemberDTO dto) {
		getConnection();
		try {
			String sql= "SELECT * FROM MSGMEMBER WHERE EMAIL=? AND PW=?";
			psmt= conn.prepareStatement(sql);
			psmt.setString(1, dto.getEmail());
			psmt.setString(2, dto.getPw());
			rs=psmt.executeQuery();
			if(rs.next()){
				String email =rs.getString(1);
				String pw =rs.getString(2);
				String phone =rs.getString(3);
				String addr =rs.getString(4);
				MemberDTO info= new MemberDTO(email, pw, phone,addr);
				return info;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return null;
	}
	
	public int update(MemberDTO newInfo) {
		getConnection();
		try {
			String sql= "UPDATE MSGMEMBER SET PW=?, PHONE=?, ADDR=? WHERE EMAIL=?";
			psmt= conn.prepareStatement(sql);
		
				psmt.setString(1,newInfo.getPw());
				psmt.setString(2,newInfo.getPhone());
				psmt.setString(3,newInfo.getAddr());
			
			psmt.setString(4,newInfo.getEmail());
			cnt=psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return cnt; 
	}
	
}
