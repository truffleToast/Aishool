package 일차원배열;


public class Ex02배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 배열 arr을 생성
		// 다음과 같은 값으로 초기화
		// 3,10,4,8,17,22,31

		// 1) arr 배열에 들어있는 값에 for문을 사용하여 한번에 출력
		int[] my_arr = { 3, 10, 4, 8, 17, 22, 31 };
		for (int i = 0; i < my_arr.length; i++) {
			System.out.print(my_arr[i] + " ");
		}
		// 2) arr 배열에서 짝수만 출력
		System.out.println();
		System.out.print("짝수는: ");
		for (int i = 0; i < my_arr.length; i++) {
			if (my_arr[i] % 2 == 0) {
				System.out.print(+my_arr[i] + " ");
			}
		}
		System.out.println();

		// 3) arr 배열에서 가장 큰값
		int max = my_arr[0];
		for (int i = 1; i < my_arr.length; i++) {
			if (max < my_arr[i]) {
				max = my_arr[i];
			}
		}
		System.out.println("최대값은: "+max);
		
		// max=0: 만약에 배열에 들어가 있는 모든값들이 음수라면
		// 정확한 결과값을 받을수가 없다.
		// + 배열안에 들어있는 값들로만 비교를 해야한다.
	}
}
