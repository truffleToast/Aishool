package 상품관리프로그램;


// 생성자 : 객체를 생성하는 역할
// 객체를 생성할 때 반드시 한 번만 호출된다
// 생성자를 만들지 않아도 사용할 수 있다 -> 기본생성자의 



public class Product {
	
	private String name; 	// 물건이름
	private int unitPrice;  // 단가
	private int amount;     // 수량
	
	public Product(String name, int unitPrice, int amount) {
		this.name=name;
		this.unitPrice=unitPrice;
		this.amount=amount;
	}
	
	public String getName() {
		return name;
	}
		
	public int getUnitPrice() {
		return unitPrice;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice=unitPrice;
	}
	public void setAmount(int amount) {
		this.amount=amount;
	}

		
	
	
	
}
