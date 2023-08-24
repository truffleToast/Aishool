package ex02do_while;

import java.util.Scanner;

public class Ex03로그인프로그램 {

	public static void main(String[] args) {
		// do-while, while 
		// while과 do-while은 반복 횟수가 주로 정해져 있지 않다.
		// 로그인프로그램
		
		Scanner sc= new Scanner(System.in);
		String id = "gw" ;
		String pw = "1234" ;
		int loginCount=0;
//		do {
//			System.out.print("아이디를 입력해 주세요: ");
//			String inputId=sc.next();
//			System.out.println("비밀번호를 입력해 주세요: ");
//			String inputPw=sc.next();
//			if(inputId.equals(id) && inputPw.equals(pw)) {
//				System.out.println("로그인 성공!");
//				break;
//			}else {
//				System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
//			}
//			}while(true);
//			
//		
//		sc.close();
		do {
			System.out.print("아이디를 입력해 주세요: ");
			String inputId=sc.next();
			System.out.println("비밀번호를 입력해 주세요: ");
			String inputPw=sc.next();
			if(inputId.equals(id) && inputPw.equals(pw)) {
				System.out.println("로그인 성공!"); // 로그인 성공의 경우
				break;
			}else if(!inputId.equals(id)) {
				System.out.println("등록되지 않은 아이디입니다."); // 아이디가 틀렸을 때
			}else {
				System.out.println("비밀번호가 잘못되었습니다."); // 아이디는 등록되어 있는데
			}											// 비밀번호가 틀렸을때
			loginCount++;								// 로그인 카운트를 세서 더
			if(loginCount>3) {							//이상 로그인 못하게 하는
				System.out.println("오늘은 더 이상 로그인 불가!"); //것
				break;
			}
		}while(true);
		sc.close();		
	}
}
