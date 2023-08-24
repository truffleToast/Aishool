package 책관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 객체 배열
		// vo --> value object;
		// 사람
		// 이름 String, 나이 int, 성별 char

		// 자료형[] 레퍼런스 변수명 = new 자료형[배열의 크기];

		// BookData 자료형을 가진 변수들만 저장할 수 있다.
		BookData[] bookList = new BookData[5];

		BookData b1 = new BookData("Java", 21000, "홍길동");
		BookData b2 = new BookData("Python", 41000, "길길동");
		BookData b3 = new BookData("Spring", 51000, "홍홍동");
		BookData b4 = new BookData("C++", 31000, "홍홍홍");
		BookData b5 = new BookData("SQLD", 11000, "동동동");
		// 객체 배열에 값을 대입
		bookList[0] = b1;
		bookList[1] = b2;
		bookList[2] = b3;
		bookList[3] = b4;
		bookList[4] = b5;
		// 각각의 인덱스 값으로 이루어져 잇다.

		// BookData b1 = new BookData();

		// --> BookData[] bookList= new BookData[5];

		System.out.println(b1);
		// b1에 대한 타이틀 ,price , writer가 저장되어 잇는 주소값
		// bookList[0]==b1
		// b1.getTitle()
		// bookList[0].getTitle()
		// System.out.println(bookList[0].getTitle());
		Scanner sc = new Scanner(System.in);
		System.out.print("돈을 입력해주세요: ");
		int price = sc.nextInt();
		for (int i = 0; i < bookList.length; i++) {
			if (price >= bookList[i].getPrice()) {
				System.out.println(bookList[i].getTitle() + " " + bookList[i].getPrice() + " " + bookList[i].getWriter()+" ]");
			}
		}
		sc.close();

	}

}
