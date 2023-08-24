package ex05메서드;

public class Ex03매o리x {

	public static void main(String[] args) {
//		매개변수는 있으나 리턴타입x
//		전달인자는 있고, 리턴타입 자리에 데이터 타입이 명시x (return 키워드가 안온다.)
//		void가 오는 경우는 메서드가 순수하게 기능자체를 가지고 있는 경우
//		ex)syso, complile하는 기능..
//
//		sumPrint : 숫자 2개를 받아서 더한 결과값을 출력해주는 기능
		
		sumPrint(3,5);
		//+ 
//		System.out.println(sumPrint(3,5));
		// 실행시 오류 ->출력하는 기능 자체를 출력하려고함

	}
	
	
	
	//sumPrint 만들기
	public static void sumPrint(int num1, int num2) {
//		num1, num2를 더한 결과값을 출력
		System.out.println(num1+num2);
//		void라는 리턴타입은 return x
	}

}
