package 월급계산프로그램;

public class PartTimeEmployee extends Employee{
	protected int workDay;
	

	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
//		this.empno=empno;
//		this.name=name;
//		this.pay=pay;
		
		this.workDay=workDay;
		
	}
	@Override
	public int getMoneyPay() {
		return pay*workDay;
	}
//	public String print() {
//		return this.empno +"\t" +this.name +"\t"+getMoneyPay()+"\t월급:pay*workday"; 
//	}




	
	
	
		
	

}
