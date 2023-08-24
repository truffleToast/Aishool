package 이차원배열;

public class Ex06예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 설정
		int[][] arr=new int[5][5];
		// 초기 num값 설정
		int num=21;
		//반복되야 할 것 1씩 더하기
		//num++;
		// if문을 활용하면 되지 않을가?
		// 홀수줄은 왼쪽에서 오른쪽
		// 짝수줄은 오른쪽에서 왼쪽
		
		
		// 21 22 23 24 25
		// 30 29 28 27 26
		
		for(int j=0;j<arr.length;j++) {
			for(int i=0; i<arr[j].length;i++) {			
				if(j%2==0) {
					arr[j][i]=num;
					num++;
				}
				else {
					arr[j][arr.length-1-i]=num;
					num++;
				}
			}
		}
		for(int j=0; j<arr.length;j++) {
			for(int i=0;i<arr[j].length;i++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();	
		}
		
		
		

	}

}
