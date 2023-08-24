package ex05메서드;

public class Ex06매서드예제 {

	public static int largerNumber(int a, int b){
		int result;
		if(a>b){
			 result =a;
		}else if(a==b){
			 result = 0;
		}else {
			 result = b;
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num1=10;
	int num2=24;
	int result =largerNumber(num1, num2);
	System.out.println("큰 수 확인: "+ result );
	
	
	}

}
