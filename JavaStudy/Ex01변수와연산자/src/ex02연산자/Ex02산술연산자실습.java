package ex02연산자;

import java.util.Scanner;

public class Ex02산술연산자실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3자리 숫자를 입력받아 십의 자리 이하의 값을 다 버리기
		// 526 -> 500, 311->300
		
		Scanner sc =new Scanner(System.in);
		System.out.print("정수입력 >> ");
		int num1 = sc.nextInt();
		// 10의자리를 버려주세요(몫)
		int num2= num1 / 100; // 100으로 나눈수의 몫
		int num3= num2 * 100; // 몫에 100을 곱해서 표기
		//
		System.out.println("백으로 나눈 수는? >> " + num2);
		System.out.println("결과확인(숫자형) >> " + num3);
		System.out.println("결과확인(문자형) >> " + num2+ "00" );
		
		// 나머지로 계산하기
		int num4= num1 -num1 % 100;
		System.out.println("결과확인(나머지로 연산) >> " + num4 );
		
		sc.close();
	}

}
