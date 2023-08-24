package 일차원배열;

public class Ex03배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) 정수형 데이터를 저장할 수 있는 arr 배열을 생성
		// 2) 문제에 적혀있는 값으로 초기화
		//	23,45,95,17,6,89,47,56,68,17
		int[] arr = {23,45,95,17,6,89,47,56,68,17};
		// 3) arr에 들어있는 값중에 가장 큰 값
		int max=arr[0];
		for(int i=1; i< arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("최대값은: "+ max + "입니다.");		
		// 4) arr에 들어있는 값중에 가장 작은값 출력
		int min=arr[arr.length-1];
		for(int i=1;i<arr.length; i++) { 
			if(min>arr[arr.length-i]) {	  //뒤에서부터 연산할 것이므로 arr.length-i로 표현
				min=arr[arr.length-i];
			}
		}
		System.out.println("최소값은: " +min+"입니다");

	}

}
