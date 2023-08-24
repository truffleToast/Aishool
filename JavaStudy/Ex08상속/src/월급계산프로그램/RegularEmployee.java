package 월급계산프로그램;

public class RegularEmployee extends Employee {
	protected int bonus;
	//부모 클래스에 생성자가 있으면 자식도 반드시 생성자가 있어야한다.
	
	// 부모 클래스 --> 수퍼 클래스
	// super : 부모클래스를 지징하는 키워드
	// super() : 부모클래스의 생성자를 지칭하는 키워드
	
	
	
	
	@Override
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus=bonus;
	}
//	public String print() {
//		return this.empno+"\t" +this.name+"\t"+ getMoneyPay()+"\t월급:(pay+bonus)/12";
//	}

	public int getBonus() {
		return bonus;
	}




	
	
	
	
}
