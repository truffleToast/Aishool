package 저금통;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		piggyBank pig1= new piggyBank(1500);
		// 저금통 설계도를 사용해서 저금통을 1개 만들어주자.
		// piggy_bank에서 만들엇음
		
		// 2) 초기금액을 1500원으로 설정
		pig1.setMoney(2000);
		System.out.println(pig1.getMoney());
		
		//pb.money= 1500;
		//pig1.money=2000000;
		// 3) 저금통에 700원을 입금
		pig1.deposit(700);
		// 4) 잔액보기
		pig1.showMoney();
		
		
		// 5) 인출하기
		pig1.withdraw(500);
		// 6) 잔액보기
		pig1.showMoney();
		
		// 오버로딩 
	}

}
