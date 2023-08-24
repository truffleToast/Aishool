package ex01변수;

public class Ex05형변환 {

	public static void main(String[] args) {
		// 형변환(타입변환)
		// 현재의 자료형을 다른 형태의 자료형으로 변환하는 과정
		byte num1 = 100; // 1byte
		// 자동 형변환
		int num2 = 300; // 4byte
		/*
		 * byte num3 = num2; 불가, int가 byte보다 자료형이 크므로 변환하는 과정에서 데이터 손실 발생
		 */
		byte num3 = (byte) num2; // 강제 형변환
		// System.out.println(num2); num2 = 400(int)
		// System.out.println(num3); num3 = 2 
		// 실수형태의 형변환
		double num4 = 100.511;
		int num5 = (int) num4;
		// System.out.println(num5);
		float num6 = 3.14F;
		int num7 = (int) num6;
		// System.out.println(num7);
		int num8 = 100;
		float num9 = num8;
		System.out.println(num9);
		
		
		
		
		
	}
}
