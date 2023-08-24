package library책관리;

import java.util.ArrayList;

public class LibraryVO {

	// 제목, 저자, 가격, 번호
	private String title;
	private String author;
	private int price;
	private String num;

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getNum() {
		return num;
	}

	public LibraryVO(String title, String author, int price, String num) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.num = num;
	}
	public LibraryVO(String title) {
		this.title=title;
	}
	
	


	public void select() {
		LibraryDAO dao = new LibraryDAO();
		ArrayList<LibraryVO> bookList = dao.select(); // 테이블 데이터를 결과값
		// ArrayList<BookVO>가 결과값
		for (int i = 0; i < bookList.size(); i++) {
			System.out.print(bookList.get(i).getTitle() + "\t");
			System.out.print(bookList.get(i).getAuthor() + "\t");
			System.out.print(bookList.get(i).getPrice() + "\t");
			System.out.print(bookList.get(i).getNum() + "\t");
			System.out.println();

		}

	}

	
}
