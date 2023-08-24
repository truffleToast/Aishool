package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex01Select {

	public static void main(String[] args) {
		int cnt=0;
		Connection conn= null;
		PreparedStatement psmt= null;
		ResultSet rs=null;
		//1. 데이터베이스 동적로딩
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DB가 존재하는 URL, 아이디, 비밀번호
			String db_url="jdbc:oracle:thin:@localhost:1521:xe";
			String db_id="shopping";
			String db_pw="12345";
			
			//권한 가져오기 
			
				conn=DriverManager.getConnection(db_url,db_id,db_pw);
				// TODO Auto-generated catch block
			
			//Select
			String sql="SELECT * FROM MEMBER";
			psmt=conn.prepareStatement(sql);
			//ResultSet: sql select문을 실행시 돌아오는 
			rs=psmt.executeQuery();
			
			//rs.next():커서를 한칸씩 이동시키면서 데이터가 있는지 없는지에 대한 
			// 결과값을 t/f 로 받아오는 메서드 --> while문을 활용해서 반복하면 되지 않을가?
			while(rs.next()) {
				String id =rs.getString(1);
				String pw =rs.getString(2);
				String nickname =rs.getString(3);
				System.out.println(id+"\t"+pw+"\t"+nickname);
			}
			
		
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(rs!=null)
						rs.close();
					if(psmt!=null)
						psmt.close();
					if(conn!=null)
						conn.close();
				}
				catch (SQLException e) {
					System.out.println("자원반납오류");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
			
			
			
		
		
		
			
		}

	}


