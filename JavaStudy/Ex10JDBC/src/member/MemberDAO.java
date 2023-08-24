package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	// 데이터베이스에 연결하고 사용하는 것을 담당하는 클래스
	// DAO클래스가 모든 JDBC 기능을 수행한다.
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs=null;
	
	

	
	public int join(String iD, String passWord, String nickName) {
		// TODO Auto-generated method stub
		// DB에 넣는 방법.. 회원관리 프로그램
		// 0. 드라이버파일을 프로젝트 안에 넣어야 한다.
		// 1. 드라이버 설치(동적 로딩)
		// 2. 커넥션 열기
		// 3. SQL문장 실행
		// 4. 종료(연결 끊기)1
		// 이유: 오타가 있거나 파일이 존재하지 않을 때
		// 클래스를 못찾는 예외사항이 발생할 수 있다.
		int cnt = 0;
		try {
			// 1. 드라이버 설치( 동적로딩)
			// 왜 동적로딩인가
			// - 컴파일러는 아래의 코드를 만나기전 까지는 어떠한 DBMS에 드라이버를 사용하는지 모르고
			// 아래의 코드를 만나는 순간 해당 드라이버를 찾아 설치를 하므로
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 커넥션 열기
			// - 3가지
			// 1. DB가 존재하는 URL 2.아이디, 3. 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			// 예외사항 해결방법 try-catch
			// try에 예외 사항이 발생할 만한 코드를 작성
			// 예외사항 발생하면 오류를 감지 및 포착
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			if (conn != null) {
				System.out.println("DB연결 성공!");
			} else {
				System.out.println("DB연결 실패...");
			}
			// 3. SQL문 실행
			// SQL문을 실행하기 위해서는 조건이 있다.
			// 1) SQL문장이 이상없는지 검토를 받아야한다.
			String sql = "INSERT INTO MEMBER VALUES(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, iD);
			psmt.setString(2, passWord);
			psmt.setString(3, nickName);
			// executeUpdate(); sql문장을 실행하는 메소드
			// 실행한 문장의 개수를 int형태로 반환
			cnt = psmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// try가 잘 실행되거나
			// 또는 중간에 catch로 넘어간다고 하더라도
			// finally에는 마지막에 넘어오게 되어있다.
			// 4.연결끊기
			// -연결을 끊을때는 역순으로 끊어준다.
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return cnt;
	}




	public int delete(String iD, String passWord) {
		int cnt=0;
		try {
			// 1. DB와 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 다시 열기
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			if (conn != null)
				System.out.println("DB연결 성공!");
			else
				System.out.println("DB연결 실패...");
			String sql = "DELETE FROM MEMBER WHERE ID=? AND PW=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, iD);
			psmt.setString(2, passWord);
			cnt = psmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 마지막으로
			try {
				// 반드시 사용한 순서 역순으로 닫아야한다.
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("자원반납오류");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		return cnt;
	}




	public int update(String updatePw, String iD) {
		int cnt=0;
		// Query
		// Update member set coulmn명 where ID=iD
		// 조건문 입력한 아이디에 해당하는 비밀번호를 변경
		// 드라이버 찾아 설치
		// 예외 사항 해결해야함.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 다시 열기
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			if (conn != null)
				System.out.println("DB연결 성공!");
			else
				System.out.println("DB연결 실패...");

			String sql = "UPDATE MEMBER SET PW=? WHERE ID=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, updatePw);
			psmt.setString(2, iD);
			cnt = psmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally { // 마지막으로
			try {
				// 반드시 사용한 순서 역순으로 닫아야한다.
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("자원반납오류");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnt;
	}
	public MemberVO login(String user_id, String user_pw) {
		// TODO Auto-generated method stub
		MemberVO user_info =null;
		conn = null;
		psmt = null;
		rs = null;
		// 커넥션 열기
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

			String sql = "SELECT * FROM MEMBER WHERE ID=? AND PW=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user_id);
			psmt.setString(2, user_pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				// 로그인 성공
			//	String login_id = rs.getString("ID");
			//	String log_Pw = rs.getString("PW");
				String nickname = rs.getString("NICKNAME");
				user_info =new MemberVO(user_id,user_pw,nickname);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("자원반납오류");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return user_info;
	}
	
	

	
	
}
