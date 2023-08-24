package ex04switch;

import java.util.Scanner;

public class Ex04최종조건문실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
	      
	      System.out.println("금액을 입력하세요.");
	      int inputMoney = sc.nextInt();
	      
	      System.out.println("메뉴를 고르세요");
	      System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500) >> ");
	      int menu = sc.nextInt();
	      
	      // 잔돈이 저장될 변수
	      int changeMoney = 0;
	      
	      if(menu == 1) {
	         
	         if(inputMoney >= 800) {
	            changeMoney = inputMoney - 800;
	         }else {
	            changeMoney = inputMoney;
	            System.out.println("돈이 부족해요ㅠㅠ");
	         }
	         
	      }else if(menu == 2) {

	         if(inputMoney >= 500) {
	            changeMoney = inputMoney - 500;
	         }else {
	            changeMoney = inputMoney;
	            System.out.println("돈이 부족해요ㅠㅠ");
	         }
	         
	      }else if(menu == 3) {
	         
	         if(inputMoney >= 1500) {
	            changeMoney = inputMoney - 1500;
	         }else {
	            changeMoney = inputMoney;
	            System.out.println("돈이 부족해요ㅠㅠ");
	         }
	         
	      }
	      
	      System.out.println("잔돈 : " + changeMoney + "원");
	      int k = changeMoney / 1000;
	      int f = changeMoney % 1000 / 500;
	      int h = changeMoney % 1000 % 500 / 100;
	      System.out.println("잔돈은 : 천원 " + k +"개 오백원: "+ f + "개 백원: "+ h+ "개 입니다.");
	      

	sc.close();	
	}
	
}


//		int menu =sc.nextInt();
//		switch (menu) {
//		case 1: 
//			System.out.println("콜라를 선택하셨습니다." + "넣으신 돈은 " + money +"입니다" );
//			System.out.println("잔돈: "+ (money-800)+ "원");
//		break;
//		case 2: 
//			System.out.println("생수를 선택하셨습니다.." + "넣으신 돈은 " + money +"입니다" );
//			System.out.println("잔돈: "+ (money - 500)+ "원");
//		break;
//		case 3: 
//			System.out.println("콜라를 선택하셨습니다." + "넣으신 돈은 " + money +"입니다" );
//			System.out.println("잔돈: "+ (money - 1500)+ "원");
//		break;
//		default:
//			System.out.println("없는 메뉴입니다. 다시 선택해주세요");						