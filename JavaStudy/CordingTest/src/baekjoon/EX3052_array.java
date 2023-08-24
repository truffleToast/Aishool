package baekjoon;

import java.util.Scanner;

public class EX3052_array {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); //스캐너
	      int[] numberArray = new int[41];   //41칸 짜리 array를 만듬 
	      for (int i = 0; i < 10; i++) {       // i를 1부터 9까지 대입해서
	        int input_num = sc.nextInt() % 42 ; // 다음에 받은 숫자에서 42를 나눈 나머지를 input_num으로 초기화
	          numberArray[input_num] +=1; //배열에 집어넣고 1을 더한다. 예시, 1을 입력 받으면 input_num ==1 , numberArray[1]=2;
	      }
	      
	      // 9번 입력을 받은 후에 array 모양은
	      //[0,2,3,0,0,0,0,0,0,0,0,0,0,0,0,0,...,] 입력 받은 숫자에따라 array가 채워지고 나머지는 0으로 유지 될것이다. 
	      
	      int cnt = 0; // 같은 걸 알아내는 카운트 1. for 문을 통해 직접 비교 2. 함수있는지 알아보기
	      // 이중for문으로 해서 0번과 1번 비교, 0번과 2번 비교 0번과 3번 비교 --> 0번 9번 비교
	      // 그 후 1번과 2번, 1번과 3번, 1번과 4번--> 1번과 9번
	      // 2번과 3번, 2번과 4번, 2번과 5번 --> 2번과 9번 ... 8번과 9번 까지

	      for (int i = 0; i < numberArray.length; i++) { //0~41번째 행까지 비교해서 numberArray[i]값이 0이 아니면 cnt에 1을 더합니다.
	         if (numberArray[i]!=0) {
	            cnt++;
	         }
	              }
	      System.out.println(cnt);
	      sc.close();

	}

}
