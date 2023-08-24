package 월급계산프로그램;
//일반 클래스는 추상메서드를 포함할 수 없으므로 추상 클래스로 바꿔주는 작업이 필요
public abstract class Employee {
	
	// : Employee클래스는 일반 클래스로 
	// 1) 추상 메서드를 포함하고 있는 클래스는 반드시 추상 클래스가 되어야 한다.
	// 2) 추상 클래스로도 일반 메서드 포함할 수 있다!
	// 3) 추상 클래스이지만 추상 메서드가 없을수도 있다.
	// + 방법: public abstract class Employee
	// 4) 추상 클래스는 객체 생성이불가능 하다
	// 개념적인 존재이기 때문에 / 공통적인 특징만을 모아놓은 추상적인 개념
	
	protected String name;
	protected String empno;
	protected int pay;
	
	
	
	
	public Employee(String name, String empno, int pay) {
		super();
		this.name = name;
		this.empno = empno;
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public String getEmpno() {
		return empno;
	}
	public int getPay() {
		return pay;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public abstract int getMoneyPay(); 
	// 실제로 rerurn 0을 상속 받는 곳은 없음 --> 추상Method임 매번 구현단이 (바디가) 바뀌는 중
	// abstract 키워드를 활용해서 일반 메서드를 추상메서드로 바꿀 수 있다.
	// 추상메서드 : 선언만 되고 바디가 없는({}) 메서드이다.

	public String print() {
		return this.empno +"\t" +this.name +"\t"+getMoneyPay(); 
	}
	

}
	


