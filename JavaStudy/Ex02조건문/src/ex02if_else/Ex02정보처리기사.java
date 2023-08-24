package ex02if_else;

import java.util.Scanner;

public class Ex02정보처리기사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("DB: ");
		int db=sc.nextInt();
		System.out.print("전자계산기 구조: ");
		int elC=sc.nextInt();
		System.out.print("OS: ");
		int os=sc.nextInt();
		System.out.print("데이터 통신: ");
		int data=sc.nextInt();
		System.out.print("소프트웨어 공학: ");
		int soft=sc.nextInt();
		
	
		if((db+elC+os+data+soft>=60) && 
			(db>=8 && elC>=8 && os>=8 && data>=8 && soft>=8)){
			System.out.println("합격입니다.!");
		}else {
			System.out.println("불합격입니다.!");
		}
		// Boolean으로 풀어보장
		boolean isCheck1 = (db +elC+os +data+soft)>=60;
		boolean isCheck2 = db>=8 && elC >= 8 && os >=8 && data>=8 && soft>=8;
		
		if (isCheck1 && isCheck2) {
			System.out.println("합격입니다.!");
		}else {
			System.out.println("불합격입니다.!");
		}
		sc.close();
	}
}
