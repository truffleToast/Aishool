package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Alogrism10811 {

	public static void main(String[] args) throws IOException{
		//1. 데이터를 입력 받아야한다.
		//2. 입력 받기위해 import
		//3. 거꾸로 바꾸는 과정 	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // br이라는 변수로 Buffered입력
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); //bw이라는 변수로 Buffered 출력
		// 입력 및 출력 import완료
		bw.write("바구니의 개수와 몇번 바꿀것인지 공백을 기준으로 두개 입력해주세요");
		bw.flush();
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // st라는 변수로 토큰을 입력받을수 있게 한다. 
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		bw.write("역순으로 바꿀 범위를 입력해주세요");
		bw.newLine();
		bw.flush();
		// n과 m을 readLine에서 불러온 값을 바탕으로 배정
		// 거꾸로 바꾸는 방법(메서드로 작성해보자)
		// array 만들기
		bw.write("바꾸기로 한 횟수만큼 입력해줘야 합니다. 그렇지 않을 경우 오류");
		bw.flush();
		int[] num = new int[n];
		for(int k=0;k<num.length;k++) {
			num[k]=k+1;
		}
		for(int k=0; k< m;k++) {
			st= new StringTokenizer(br.readLine(), " "); //새롭게 토큰받기
			int i=Integer.parseInt(st.nextToken()); // i와 j
			int j=Integer.parseInt(st.nextToken());
			int start = i-1; //start를 i-1로 초기화(인덱스는 0부터 시작하니깐)
			int end= j-1;    //end를 j-1로 초기화(인덱스는 0부터 시작하니깐)
			reverse(num, start, end);
		}
		
		String[] stnum=new String[num.length];
		for(int k=0 ; k<num.length;k++) {
			stnum[k]=Integer.toString(num[k]);
		}
		for(int k=0; k<num.length;k++) {
			bw.write(num[k] + " ");
		}
		bw.flush();
		br.close();
		bw.close();
			
			
		
		
	}
	public static void reverse(int[] arr , int start, int end ) { //배열, 시작 지점 , end지점 , 몇번 시행할 것인가?
		while(start< end) {
			int temp= arr[start];
			arr[start]= arr[end];
			arr[end]= temp; //서로 바꾸기 위해서는 새로운 변수를 지정해야 한다.
			start++;
			end--;
		}
	}
}
