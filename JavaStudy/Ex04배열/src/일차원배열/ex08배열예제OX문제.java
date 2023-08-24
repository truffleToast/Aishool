package 일차원배열;

import java.util.Scanner;

public class ex08배열예제OX문제 {

	public static void main(String[] args) {
		//입력받을 값 임포트
		Scanner sc= new Scanner(System.in);
		//기본으로 입력된 배열
		int[] answer={1,4,3,2,1};
		
		//사용자가 입력할 배열
		int[] input= new int[5];
		
		// 맞으면 o, 틀리면 x -> if
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		//build up
		
		// 반복될 부분: 사용자가 입력할 부분
		
		// for문 시작
		int score=0;
		for(int i=0; i<input.length;i++) {
			System.out.print((i+1)+"번답 >>");
			input[i]=sc.nextInt();			
		}
		System.out.println("정답확인");
		for(int i=0 ; i<input.length; i++) {
			if(answer[i]==input[i]) {
				System.out.print("O ");
				score+=20;
			}
			else{
				System.out.print("X ");	
				}
			}
		System.out.print("총점: "+score);
	
		sc.close();		
		}
		
		
		
}


