package 월급계산프로그램;

public class TempEmployee extends Employee {
	
	public TempEmployee(String empno, String name, int pay) {
	super(empno, name, pay);
//	this.name=name;
//	this.empno=empno;
//	this.pay=pay;
	}
	@Override
	public int getMoneyPay() {
		return pay/12;
	}
//	public String print() {
//	return this.empno+"\t"+this.name+"\t"+getMoneyPay()+"\t월급:pay/12";
//		}
}
