package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	
//	M: 데이터베이스에 내용을 저장, 가져온다
//	C: 사용자가 입력한 내용을 받아서 DAO로 보낸다.
//	V: 사용자가 입력, 사용자가 보는것
	
	
	
	
	public static void main(String[] args) {

		// DAO클래스 안에 있는 메서드를 활용하기 위해 객체생성
		MemberDAO dao = new MemberDAO();
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1. 회원가입\t2. 로그인\t3.회원목록\t4.회원정보수정\t5.회원탈퇴\t6.종료 >>");
			int menu = sc.nextInt();
			if (menu == 1) {
				int cnt=0;
				// 아이디 , 비밀번호 ,닉네임을 순서대로 입력해주세요.
				System.out.println("========회원가입=========");
				System.out.print("아이디 입력: ");
				String ID = sc.next();
				System.out.print("비밀번호 입력: ");
				String passWord = sc.next();
				System.out.print("닉네임 입력: ");
				String nickName = sc.next();

				cnt = dao.join(ID, passWord, nickName);

				if (cnt > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패...");
				}
			}

			else if (menu == 2) {
				// 로그인
				// 사용자한테 아이디랑 비밀번호 입력받기
				// 테이블에 해당 데이터가 있다면
				// 닉네임 가져와서 출력
				// 사용자에게 아이디랑 비밀번호 입력받기
				System.out.print("아이디를 입력해주세요! >> ");
				String user_id = sc.next();
				System.out.println("비밀번호 입력해주세요 >> ");
				String user_pw = sc.next();
				MemberVO user_info=dao.login(user_id,user_pw);
				if(user_info!=null) {
					System.out.println(user_info.getNickName()+"님 환영합니다~!");
				}else {
					System.out.println("로그인 실패, 아이디나 비밀번호가 잘못되었습니다.");
				}
				
			} else if (menu == 3) {
				// 전체 회원의 정보가 보여지게 만들자
				conn = null;
				psmt = null;
				rs = null;
				// 사용자로부터 조회할 테이블을 입력받자

				// 커넥션 다시 열기

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
					String db_id = "shopping";
					String db_pw = "12345";
					conn = DriverManager.getConnection(db_url, db_id, db_pw);

					String sql = "SELECT * FROM MEMBER";
					psmt = conn.prepareStatement(sql);

					rs = psmt.executeQuery();
					System.out.println("아이디\t비밀번호\t닉네임");
					System.out.println("--------------------");

					while (rs.next()) {
						String iD = rs.getString(1);
						String passWord = rs.getString(2);
						String nickName = rs.getString(3);
						System.out.println(iD + "\t" + passWord + "\t" + nickName);
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				catch (SQLException e) {
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
						e.printStackTrace();
					}
				}
			} else if (menu == 4) {
				int cnt = 0;
				// 전역변수로 쓰여야한다.
				conn = null;
				psmt = null;
				// 사용자로부터 아이디를 입력받아 비밀번호를 바꾸자.
				System.out.println("비밀번호를 바꾸고 싶은 아이디를 입력하세요");
				String iD = sc.next();
				System.out.println("새 비밀번호를 입력해주세요");
				String updatePw = sc.next();
				cnt =dao.update(updatePw,iD);
				if (cnt > 0) {
					System.out.println("비밀번호 변경 성공!");
				} else {
					System.out.println("비밀번호 변경 실패... 없는 아이디입니다.");
				}
			} else if (menu == 5) {
				// 아아디랑 비밀번호를 입력받아서
				// 해당 아이디 비밀번호가 있으면 테이블에서 정보가 사라지게 만들자
				int cnt=0;
				conn = null;
				psmt = null;
				System.out.print("회원 탈퇴 아이디 >> ");
				String iD = sc.next();
				System.out.print("회원 탈퇴 비밀번호 >> ");
				String passWord = sc.next();
				cnt = dao.delete(iD, passWord);

				if (cnt > 0) {
					System.out.println("탈퇴 완료!");
				} else {
					System.out.println("탈퇴 실패...");
				}
				// 성공한다면 회원탈퇴 완료

			} else if (menu == 6) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("숫자를 다시 입력해주세요");
			}

		}
		sc.close();

	}

}
