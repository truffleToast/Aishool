package 일차원배열;

import java.util.Scanner;

public class EX05배열예제 {

	public static void main(String[] args) {
		// 1) 입력하는 도구 가져오기
	    Scanner sc=new Scanner(System.in);  
		// 2) 사용자가 입력한 5개의 점수들을 배열에 저장
	    // 배열의 이름 : score
	      int[] score= new int[5];
	      for(int i=0; i<score.length; i++) {
	    	  System.out.print((i+1)+"번째 점수 입력 : ");
	    	  int num =sc.nextInt();
	    	  score[i]=num;
	      }
	      
	      // 3) 입력된 점수들을 모두 출력하기 
	      for(int i=0; i<score.length; i++) {
	    	  System.out.print(score[i]+" ");
	      }
	      // 4) 최고 점수, 최저 점수 출력하기
	      int max=score[0];
	      for(int i=1; i<score.length; i++) {
	    	  if(max<score[i]) {
	    		  max=score[i];
	    	  }
	      }
	      int min=score[0];
	      for(int i=1; i<score.length; i++) {
	    	  if(min>score[i]) {
	    		  min=score[i];
	    	  }
	      }
	      System.out.println();
	      System.out.println("최고점수:" +max);  
	      System.out.println("최저점수: "+min);
	      
	      int sum=0;
	      // 5) 총합, 평균 출력하기
	      for(int i=0; i<score.length; i++) {
	    	  sum+=score[i];
	    			  
	      }
	      System.out.println("합계는: "+sum);
	      System.out.println("평균은: " +sum*1.00/score.length);
	      //int/double등을 통해 double값을 구하기
	      
	      
	      sc.close();
	}

}
