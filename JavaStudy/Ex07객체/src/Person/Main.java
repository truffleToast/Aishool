package Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Class가 실행되는 공간
		//설계도를 사용해서 Object(객체)를 만드는 공간
		//설계도의 이름 변수명 =new 설계도의 이름();
		Person p1
		=new Person("김김김",20,"M",180,"광주");
		//(): 생성자!
		//. : 참조하다.
		
//		p1.name="김김김";
//		p1.age=20;
//		p1.gender="M";
//		p1.height=180;
		System.out.println("이름: " +p1.name);
		System.out.println("나이: " +p1.age);
		System.out.println("성별: " +p1.gender);
		System.out.println("키: " +p1.height);
		//초록색은 method
		p1.breathe();
		p1.eat();
		p1.sleep();
		
		//설계도를 하나 만들어 놓으면 여러개의 객체를 생성할 수있다.
		//Person을 사용해서 p2
		//짝꿍의 이름, 나이 ,성별, 키 , 거주지
		Person p2 =new Person();
		
		p2.age=27;
		p2.gender="M";
		p2.height=190;
		p2.address="광주"	;
//		System.out.println("이름: " +p2.name);
//		System.out.println("나이: " +p2.age);
//		System.out.println("성별: " +p2.gender);
//		System.out.println("키: " +p2.height);
//		System.out.println("거주지: " +p2.address);
//		
//		System.out.println(p1);
//		System.out.println(p2);
		
//		메모리 영역 : heap과 static
//		static : 정적인 memory 영역
//		int num= 4byte; 4byte값을 넘어가는 순간 입력이 되지 않는다.
//		
//		heap: 동적인 memory 영역
//		//p1은 레퍼런스 변수
		// 동적메모리에 들어간다.
//
//
//		
		Person p3 =new Person("조조조",20,"남자",170);
		System.out.println(p3.age);
		
		
		
	}

}
