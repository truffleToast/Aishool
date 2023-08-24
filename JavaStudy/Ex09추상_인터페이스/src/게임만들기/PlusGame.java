package 게임만들기;

import java.util.Random;


public class PlusGame implements GameRule{
  // 문제에서 풀기 위해 생성자를 만들기 
	int num1;
	int num2;
	
	
	public boolean isCheckLife(int life) {
		if (life>0) {
		return true;
	} 
		return false;
	}// Life를 체크하는 메서드 // 목숨이 0개가되면 게임이 끝나야 한다.
	
	@Override
	public int random() {
		Random rd= new Random();
		int num =rd.nextInt(10)+1;
		return num;
	}// random을 불러오는 메서드
	
	@Override
	public String getQuizMsg() {
		num1= random();
		num2= random();
		return num1  +" + " + num2  +" =  ?"; //문제출제
	}//Quiz를 출력하는 메서드
	@Override
	public boolean checkAnswer(int ans) {
		
		if (ans== num1+num2) {
			return true;
		}else {
			return false;
		}// 맞는지 확인하는 메서드
		
	}
	
}