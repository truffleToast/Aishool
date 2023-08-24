package ex01변수;
public class Ex02변수의종류 {
	public static void main(String[] args) {
		// JAVA 변수의 종류

		// 정수형 데이터 타입
		// byte -8bit (256가지의 숫자: -128 부터 127까지 )
		byte num1 = 100;

		// short -2 byte
		short num2 = 5000;

		// int - 4byte
		int num3 = 244444444;

		// long - 8byte
		long num4 = 3000000000L;

		// 실수형 데이터 타입 -float , double

		// float -4 byte
		float num5 = 14.3F;

		// double - 8byte
		double num6 = 3.14;

		// 논리형(True or False)
		// boolean - 1bit or 1byte

		boolean isCheck = true;

		// 문자형
		// char - 2byte
		char text = 'A'; // Ascii 코드 상 65
		char tex2 = '가'; // unicode 44032
		System.out.println(text);
		System.out.println(tex2 + 1);

		System.out.println(text + 1);
		System.out.println((char) 99);
		

		// 변수의 규칙
		/*
		 * 1. 키워드 불가(자동으로 볼드체 처리 된 문자) 2. 대소문자가 구분된다. 3. 숫자로 시작할 수 없다. 4. underbar(_)와
		 * $를 제외한 모든 특수문자는 사용이 불가하다.
		 */

		// 변수의 약속
		/*
		 * 1. CamelCase(맨 앞글자를 제외한 단어마다 대문자) 2. PascalCase(단어의 모든 앞글자를 대문자) 3.
		 * SnakeCase(단어사이에 언더바 표시) 4. Hungarian
		 */
	}
}