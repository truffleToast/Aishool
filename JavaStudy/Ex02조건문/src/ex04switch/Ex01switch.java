package ex04switch;

import java.util.Scanner;

public class Ex01switch {

	public static void main(String[] args) {
		// 스위치를 사용해보장
		// switch를 활용한 메뉴 선택
		// 1. 햄버거 2. 짜장면 3. 제육볶음 4. 초밥
		Scanner sc= new Scanner(System.in);
		System.out.println("=========점심 메뉴=========");
		System.out.print("1. 햄버거 2. 짜장면 3. 제육볶음 4. 초밥 >>");
		
		int lunch = sc.nextInt();
		
		switch(lunch) {
		case 1:
			System.out.println("동명동 본투비버거를 추천해드릴께요!");
			break;
		case 2:
			System.out.println("열도지 간짜장을 추천드립니다.");
			break;
		case 3:
			System.out.println("수라간 제육볶음을 추천드립니다.");
			break;
		case 4:
			System.out.println("초밥은 아무곳이든 괜찮아용 ^^");
			break;
		default:
			System.out.println("정확한 숫자를 입력해 주세요");
			break; //선택사항
		}
		sc.close();
	

	}

}
