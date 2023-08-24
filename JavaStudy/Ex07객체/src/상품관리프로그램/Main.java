package 상품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> productList = new ArrayList<>(); // ArrayList만들기

		// 객체 배열에 입력
		Scanner sc = new Scanner(System.in);
		String p_Name;
		int p_UnitPrice;
		int p_Amount;
		while (true) {
			System.out.print("[1] 물건추가 [2] 예상 판매량 조회 [3] 종료");
			int userSelect = sc.nextInt();
			if (userSelect == 1) {
				System.out.println("판매물품의 이름과 가격, 수량을 순서대로 입력합니다.");
				System.out.print("물건 이름: ");
				p_Name = sc.next();
				System.out.print("단가: ");
				p_UnitPrice = sc.nextInt();
				System.out.print("수량: ");
				p_Amount = sc.nextInt();
				Product p1 = new Product(p_Name, p_UnitPrice, p_Amount);
				productList.add(p1);

			} else if (userSelect == 2) {
				if(productList.size()==0) {
					System.out.println("등록된 상품이 없습니다.");
				}
				int sum=0;
				for (int j = 0; j < productList.size(); j++) {
				
					System.out.println("판매 물품:\t"+productList.get(j).getName()+" 판매가격:\t"
							+ productList.get(j).getUnitPrice() + " 판매량:\t" + productList.get(j).getAmount());
					System.out.println(productList.get(j).getName() + "의 판매 대금은:\t"
							+ productList.get(j).getUnitPrice() * productList.get(j).getAmount());
					System.out.println();
					sum+=productList.get(j).getUnitPrice() * productList.get(j).getAmount();
					}
				System.out.println("총 판매 금액은 : "+ sum+"원");
			} else {
				System.out.println("시스템을 종료합니다");
				break;
			}
		}
		sc.close();

	}

}
