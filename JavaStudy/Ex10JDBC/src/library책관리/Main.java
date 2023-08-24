package library책관리;

import java.util.Scanner;

public class Main {
// 도서관리 프로그램을 담당하는 ui MVC중 M
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 도서등록\t 2. 도서조회\t 3. 도서검색\t 4.종료 >>  ");
			int select=sc.nextInt();
			if(select==1) {
				//도서등록
				System.out.println("도서등록을 선택했습니다.");
				System.out.print("책 제목: ");
				String bookName=sc.next();
				System.out.print("책 저자: ");
				String bookAuthor=sc.next();
				System.out.print("책 가격: ");
				int bookPrice=sc.nextInt();
				System.out.print("책 번호: ");
				String bookNum=sc.next();
				LibraryVO vo=new LibraryVO(bookName, bookAuthor, bookPrice, bookNum);
				Controller con =new Controller();
				con.insert(vo);
			}
			else if(select==2) {
				//도서조회
				System.out.println("도서조회를 선택했습니다.");
				System.out.println("도서등록 페이지");
				Controller con =new Controller();
				con.select();
				
			}
			else if(select==3) {
				//도서검색
				System.out.println("도서검색을 선택했습니다.");
				System.out.println("도서등록 페이지");
				// 타이틀을 기준으로 검색해 주세요
				System.out.print("검색하고 싶은 책 이름을 적어주세요 >> ");
				String bookTitle= sc.next();
				LibraryVO vo=new LibraryVO(bookTitle);
				Controller con=new Controller();
				con.search(vo);
				
				
				
			}
			else if(select==4) {
				System.out.println("프로그램을 종료합니다");
				break;
				
			}
			else {
				System.out.println("다시입력해주세요");
				
			}
		}
		sc.close();
	}

}
