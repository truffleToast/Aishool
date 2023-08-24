package 이차원배열;

public class EX03예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];
		int num = 21;

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				array[i][j] = num;
				num++;
			}
		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
