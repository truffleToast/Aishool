package ex02do_while;

import java.util.Scanner;

public class Ex02합계와평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 자연수를 입력받는데 0~100 범위를 넘어가는 숫자가 나온다면 그 이전까지의 자료
		 * 의 합계와 평균을 출력
		 * 1. Scanner 임포트
		 * 2. do-while 조건문 작성
		 * 3. 입력받은 숫자가 100보다 클경우
		 */
		Scanner sc=new Scanner(System.in);
		int sum= 0;
		int cnt= 0;
		int test;
		// 기본 do-while
//		do{
//			System.out.println("숫자를 입력하세요");
//			test=sc.nextInt();
//			if(test>100) {
//				break;
//			}	
//			cnt++;
//			sum+=test;
//			
//
//		}while(test<100);
//		
//		System.out.println("합계: " + sum );
//		System.out.println("평균: " + (double)sum/cnt );
		
		do {
			System.out.print("숫자를 입력하세요");
			test=sc.nextInt();
			if(test>100) {
				break;
			}
			cnt++;
			sum+=test;
		}while(true);
		double average= (double)sum/cnt;
		System.out.println("합계: "+sum);
		System.out.println("평균: " + average);
		
		// int와 double을 이용한 장난질
		int average2= (int)(average * 100);
		double average3 = average2 / 100.0;
		System.out.println("평균(둘째짜리): "+ average3);
		

		
		sc.close();

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
