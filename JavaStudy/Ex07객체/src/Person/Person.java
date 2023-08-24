package Person;

public class Person {
	
	// 사람에 대한 설계도: Class
	
	//1. Field(필드)
	// 객체가 가질수 있는 공통적인 속성, 데이터, 변수
	String name; //이름
	String gender; // 성별
	int age; //나이
	int height; //키
	String address;
	//2. Method(메서드)
	//: 객체가 할수 있는 행위 행동 기능
	
	//숨쉬기
	public void breathe() {
		System.out.println("나는 숨을 쉬는중");
	}
	//잠자기
	public void sleep() {
		System.out.println("쿨쿨 잠을 자는중");
	}
	public void eat() {
		System.out.println("우걱우걱 밥을 먹는 중");
	}
	//설계도를 만들기 위해서 class를 만들면, 그 안에  자동으로
	// 생성자가 만들어진다.
//	public Person() {
//		//기본 생성자의 모양
//	}
	// 기본 생성자 말고, 객체를 선언과 동시에 초기화를 시켜주는
	// 새로운 생성자를 만들어보자!
	
//	*생성자의 특징
//	1) 생성자의 메서드
//	2) 생성자의 이름(메서드 명) 클래스의 이름과 같아야한다(대소문자 주의!!)
//	3) 클래스를 만들때 기본 생성자는 생략이 되어 있다.
//	4) 새로운 생성자를 만들면 생략되어 있는 기본 생성자는 사용할 수 없다.
//  +기본생성자도 사용하고 싶다면 눈에 보이게 코드로 작성해야한다.
	public Person(){
		this.name="조조조";
	}
	public Person(String name, int age, String gender, int height, String address){
//			main에서 보내온 전달인자를 매개변수로 받아서
//			현재 클래스에 있는 필드를 받아온 값으로 초기화
//			this : 현재 클래스를 지칭하는 키워드
			this.name= name;
			this.age=age;
			this.gender=gender;
			this.height=height;
			this.address=address;
	}
	public Person(String name,int age, String gender, int height) {
			this.name=name;
			this.age=age;
			this.gender=gender;
			this.height=height;
	}
// 오버로딩 : 중복정의
}
// 전달인자
	

