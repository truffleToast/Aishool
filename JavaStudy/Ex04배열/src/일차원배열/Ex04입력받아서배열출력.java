package 일차원배열;

import java.util.Scanner;

public class Ex04입력받아서배열출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//사용자가 입력한 값으로 배열 초기화
		
		//1.숫자: 2. 숫자: 3. 숫자:
		Scanner sc = new Scanner(System.in);
		//+tip
		//System.in, in이라는 것은 Console에 입력할 수 있게 도와줌
		// out -> Console창에 출력 ex) Systemout.println()
		
		int num= sc.nextInt();
		//정수형으로 만들어보자
		
		
		int[] number= new int[num];
		for (int i=0 ; i<number.length;i++) {
		System.out.print((i+1)+"번 숫자 : ");
		number[i] =sc.nextInt();
		}
		for(int i =0; i<number.length; i++) {
			System.out.print(number[i]+" ");
		}
		sc.close();


	}

}
