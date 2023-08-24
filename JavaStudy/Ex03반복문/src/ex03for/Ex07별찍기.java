package ex03for;

public class Ex07별찍기 {

	public static void main(String[] args) {
		//  별찍기
//		for(int i =1; i<=5; i++) {
//			for(int j=1 ; j<=i ; j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		//  별찍기 2탄
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i ; j--) {
//				System.out.print("★");
//			}
//			System.out.println("");
//		}
		//  별찍기 3탄
		// 오른쪽부터 찍기
		for (int i = 1; i <= 5; i++) {
			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("★");

			}
			System.out.println();
		}

	}

}