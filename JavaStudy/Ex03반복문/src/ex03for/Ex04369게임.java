package ex03for;

public class Ex04369게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int i;
//		for (i = 1; i <= 50; i++) {
//			if (i% 10 == 3 || i % 10 == 6 || i % 10 == 9) { //나머지로 3,6,9 판별
//				
//				System.out.println("박수");
//				
//			} else if (i % 10 == 5) {
//				System.out.println("으악");
//				
//			} else {
//				System.out.println(i);
//			}
//		}
		int j;
		for (j=1; j<=50; j++) {
			if (j % 10 == 3 || j % 10 == 6 || j % 10 == 9) { //나머지로 3,6,9 판별
				System.out.println("짝");
			} else {
				String sj=Integer.toString(j);
				if(sj.contains("3")||sj.contains("6")||sj.contains("9")) {
					System.out.println("짝");	
				}else {
					System.out.println(sj);
				}
			}
			
		}
		System.out.println("다음문제입니다");
		
		int k;
		for (k=1; k<=50; k++) {
			String sk=Integer.toString(k);
			if(sk.contains("3")||sk.contains("6")||sk.contains("9")) {
				String replaceSk3=sk.replace("3", "");
				String replaceSk6=sk.replace("6", "");
//				String replaceSk9=sk.replace("9", "");
				int count3=sk.length()-replaceSk3.length();
				int count6=sk.length()-replaceSk6.length();
//				int count9=sk.length()-replaceSk9.length();
				
				if(count3>0) {
					String cl3=sk.replace("3", "짝");
					System.out.println(cl3);
				}else if(count6>0) {
					String cl6=sk.replace("6", "짝");
					System.out.println(cl6);
				}else {
					String cl9=sk.replace("9", "짝");
					System.out.println(cl9);
				}
					
				// DONE 문자에 포함된 3, 6, 9의 개수를 세라
				//TODO 개수만큼 짝!을 프린트
				//while 
			
				
			}else {
				System.out.println(sk);
			
			}
		}
	}

}
