package ex04switch;

import java.util.Scanner;

public class Ex03계절판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요: ");
		int month= sc.nextInt();
		switch (month) {
		case 1 :
		case 2 :
		case 12: 
			System.out.println(month + "월은 겨울입니다!");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println(month + "월은 봄입니다!");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month + "월은 여름입니다!");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month + "월은 가을입니다!");
			break;
		default:
			System.out.println("1부터 12까지의 수를 입력해 주세요");
			break;
		// 구글링 했을 때 or은 이렇게 처리할 수 있다.	이유 : break; 가 나올때까지 계속 해서 나오므로
		}
//		한줄로 풀기
//		switch (month) {
//		case 1, 2 ,12 -> System.out.println("겨울입니다.");
//		case 3, 4 ,5 -> System.out.println("봄.");
//		case 6, 7 ,8 -> System.out.println("여름.");
//		case 9, 10 ,11 -> System.out.println("가을입니다.");
// 	
//		}
		sc.close();
	}
}	

		
