package ex02연산자;

import java.util.Scanner;

public class Ex09삼항연산자홀짝판별 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수를 입력받아 홀수인지 짝수인지 판별하세요
		//Scanner 부르는 함수
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int num =sc.nextInt();
		String result = num % 2 == 1 ? 
				"홀수입니다." :
				"짝수입니다." ;
		System.out.println(num + "는(은)" + result);
		
		sc.close();
	}

}
