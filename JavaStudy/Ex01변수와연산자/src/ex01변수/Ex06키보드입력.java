package ex01변수;

import java.util.Scanner;

public class Ex06키보드입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 레퍼런스 자료형: 값, 기능 등을 가지고 있다.
		// 키보드로 부터 입력을 받을 수 있는 변수 생성 (Scanner)
		//import Ctrl+Shift+O(alphabet)
		Scanner sc = new Scanner(System.in); 
		// 스캐너를 통해 정수를 입력받는 방법
		System.out.print("숫자를 입력해주세요: "); // 같은줄에 입력받기
		int temp =sc.nextInt();
		//String ch=sc.next(); String을 적을 때 띄어쓰기 한 이후의 데이터는 입력 x
		String ch=sc.nextLine(); //띄어쓰기까지 가능한 것이 nextLine
		System.out.println("입력한 숫자는 -> " + temp );
		System.out.println("입력한 문자는 -> " + ch);
		sc.close();// sc 닫기
	
		
	}

}
