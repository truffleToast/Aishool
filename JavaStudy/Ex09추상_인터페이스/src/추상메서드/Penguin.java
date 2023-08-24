package 추상메서드;

public class Penguin extends 조류 {
	
	
	// abstrarct 클래스를 상속받으면 
	// 그 안에 있는 abstract 메서드를 
	// 반드시 자식 클래스에서 구현해줘야 한다.
	// 구현하기 싫으면 자식 클래스도 abstract 클래스가 되야 함
	
	//+ 이전과는 다르게 구현을 강제화

	@Override
	public void crying() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	// 추상의 개념
	// 추상화: 상속 계층도를 올라갈수록 심화되고
	// 구체화: 상속 계층도를 내려갈수록 심화된다.
	
	//추상클래스 vs 추상메서드
	
//	 public abstract int getMoeyPay()
//	 -> body가 없어도 되는 메서드가 된다.
//	 1) 추상 메서드를 포함하고 있는 클래스는 반드시 추상클래스가 되어야한다.
//	 public abstract class 조류
//	 2) 추상 클래스는 일반 메서드를 포함할 수 있는가? --> 있다.
//			 3) 추상 클래스는 추상 메서드가 없어도 되는가 --> 된다.
// 	 4) 메서드가 선언되어있으나 완성이 되지 안된 기능
//	 abstract class는 불안정한 상태이므로 반드시 처리해야 한다.
	 
	
	
	
	
	
	

	
	
	
	
	
	
}
