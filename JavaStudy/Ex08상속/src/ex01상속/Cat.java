package ex01상속;

//상속을 할때에는
//class명 옆에 extends라는 키워드 사용
public class Cat extends Animal{ 
	//extends : 확장하다.
	//person은 animal이 갖고 있는 것을 가지되 아닌것도 잇을 수 있다. -> 따로 만들어주기
	//다중 상속을 지원하지는 않는다.
	//final
	
	public void gromming() {
		System.out.println("구르르릉");
	}
 
}
 