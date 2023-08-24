package 이차원배열;

public class Ex04예제 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array= new int[5][5];
		int num= 25;
		// 이중 for문이 필요
		// num--;
		// num+=5;
		for(int j=0; j<array.length; j++) {
			for(int i=0; i<array[j].length;i++) {
				array[j][i]=num;
				num--;
			}
			num+=10;
		}
		for(int j=0;j<array.length;j++) {
			for(int i=0; i<array[j].length;i++) {
				System.out.print(array[j][i]+ "\t");
			}System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
