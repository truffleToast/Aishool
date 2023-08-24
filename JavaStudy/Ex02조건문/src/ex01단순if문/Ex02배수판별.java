package ex01단순if문;

import java.util.Scanner;

public class Ex02배수판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수를 입력받아 3의 배수 이면서 5의 배수를 판별하는 알고리즘 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num =sc.nextInt();
		//입력 받은 수가 3의 배수이면서 5의 배수라면
		// 15 ->15는 3의 배수이면서 5의 배수입니다.
		//String
		if(num%15==0) {
			String result = num+"은(는) 3의 배수이면서 5의 배수입니다." ;
			System.out.println(result);
		}
		
		// int로 처리
		if(num%15==0) {
			int result2 = num;
			System.out.println(result2 + "은(는) 3의 배수이면서 5의 배수입니다.");
		}
		//or 연산자를 활용하여 3의 배수 또는 5의 배수를 판별하기
		if(num % 3==0 || num % 5==0) {
			String result3=  num +"은(는) 3의 배수 또는 5의 배수입니다.";
			System.out.println(result3);
			
			sc.close();
		}
		

	}

}
