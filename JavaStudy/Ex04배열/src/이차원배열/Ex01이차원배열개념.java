package 이차원배열;

public class Ex01이차원배열개념 {
	
	public static void main(String[] args) {
		//이차원 배열
		// : 1차원 배열 안에 1차원 배열이 들어가 있는 자료구조
		
		//1. 이차원배열 선언
		// 자료형[][] 베열명 = new 자료형[배열의 크기1][베열의 크기2] 
		int[][] arr=new int[5][4];
		
		// 배열의 크기1: arr주소값에 들어갈 배열의 크기 -->5
		// 배열의 크기2: arr안에 있는 배열에 들어갈 배열의 크기
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][2]);
		
		//length
		System.out.println(arr.length); //arr에 있는 배열의 크기
		System.out.println(arr[0].length); //배열안에 들어 있는 배열의 크기
		
		
	}

}
