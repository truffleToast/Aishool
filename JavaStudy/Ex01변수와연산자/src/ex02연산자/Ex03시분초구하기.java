package ex02연산자;

import java.util.Scanner;

public class Ex03시분초구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3723
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력해주세요:");
		int totalSecond =sc.nextInt();
		// 시간분초
		// 1시간은 3600초 그 다음 분은 60분 그 후 60초
		// 나머지를 활용
		int h = totalSecond / 3600; // 몫
		int m = totalSecond % 3600 /60 ; 
		// 총 시간에서 시간을 구한뒤 나머지를 60으로 나눔
		int s = totalSecond % 3600 % 60 ; 
		// 총 시간에서 시간을 구하고 분도 구한뒤 나머지
		//실습
		System.out.println("시간 :" + h + "시" + m + "분" + s + "초입니다." );
		sc.close();
	}

}
