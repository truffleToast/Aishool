package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex평균1546 {

	public static void main(String[] args) throws IOException {
//		세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다.
//		 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//		예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//		세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Integer.parseInt(br.readLine());
		bw.newLine();
		
		ArrayList<Integer> arr= new ArrayList<>();
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
			
			while(st.hasMoreTokens()) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			int max =Collections.max(arr);
			int sum= 0;
			
			for(int i=0; i<arr.size();i++) {
				sum+=arr.get(i);
			}
			double answer= sum*1.0/max*100/arr.size();
			bw.write(Double.toString(answer));
			bw.flush();
			br.close();
			bw.close();
		}
	
		//평균은 (S1+S2+S3+S4)/개수
		// 모든 작업 => (S1/M*100)+(S2/M*100)+(S3/M*100)+.../ 개수  =>
		// M*100으로 묶으면
		// (S1+S2+S3+S4)/M*100/4
		//StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		
		
		

	}


