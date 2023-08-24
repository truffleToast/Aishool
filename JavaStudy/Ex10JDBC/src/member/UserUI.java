package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserUI {

	public static void main(String[] args) {
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
			if(menu==2) {
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
			}
			if(menu==3) {
				// 정보 조회
				System.out.println("정보를 조회합니다.");
				
				
				
				
				
				
			}
	
	
	
	
	
	
	
	
	}
		
	}
	
	

}
