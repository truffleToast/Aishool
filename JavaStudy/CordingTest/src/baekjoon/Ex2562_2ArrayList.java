package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2562_2ArrayList {// 2562번 함수와 BuffredReader & BuffredWriter

	public static void main(String[] args) throws Throwable, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> nums= new ArrayList<>();
		for(int i=0;i<9;i++) {
			int a=Integer.parseInt(br.readLine());
			nums.add(a);
			}
		int max=Collections.max(nums); //Collections의 Math함수로 쉽게 최대값을 구할 수 있다.
		String str_max= Integer.toString(max);
		bw.write(str_max); // 문자로만 출력하는 함수이기때문에 문자로 바꿔주는 작업
		bw.newLine(); //줄바꿈
		bw.flush();
		
		int index1=nums.indexOf(max)+1; //ArrayList에서 index값을 불러오는 작업
		String str_idx1=Integer.toString(index1); //index를 불러와서 다시한번 문자화
		bw.write(str_idx1);
		bw.flush();
		
		br.close();
		bw.close();
		//Math(max,nums)
		}
	
//		int[] array = new int[9]; // 9칸 짜리 array를 생성
//		for(int i=0; i<array.length;i++) {
//			array[i]= sc.nextInt();	//9개를 입력 받는다. 한줄로 입력?
//		}
//		int max = array[0]; //max값을 array[0]으로 설정
//		for(int i=1; i< array.length; i++ ) { //int i를 1부터 array의 길이 여기서는 
//			if(max<array[i]) {               //9까지 실제 array 배열은 8까지만 존재
//				max=array[i];                 // max 값을 array에 지정 array 8까지 가면서
//			}                                // 그전에 값이 더 크다면 새롭게 max라는 변수에 넣는다.
//		}
//		System.out.println(max);
//		// 최대값은 받았음. 근데 그 인덱스를 찾아야함
//		int a=0;	
//		
//		while (true) {
//			
//				if(max==array[a]) {
//					System.out.println(a+1);
//					break;
//				}else {
//					a++;
//			}
//		sc.close();
}


