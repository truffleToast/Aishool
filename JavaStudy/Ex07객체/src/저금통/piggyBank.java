package 저금통;

public class piggyBank {
	//piggy_bank는 저금통이 설게되는 곳 실제 출력되는 곳은 Main.java
	//필드를 선언
	private int money;
	//private(사적인)
	//: 클래스 내부에 있는 메서드를 통해서만 접근 가능하도록 도와주는 접근제한자.
	// private으로 감싸진 필드에 접근하고 싶으면 클래스 내부에 메서드가 설계되어있어야한다.
	//수정(Set)이나 가져(Get)와서 표현한다.
	
	
	
	public void deposit(int money) {
		// 매개변수 int money\
		
		
		//1.5) 생성자(메서드)
		// 생성자도 메서드 이다.
		// 생성자는 리턴값이 없다. (Void도 아니다)
		// 새로운 생성자를 만들면 기본생성자는 사용할 수 없다.
		// 기본생성자도 새용하고 싶으면 코드로 작성해 줘야 한다.
		// 기본 생성자도 사용하고 싶다면 코드로 작성해야한다.
		// 기본 생성자는 클래스로 만들때 생략되어 있다. 
		// : main에서 받아온 금액
		// 내가 가지고 있는 money =현재 필드 money + main
		
	
		
		System.out.println("돈을 넣습니다. 예금전 잔고는 "+this.money+"원입니다.");
		System.out.println(money+"만큼 입금합니다.");
		this.money+=money;
		System.out.println("현재 잔액은 "+this.money+"입니다.");
		System.out.println();
	}
	
	public void withdraw(int money) {
		System.out.println("돈을 인출합니다. 인출하기전 잔고는 "+this.money+"입니다.");
		System.out.println(money+" 만큼 돈을 출금합니다");
		this.money-=money;
		System.out.println( "현재 잔액은: "+ this.money+"입니다.");
		System.out.println();
	}
	public void showMoney() {
		System.out.println("잔액을 보여줍니다");
		System.out.println("현재 잔액은: "+this.money+"입니다.");
		System.out.println();
	}
	public piggyBank(int money) {
		this.money=money;
	}
	
	public void setMoney(int money) {
		this.money=money;
	}
	public int getMoney() {
		return money;
	}
	// 클래스 내부에서 접근할 수 있게 하는 메서드 get, set 
}

	
