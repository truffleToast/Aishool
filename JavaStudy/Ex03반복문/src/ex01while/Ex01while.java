package ex01while;

public class Ex01while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문- 조건에 성립할 때까지 반복하는 문법
		// while, do-while, for
		
		// while(조건식){
		// }
		// while을 사용하여 1부터 5까지 출력
		
		int num1 =1 ;
		while (num1<=5) {
			System.out.println(num1++);
		}
		
		
		//while true로 풀기
		
		int num2= 1;
		while(true) {
			System.out.println(num2);
			
			if(num2==5) {
				break;
			}
			num2++;
		}
	
		
 	}

}
