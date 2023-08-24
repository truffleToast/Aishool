package ex05메서드;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex08오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메서드 특징
		// 오버로딩(Overloading) :중복정의
		// 같은 클래스 내에서 같은 이름의 메서드를 정의할수  있다.
		// 단 , 매개변수의 형태가 달라야한다. (형태: 데이터 타입, 갯수)
		Scanner sc=new Scanner(System.in);
		sum(2,3,4);
		// 숫자 두개를 더해주는 기능 sum2 
		// 숫자 세개를 더해주는 기능 sum3
		sum(sc); //숫자를 사용자가 원하는 만큼 입력받아 합을 출력헤주는 함수
	}
	public static void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void sum(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	public static void sum(Scanner sc) { //이거는 오버로딩과 관계 o void로 받으므로 return 없음. 
		System.out.print("숫자를 입력해주세요 0을 입력하면 멈춥니다");
		int answer=0;
		ArrayList<Integer> nums= new ArrayList<>(); 
		while(true) {
			int num=sc.nextInt();
			nums.add(num);
			answer+=num;
			if(num==0) {
				System.out.println(nums.size()-1+"번 더했습니다.합은: "+ answer+"입니다.");
				break;
		}
		}
		sc.close();		
	}
	

}
