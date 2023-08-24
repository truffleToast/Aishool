package 이차원배열;

public class Ex05예제{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];
		//num 지정
		// num--
		int num=45;
		for (int j=0; j<array.length;j++) {
			for(int i=0;i<array[j].length;i++) {
				array[i	][j]=num;
				num--;
		}
		
		}
		for (int j=0; j<array.length;j++) {
			for(int i=0;i<array[j].length;i++) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
