package ex01while;

public class Ex04100까지의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지의 합은 : 5050
		int sum=0;
		int cnt=1;
		while (true) {
			sum+=cnt;
			if (cnt==100) {
				
				break;
			}
			cnt++;
		}
		System.out.println(sum);
		
		int sum1=0;
		int cnt1=1;
		while (cnt1<=100) {
			sum1+=cnt1;
			cnt1++;
		}
		System.out.println("1부터 100까지의 합은: " +sum1);
	}

}
