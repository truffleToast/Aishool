package 일차원배열;

import java.util.Scanner;

public class ex07배열예제 {

   public static void main(String[] args) {

      // 사용자로부터 별의 개수를 입력받아서 출력하기
      // 1) 입력하는 도구 가져오기
      Scanner sc = new Scanner(System.in);
      // 2) 별의 개수를 저장하는 배열 선언
      int[] star = new int[5];
      // 3) 사용자로부터 별의 개수 입력받아 배열에 저장하기
      for(int i = 0; i < star.length; i++) {
         // i : 0 1 2 3 4
         // 출력문
         System.out.print((i+1)+"번째 별의 개수를 입력 >> ");
         // 배열[i] = 입력문
         star[i] = sc.nextInt();
      }
      
      // 4) 배열에 저장되어있는 별의 개수를 꺼내와서 별을 출력하자
      // build up!
      
      for(int j = 0; j < 5; j++) {
         // j : 0 1 2 3 4 (5번 반복)
         // 1번째 출력 : star[0] 데이터만큼 별을 출력
         System.out.print(star[j]+" : ");
         for(int i = 0; i < star[j]; i++) {
            // star[0] 데이터 값만큼 반복하는 for문
            System.out.print("*");
         }
         System.out.println();
      }
      sc.close();
     
      
      
//      // 2번째 출력 : star[1] 데이터만큼 별을 출력
//      System.out.print(star[1]+" : ");
//      for(int i = 0; i < star[1]; i++) {
//         System.out.print("*");
//      }
//      // 3번째 출력
//      System.out.print(star[2]+ " : ");
//      for(int i = 0; i < star[2]; i++) {
//         System.out.print("*");
//      }
//      
      
      
   }

}