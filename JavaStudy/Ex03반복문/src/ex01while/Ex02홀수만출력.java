package ex01while;

public class Ex02홀수만출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//홀수만 출력
		int num1 = 0;
		//while true 말고 기본
		while (true) {
			
			while (num1<=100){
				if (num1%2==1) {
				System.out.println(num1);
				}
			num1++;
			}
		}

	}
}	