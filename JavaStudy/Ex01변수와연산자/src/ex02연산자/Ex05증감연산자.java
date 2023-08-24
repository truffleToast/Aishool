package ex02연산자;

public class Ex05증감연산자 {

	public static void main(String[] args) {
		//증감연산자
		//변수의 값을 1올리거나 1감소시키는 연산자 
		int num = 10;
		// 증가
		System.out.println(++num); // num 앞에 ++를 썻을 경우 11로 num이 변환됨
		System.out.println(num++); // num 뒤에 ++를 썻을 경우
		System.out.println(num);
		
		// ++가 변수 앞에 있다면 -> 먼저 1을 증가하고 후처리
		// ++가 변수 뒤에 있다면 -> 출력 먼저 한 후 변수의 값이 1증가 
		
		//감소
		int num2 = 10;
		System.out.println(--num2);
		System.out.println(num2--);
	}

}
