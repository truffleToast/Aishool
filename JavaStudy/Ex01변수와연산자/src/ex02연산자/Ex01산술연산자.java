package ex02연산자;

public class Ex01산술연산자 {

	public static void main(String[] args) {
		// TODO 산술연산자
		int num1 = 7;
		int num2 = 3;
		
		int result1= num1 + num2;
		System.out.println(result1);
		int result2=num1-num2;
		System.out.println(result2);
		int result3= num1*num2;
		System.out.println(result3);
		// 나눗셈, %와 /
		int result4 = num1 / num2 ;	// 몫만 나오는 연산자이나, 정수 / 정수는 정수만 표기하므로2 	
		System.out.println(result4);
		double result5 = 7 / 3.0; 
		System.out.println(result5); // 몫을 나누는 연산자 이나 자동형변환으로 인해 실수로 표기됨
		int result6 = num1 % num2;
		System.out.println(result6);
		
		// 그렇다면 문자열과 숫자를 더하면 어떻게 되는가?
		System.out.println("바나나" + 8 + 2); // 앞에서부터 처리하므루 바나나8 -> 바나나82
		System.out.println("바나나" + (8 + 2)); // 괄호를 처리하고 나서 연산 -> 바나나 10
		System.out.println("바나나"+ 3*2);
		System.out.println("81"+3*2+2+4); // 81624
	}

}
