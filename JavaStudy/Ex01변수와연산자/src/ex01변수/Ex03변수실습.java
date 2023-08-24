package ex01변수;

public class Ex03변수실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수형 변수 num1에 10을 넣기
		// int num1 =10;
		int num1; // 선언
		num1 = 10; // 할당
		num1 = 100;
		// 변수의 특징 - 변수에 새로운 값을 할당하는 순간
		// 이전의 값은 사라진다.

		// 치환 알고리즘
		System.out.println(num1);
		int myAge = 26;
		int yourAge = 28;

		System.out.println("나의 나이 : " + myAge);
		System.out.println("짝꿍의 나이 : " + yourAge);

		System.out.println(""); // 한줄 띄기

		////////////////////////
		int newAge = myAge; // newAge에 내 원래 나이 저장
		myAge = yourAge; // myAge를 상대 age로 할당
		yourAge = newAge; // 내 원래 나이를 상대에게 할당

		////////////////////////
		System.out.println("나의 나이 : " + myAge);
		System.out.println("짝꿍의 나이 : " + yourAge);
	}

}
