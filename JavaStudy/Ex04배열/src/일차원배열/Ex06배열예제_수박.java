package 일차원배열;

import java.util.Scanner;

public class Ex06배열예제_수박{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Scanner 임포트
		Scanner sc = new Scanner(System.in);
		System.out.println("====수박게임 Start=====");
		System.out.print("숫자를 입력해주세요:");
		int num = sc.nextInt();
		// 2. 배열만들기

		String[] arr = { "수", "박" };
		System.out.print("결과: ");
		
		//3. for문 시작
		//4. for문에 횟수는 i를 통해 알 수 있다.
		// for문이 홀수번째: 수 --> i:0 2 4 6...
		// for문이 짝수번째: 박 --> i:1 3 5 7...
		
		for (int i = 0; i < num; i++) {
			// if를 통해 판별
			if (i % 2 == 0) {
				System.out.print(arr[0]);
			} else {
				System.out.print(arr[1]);
			}

		}
		sc.close();

	}

}
