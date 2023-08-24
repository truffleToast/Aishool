package ex03Animal;

public class Main {

	public static void main(String[] args) {
		
		Animal a1=new Animal();
		a1.name= "동물";
		a1.move();
		
		//Birds
		Bird b1=new Bird();
		b1.move();
		
		//Penguins
		Penguin p1= new Penguin();
		p1.move();
		p1.cry();
		
		
		//상속 관계에 있는 메서드를 같은 이름으로 구현하되 
		//안에 있는 로직이 다르게 작성되는 것을 보고 오버라이딩
		
		
		// 캐스팅(Casting)
		// - 기본 데이터 타입에 대한 형변환
		// - 객체의 타입에 대한형변환 -> 객체의 타입을 바꾸는 형변환
		// 단 반드시 상속의 개념이 있어야한다.
		
		//업캐스팅과 다운캐스팅
		//: 자식 클래스를 부모 클래스 타입으로 변환하는 과정
		
		//1. 묵시적 (자동) 형변환 -> 업캐스팅 개념
		// : 자식 클래스가 부모 클래스의 타입으로 변환되는 것
		// Bird b1 ----> Animal a1
		// ---> 조류는 동물이다 (o)
		Animal a2 =new Bird();
		
		//Animal breathe, cry, move, name , gender
		
		//Bird move(날아다닌다), egg(알을 낳다)
		
		
		//Bird는 Animal을 상속받으므로 a2를 Bird로 바꾸어 사용할 수 있다.
		//a2는 Animal 자료형 = Bird 자료형을 대입
		System.out.println();
		System.out.println("형변환");
		a2.cry();
		a2.move();
		// a2.egg(); 사용불가
		// 자식만 가지고 있는 메서드는 사용불가하나 
		// animal로 부터 물려받아 §오버라이딩§한 move가 사용된다. 
		
		//2)명시적(강제) 형변환 -> 다운캐스팅 개념
		// : 부모 클래스가 자식 클래스로 타입이 변형되는것 
		//+ (업캐스팅 되었던 레퍼런스 변수만 다운 캐스팅 가능)
		 // Bird b2 = new Animal(); 불가
		 // cannot convert: miss match
		 // animal을 bird로 형변환하는 것은 일반적으로 불가능하다.
		 // 부모 클래스를 자식 클래스 타입으로 변환하는것
		 // 단, 다운캐스팅은 업캐스팅 된적이 있던 것만 가능하다 여기서는 a2만 가능 
		 // Animal a2=new Bird;
		 
		Bird b2= (Bird)a2;
		
		
		
		

	}

}
