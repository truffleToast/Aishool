package ex01상속;

public class Main extends Object{

	public static void main(String[] args) {
		
		
		/*
		 * 상속은 -> 부모클래스의 코드를 자식 클래스에서 물려받아 사용하는 것
		 * 프로그래밍에서는 상속을 단순히 물려받는거에 그치는게 아니라
		 * 물려받은 후 자식클래스에 특성에 맞게 확장시키는 개념으로 생각한다
		 * 
		 * 자바의 상속을 할때는 extends라고 하며
		 * 부모클래스를 Super Class 
		 * 자식클래스를 Sub Class라고 부른다.
		 * 
		 * 상속의 특징 1. 동시에 두개이상의 상속을 받을 수 없다.
		 * 2. 상속을 여러번 해주는 것은 상관없다. a<-b<-c<-d<-e<-f
		 * 3. 모든 클래스는 최상위 부모로 Object 클래스르 가지게 된다.
		 * 
		 * private이라는 접근 제한자를 활용했을 때 클래스에 대한 접근이 불가하므로 상속을 받지 못한다.
		 * 클래스명 앞에 final이라고 적혀잇으면 이 클래스는 최종수정이 되면 안되는 클래스를 의미
		 * 상속이 불가능하다. 
		 * 
		 * Overloading 중복 정의  
		 * Overwriting 재정의
		 */
		
		
		
		
		Animal a=new Animal();
		a.swimming();
		Cat c =new Cat();
		c.swimming();
		c.gromming();
		
		
		
	}

}
