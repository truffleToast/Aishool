package baekjoon;

import java.util.Scanner;

public class Ex2562 {// 2562번

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] array = new int[9]; // 9칸 짜리 array를 생성
		for(int i=0; i<array.length;i++) {
			array[i]= sc.nextInt();	//9개를 입력 받는다. 한줄로 입력?
		}
		int max = array[0]; //max값을 array[0]으로 설정
		for(int i=1; i< array.length; i++ ) { //int i를 1부터 array의 길이 여기서는 
			if(max<array[i]) {               //9까지 실제 array 배열은 8까지만 존재
				max=array[i];                 // max 값을 array에 지정 array 8까지 가면서
			}                                // 그전에 값이 더 크다면 새롭게 max라는 변수에 넣는다.
		}
		System.out.println(max);
		// 최대값은 받았음. 근데 그 인덱스를 찾아야함
		int a=0;	
		
		while (true) {
			
				if(max==array[a]) {
					System.out.println(a+1);
					break;
				}else {
					a++;
			}
		sc.close();
	}

	}

}