package 일차원배열;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// N칸 짜리 정수만들기
		Scanner sc =new Scanner(System.in);
		Random rd= new Random();
		// 배열 생성
		int N=sc.nextInt();
		int[] lotto=new int[N];
		
		System.out.println("=======이번주 로또========");
		System.out.println("이번주의 당첨결과는??");
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=rd.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
			
		}
		sc.close();
	}

}
