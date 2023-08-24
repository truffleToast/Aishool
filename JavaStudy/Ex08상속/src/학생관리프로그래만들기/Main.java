package 학생관리프로그래만들기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> st_List = new ArrayList<>();
		int cnt = 0;
		while (true) {
			System.out.print("[1] 성적입력 [2]성적조회 [3]학생검색 [4] 프로그램 종료>> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.print("이름 : ");
				String name = sc.next();

				System.out.print("학번 : ");
				String number = sc.next();

				System.out.print("Java점수: ");
				int scoreJava = sc.nextInt();

				System.out.print("Web점수: ");
				int scoreWeb = sc.nextInt();

				System.out.print("Android점수: : ");
				int scoreAndroid = sc.nextInt();
				Student st = new Student(name, number, scoreJava, scoreWeb, scoreAndroid);
				st_List.add(st);
				cnt++;
			}
			if (menu == 2) {
				System.out.println("==========전체조회=========");
				if (cnt > 0) {
					System.out.println("이름\t학번\tJava\tAndroid\tWeb");
					for (int i = 0; i < st_List.size(); i++) {
						System.out.print(st_List.get(i).getName());
						System.out.print("\t");
						System.out.print(st_List.get(i).getNumber());
						System.out.print("\t");
						System.out.print(st_List.get(i).getScoreJava());
						System.out.print("\t");
						System.out.print(st_List.get(i).getScoreWeb());
						System.out.print("\t");
						System.out.print(st_List.get(i).getScoreAndroid());
						System.out.print("\t");
						System.out.println();
					}

				} else {
					System.out.println("조회할 데이터가 없습니다.");
				}
			}
			if (menu == 3) {
				if(cnt>0) {
				System.out.println("======학생을 검색합니다=======");
				System.out.print("검색할이름 입력: ");
				String Input = sc.next();
				System.out.println("===========학생검색============");
				for (int i = 0; i < st_List.size(); i++) {
					if (Input.equals(st_List.get(i).getName())) {
						System.out.print("이름");
						System.out.print("\t");
						System.out.print("학번");
						System.out.print("\t");
						System.out.print("자바");
						System.out.print("\t");
						System.out.print("웹");
						System.out.print("\t");
						System.out.print("안드로이드");
						System.out.print("\t");
						System.out.println();
						for (int j = 0; j < st_List.size(); j++) {
							System.out.print(st_List.get(j).getName());
							System.out.print("\t");
							System.out.print(st_List.get(j).getNumber());
							System.out.print("\t");
							System.out.print(st_List.get(j).getScoreJava());
							System.out.print("\t");
							System.out.print(st_List.get(j).getScoreWeb());
							System.out.print("\t");
							System.out.print(st_List.get(j).getScoreAndroid());
							System.out.print("\t");
							System.out.println();
							System.out.println("====================================");
						}
					} else {
						System.out.println("검색한 이름의 정보가 없습니다.");
						break;
					}
				}
				}
				else {
					System.out.println("학생이 입력되지 않았습니다.");
				}
			}
			if (menu == 4) {
				break;
			}
		} // while문 끝남
		sc.close();
	}

}
