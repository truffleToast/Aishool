package ex03for;

public class Ex06심플구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1; i<=9; i++) {
//			System.out.println(2+"X"+i+"="+i*2);	
//		}
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(j+"X"+i+"="+j*i);
			}
		}
	}

}
