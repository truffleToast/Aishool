package ex03Animal;

public class Bird extends Animal {
	
	//조류는 동물이 가진 기능들을 다 가질수 있다.!
	//조류의 설계도
	// 조류도 울고 , 움직이고, 숨쉬고 , 이름, 성별도 있음
	
	// 동물이 위에있는 데이터, 기능을 이미 다 가지고 있음
	// 상속에서 사용되는 키워드 : extends(확장하다)
	public void egg() {
		System.out.println("알을 낳음");
	}

	@Override //어노테이션
	public void move() {
		System.out.println("날아다닌다.");
		
	}
	
	
	
	
	
	
	
}
