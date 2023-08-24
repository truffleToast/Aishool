package ex02do_while;

import java.util.Random;
import java.util.Scanner;

public class Ex04PlusGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 더하기 게임
		// 난수 뽑기
		Scanner sc = new Scanner(System.in);

		Random rd = new Random();

		// 틀렸을때는 기존문제를 풀고
		// 성공했을 때는 새로운 문제를 풀어보자
		// 첫 게임 시작할때는 3개의 목숨을 주어준다
		// 문제의 답을 틀렸을 때는 목숨을 하나씩 차감

		System.out.println("==== Plus Game  ====");
		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;
		int life = 3;
		int cnt=0;
		do {
			System.out.print(num1 + " + " + num2 + " = ");
			int inputNum = sc.nextInt();

			// 정답확인
			int answer = num1 + num2;
			if (inputNum == answer) {
				System.out.println("Success!!!");
				num1 = rd.nextInt(10) + 1;
				num2 = rd.nextInt(10) + 1;
				cnt++;
			} else {
				System.out.println("Fail...");
				life--;
				System.out.println("남은 목숨: " + life + "개");
			}
		} while (life>0);
		System.out.println("게임종료!");
		System.out.println("정답개수: " +cnt);
		sc.close();
	}

}
