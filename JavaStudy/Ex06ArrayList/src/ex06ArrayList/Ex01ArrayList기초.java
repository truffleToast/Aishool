package ex06ArrayList;

import java.util.ArrayList;

public class Ex01ArrayList기초 {

	public static void main(String[] args) {
		
		
		//Object :상속
		//Object로 데이터를 받아서 String으로 자동 형변환 하는중...
		
		//1. ArrayList 선언 및 초기화
		ArrayList<String> name =new ArrayList<>();
// 		import 단축기 : ctrl + shift +o
//		<>:제네릭
//		레퍼런스형 변수만 들어올 수 있다.
//		String name= "김김김";
//		String name = new String("김김김");
//		int ---> Integer
//		float ---> Float
//		double ---> Double
// 		2. 데이터 추가하기 name.add()
//		1) add (데이터값)
		name.add("김김김");
		name.add("송송송");
		name.add("박박박");
//		2)add(인덱스 값, 데이터 값)
		name.add(1,"호호호");
		//get(index) 
		name.get(1);// 출력 기능이 없으므로 
		System.out.println(name.get(1)); 
		
//		+ for문을 사용해서 name에 전체 데이터를 꺼내보자
		for(int i=0; i<name.size(); i++) {
			System.out.print(name.get(i)+ " ");
		}
		System.out.println();
//		 4. 데이터를 삭제하자
//		 1) 선택해서 삭제
		name.remove(2);
		System.out.println(name.size());//3
		System.out.println(name.get(2));
//		전체 삭제
		name.clear();
		System.out.println(name.size());
		
		
	

	}

}
