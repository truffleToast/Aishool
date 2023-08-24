package ex01while;

import java.util.Scanner;

public class Ex03다이어트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int week=1; //주차를 기록할변수
		System.out.print("현재몸무게: ");
		int weight =sc.nextInt();
		System.out.print("목표몸무게: ");
		int target =sc.nextInt();
//		while (weight>= target) {
//			System.out.print(week+ "주차 감량 몸무게: ");
//			int minus = sc.nextInt();
//			weight-=minus;
//			week++;			
//		}
//		System.out.println(weight+ "kg 달성!! 축하합니다!" );
		
		
		//while true문으로 풀기
		while (true) {
			if (weight>= target) {
				System.out.print(week + "주차 감량 몸무계: ");
				int minus1= sc.nextInt(); // 주차별 감량 몸무게
				weight-=minus1; // 현재몸무게 - 감량몸무게
				week++; //1주차, 2주차 이런식으로 늘리기
			}else
				break;
		}
		System.out.println(weight +"kg달성!! 축하합니다!!");
		
		sc.close();
		
		

	}

}
