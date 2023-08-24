package ex05메서드;

public class EX07메서드예제 {

	public static void main(String[] args) {
		// 완전수
		// 나를 제외한 약수의 합이 나와 같은 수
		// 6의 약수 1+2+3 ==6

		// 1단계 약수인지 아닌지 확인하는 메서드 만들기
		int num1 = 2;
		int num2 = 10;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		// 매개변수는 int num
		// 출력될 값은 return , boolean형
//		getDivisior(10);
//		getDivisior(16);
//		getDivisior(24);
		int num=10;
		int result=getSumofDivisors(num);
		System.out.println(num+ "의 약수의 합: "+result);
		getDivisior(num);
		System.out.println();
		int num3= 369;
		boolean result2= isPerpectNumber(num3);
		System.out.println(num3+"는 완전수인가요? : "+result2);
		
		int startValue=2;
		int endValue= 1000;
		System.out.println();
		getPerpectNumber(startValue,endValue);
	}

	public static boolean isDivisor(int num1, int num2) { //boolean을 통해 num1을 num2로 
		if (num1 > num2) {								  //나눴을 때 
			if (num1 % num2 == 0) {
				return true;
			} else {
				return false;
			}

		} else {
			if (num2 % num1 == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void getDivisior(int a) { // a의 약수를 파악하는 method
		System.out.print(a + "의 약수: ");
		for (int i = 1; i <= a; i++) {
			if (isDivisor(a, i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	

	public static int getSumofDivisors(int num1) {
		//약수의 합을 구하는 함수
		int sum= 0;
		for(int i=1;i<=num1;i++) {
			if(isDivisor(num1, i)) { // isDivisor num1, i가 true라면 sum에 i를 더하고 아니면 아무것도
			sum+=i;                  // 하지말고 for문을 반복
		}
		}
		return sum;
		
	}
	public static boolean isPerpectNumber(int num3) {
		int sum= getSumofDivisors(num3)- num3; // 약수의 합에서 자기 자신을 빼면 완전수 여부가 나온다.
		if (num3== sum) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void getPerpectNumber(int startValue, int endValue ) {
		System.out.print(startValue+"~"+endValue+"까지의 완전수: ");
		for(int i =startValue; i<=endValue; i++) {
			if(isPerpectNumber(i)) {
				System.out.print(i+" ");
				
			}
			
		}
	}

	
}
