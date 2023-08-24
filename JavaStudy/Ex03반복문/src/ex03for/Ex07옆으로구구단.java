package ex03for;

public class Ex07옆으로구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 해야할것 옆으로 프린트하되 각단:은 한번만 출력되게
		// 출력 이후에는 앞의자리는 고정으로 하고 뒤에 자리만 바뀌면서 출력
		// 그 후 다 바뀐것을 출력
//		for(int i = 2; i <= 9; i++) {
//	         System.out.print(i + "단 :\t");
//	         for(int j = 1; j <= 9; j++) {
//	            System.out.print(i + "X" + j + "=" + i * j + "\t");
//	         }
//	         System.out.println();
//	      }
		
		for(int i = 2; i<=9; i++) {
	         System.out.print(i + "단 : ");
	         for(int j = 1; j<=9; j++) 
	         System.out.print(i + " X " + j + " = "  + i*j + " ");   // 역 슬래쉬 t (tab간격으로 띄워쓰기)
	         
	         System.out.println();
	      }   
	}	
}
