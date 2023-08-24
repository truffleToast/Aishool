package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("사번\t\t이름\t월급");
		
		//ParttimeEmployee
		PartTimeEmployee pt1 = new PartTimeEmployee("SMHRD003","김장독", 10 , 10 ); // pay는 오버로딩 됫음, 그래서 일당으로 입력해야함.
		System.out.println(pt1.print());
		
		//TempEmployee
		TempEmployee te1= new TempEmployee("SMHRD001","박문수",3000);
		System.out.println(te1.print());
		//RegularEmployee
		RegularEmployee re1=new RegularEmployee("SMHRD002", "홍길동", 4000, 400); 
		System.out.println(re1.print());
		
		//Employee emp=new Employee("SMHRD004","조조조",500);
		
		
	}
}


