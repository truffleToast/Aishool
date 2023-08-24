package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX2566최대값 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 3, 4, 5, 6, 7, ,8, ,9, ,0, 0 

		int[][] Array = new int[9][9]; // 9*9의 배열,
		for (int i = 0; i < Array.length; i++) {// 9번입력 받으나 다른 숫자가 와도 활용할 수 있게 
			// Array에 넣는게 필요하다				Array.length로 활용
			String[] StrArray = br.readLine().split(" ");
			for (int j = 0; j < StrArray.length; j++) {
				Array[i][j] = Integer.parseInt(StrArray[j]); // 첫번째로 이 구문이 맞는가
			}
		}

		// 넣은 데이터를 바탕으로
		int maxRow = 0; // 최대값이 있는 행
		int maxCoulmn = 0; // 최대값이 있는 열
		int max = 0; // 최대값 추출해주는 필드
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				if (max < Array[i][j]) {
					max = Array[i][j];
					maxRow = i;
					maxCoulmn = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((maxRow + 1) + " " + (maxCoulmn + 1));
	}
}