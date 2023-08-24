package officeMember;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OfficeMemberDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;

	public int join(OfficeMemberVO vo) {

		try {
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
			String sql = "INSERT INTO OFFICE_MEMBER VALUES(?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getEmp_No());
			psmt.setString(2, vo.getEmp_Name());
			psmt.setInt(3, vo.getEmp_Hp());
			psmt.setInt(4, vo.getJoin_Date());
			psmt.setString(5, vo.getGender());
			psmt.setInt(6, vo.getAge());
			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
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

		} // finally 끝

		return cnt; // return한 cnt를 Controller로 보내야됨

	}

	public ArrayList<OfficeMemberVO> select() {

		ArrayList<OfficeMemberVO> Selected_List = new ArrayList<>();
		try {
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

			// sql 작성
			String sql = "SELECT * FROM OFFICE_MEMBER ORDER BY EMP_NO";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int emp_No = rs.getInt(1);
				String emp_Name = rs.getString(2);
				int emp_Hp = rs.getInt(3);
				int join_Date = rs.getInt(4);
				String emp_Gender = rs.getString(5);
				int emp_Age = rs.getInt(6);
				OfficeMemberVO vo = new OfficeMemberVO(emp_No, emp_Name, emp_Hp, join_Date, emp_Gender, emp_Age);
				Selected_List.add(vo);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Selected_List;
	}

	public ArrayList<OfficeMemberVO> search(OfficeMemberVO vo) {
		ArrayList<OfficeMemberVO> Selected_List = new ArrayList<>();
		try {
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

			// sql 작성
			String sql = "SELECT * FROM OFFICE_MEMBER WHERE EMP_NAME=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getEmp_Name());
			rs = psmt.executeQuery();

			while (rs.next()) {
				int emp_No = rs.getInt(1);
				String emp_Name = rs.getString(2);
				int emp_Hp = rs.getInt(3);
				int join_Date = rs.getInt(4);
				String emp_Gender = rs.getString(5);
				int emp_Age = rs.getInt(6);
				vo = new OfficeMemberVO(emp_No, emp_Name, emp_Hp, join_Date, emp_Gender, emp_Age);
				Selected_List.add(vo);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Selected_List;
	}

	public int delete(int emp_Num) {
		// 1. 드라이버 준비
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 드라이버 준비완료
			String db_Url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_Id = "shopping";
			String db_Password = "12345";
			conn = DriverManager.getConnection(db_Url, db_Id, db_Password);
			if (conn == null) {
				System.out.println("DB연결 실패ㅠㅠ");
			}
			String sql = "DELETE FROM OFFICE_MEMBER WHERE EMP_NO= ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp_Num);
			// sql 설정 완료
			cnt = psmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
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
				e.printStackTrace();
			}
		}

		return cnt;
	}
	
	public int update(int updateHp, int emp_No) {
		OfficeMemberVO vo=new OfficeMemberVO(updateHp,emp_No);
		try {
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
			String sql="UPDATE OFFICE_MEMBER SET EMP_HP = ? WHERE EMP_NO=? ";
			psmt=conn.prepareStatement(sql);
			psmt.setInt(1, vo.getEmp_Hp());
			psmt.setInt(2, vo.getEmp_No());
			
			cnt=psmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("업데이트 실패");
		}finally {
			try {
				if(psmt!=null) {
					psmt.close();
				}
			if(conn!=null) {
				conn.close();
			}
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("DB연결해제 실패");
			}
		}
		return cnt;
		
	}

}
