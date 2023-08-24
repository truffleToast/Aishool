package ex03for;

import java.util.Scanner;

public class Ex04b369게임실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* TODO 3,6,9 게임을 진행해보자
		 * 0. 스캐너를 통해 얼만큼 반복할지 정하기
		 * 1. N의 자리에서 3,6,9가 있는지 판별 // 나눗셈을 해서 몫을 판단 PRINT하거나 변수만들기
		 * 2. N-1에서 3,6,9 판별
		 * 2. . 
		 * 3. 1의 자리에서 3,6,9판별
		 * 4. FOR문 끝내기
		 * 5. SC.close();
		*/
		
		Scanner sc= new Scanner(System.in); 		// 0. 스캐너를 통해 얼만큼 for 문을 반복해야 할지 정하기
		System.out.println("1~1000까지의 숫자를 입력해주세요");
		int num = sc.nextInt(); 					//num이라는 변수를 만들어 입력받기
		
		int num100 = num/100; // 100의 자리수
		int num10= num/10;	  // 10의 자리수
		int cnt = 0;		  // count
		for(int i=1; i<=num; i++) {
			if(num>1000) {
				
				System.out.println("1~1000의 숫자를 입력해주세요.");
			
				}else if(num==1000) {
					
					System.out.println(1000); //num이 1000인 경우
					
				}else if(num<10){ // 1000도 아니고 10보다 작은
					
					if(num==3|| num==6|| num==9) {
						System.out.println("짝");}
					else {
						System.out.println(num);}
				}
				else { // num이 100의 자리인경우
					if(num>=100) {
						if (num100 % 3 ==0) {
							cnt++;}
						
						if (num10 % 3 ==0) {
							cnt++;}
						
						if(num % 3==0){
							cnt++;}
							
					}else if(num>=10) {
						if (num10%3 ==0) {
							cnt++;}
						
						if (num%3==0) {
							cnt++;}
						
					} //else if 문 닫기
				} // else 문 닫기
//			switch(cnt) {
//			case 0:
//					break;
//			case 1: 
//					System.out.println("짝");
//					break;
//			case 2: 
//					System.out.println("짝짝");
//					break;
//			case 3:
//					System.out.println("짝짝짝");
//					break;
			
			if(cnt==3) {
				System.out.println("짝짝짝");
			}
			if(cnt==2) {
				System.out.println("짝짝");
			}
			if(cnt==1) {
				System.out.println("짝");
			}
			if(cnt>=4) {
				System.out.println("오류입니다.");
			}
			sc.close();
		}
		
					
				
				
				
				
			
			
			
			
		
		
		
	}
		

}


