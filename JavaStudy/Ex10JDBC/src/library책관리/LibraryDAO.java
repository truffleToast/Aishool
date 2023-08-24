package library책관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LibraryDAO {

	// 데이터 베이스에 접근하여 도서 등록에 필요한 데이터를 전달
	public int insert(LibraryVO vo) {
		// 1) 드라이버 동적로딩
		// 2) SQL문 준비
		// 3) 결과값 처리
		// 4) 자원반납
		int row = 0;
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 준비물 3가지: 주소, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			// 2) SQL문 준비
			String sql = "INSERT INTO LIBRARY VALUES(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getAuthor());
			psmt.setInt(3, vo.getPrice());
			psmt.setString(4, vo.getNum());

			row = psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터베이스 접속 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
		return row; // 데이터 가 있으면 psmt 없으면 0
	}

	public ArrayList<LibraryVO> select() {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		ArrayList<LibraryVO> libraryList = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			String sql = "SELECT * FROM LIBRARY";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			System.out.println("책제목\t책저자\t\t책 가격\t 일련번호");
			while (rs.next()) {
				String title = rs.getString(1);
				String author = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);
				LibraryVO vo = new LibraryVO(title, author, price, num);
				libraryList.add(vo);
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패");
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
				e.printStackTrace();
			}
		}
		return libraryList;
	}

	public LibraryVO search(LibraryVO vo) {
		// 1. DB와 연결
		// 1. 안에 적기 2.구문에 적기
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 준비물 3가지
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			// 2) SQL문 준비
			String sql = "SELECT * FROM LIBRARY WHERE TITLE=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			// 세팅완료
			rs = psmt.executeQuery();
			if (rs.next()) {
				String bookTitle = rs.getString(1);
				String bookAuthor = rs.getString(2);
				int bookPrice = rs.getInt(3);
				String bookNum = rs.getString(4);
				vo = new LibraryVO(bookTitle, bookAuthor, bookPrice, bookNum);
			}
		} catch (ClassNotFoundException | SQLException e) {
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
				e.printStackTrace();
			}
		}
		return vo;

	}

}
