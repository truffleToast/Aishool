package 일차원배열;

public class Ex01배열기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열: 같은 타입의 데이터를 관리하기 위해 사용하는 구조
		
		// 1. 인덱스로 이루어진 자료구조
		// 2. 순차적 접근이 가능한 자료구조
		
		// 학생 3명의 이름을 저장하자
		
//		String stu1 = "자자자";
//		String stu2 = "조조조";
//		String stu3 = "박박박";
//		
//		for(int i = 1 ; i<=3 ; i++) {
//			System.out.println(stu+i);
		//오류가발생하는 구문식임. 이유 stu라는 값에 +i를 연산할 수 없음.
//		}

		
//		이름이라는 같은 데이터 타입의 데이터를 하나로 관리할 수 있는 배열
//		1. 배열을 선언하는 방법
//		자료형[] 배열명 = new 자료형[n];
//		배열은 선언 및 생성을 할때 크기가 정해져 있다.!
//		뒤쪽에서 크기를 변경할 수 없다.
		
		String[] stu = new String[3];
		System.out.println(stu);
		stu[0] ="자자자";
		stu[1] ="박박박";
		stu[2] ="조조조";
		System.out.println(stu[1]);
		System.out.println("배열의 크기: "+stu.length);
//		stu[3]="조충현";
		
		// + 오류
		// syntax error : 빨간줄 (문법적오류)
		// Exception : 실행을 시켜야 확인 할 수 있는 오류
		
		// 인덱스 값을 사용하여 3명의 이름을 for문을 사용해서 출력
		
		for(int i=0; i<stu.length ; i++) {
			System.out.print(stu[i]+" ");
		}
		// 또는 i<3 
		// 또는 배열의 크기 : 배열명.length
		//stu.length---> 3
		//인덱스 값에 접근하여 0~ n-1까지 접근, 배열의 크기는 n
 		
		
		//자료형[] 배열명 = new 자료형[3];
		//배열을 만드는 두번째 방법2
		String[] 사무실 = {"김김김", "박박박", "송송송", "조조조"};
		// String 배열이고 , 4의크기를 가진다.
		/* 배열을 만드는 2번째 방법도 크기 변경은 불가능, 바꾸고자 할땐
		 * 바꾸고 싶다면 선언 및 초기화 하는 곳에 와서 변경해야 한다.
		 * 안에 있는 데이터는 초기화 된다.
		 */
		
		for(int i=0 ; i<사무실.length; i++) {
			// i: 0 1 2 3 4 5
			System.out.println(사무실[i]);
		}
		
		
		
		
		
		
	}

}
