package ex02do_while;

import java.util.Random;
import java.util.Scanner;

public class Bonus누산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Random rd = new Random();

		System.out.println("==== Plus Game ====");
		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;
		int life = 3;
		int lastValue;

		do {
			System.out.print(num1 + "+" + num2 + "=  ");
			lastValue = num1 + num2;

			int userAnswer = sc.nextInt();
			if (lastValue == userAnswer) {

				System.out.println("정답입니다.");
				num1 = lastValue; // lastValue에서 나온값을 num1에 다시 저장
				num2 = rd.nextInt(10) + 1; // num2는 계속해서 받아야 한다.
			} else {
				life--; // 틀리면 라이프 차감
				System.out.println("오답입니다.");
				System.out.println("다시 한번 답을 입력해주세요. 남은 목숨: " + life);

				if (life == 0) {
					System.out.println("게임오버입니다.");
					break;

				}
			}
		} while (true);
		sc.close();

	}

}
