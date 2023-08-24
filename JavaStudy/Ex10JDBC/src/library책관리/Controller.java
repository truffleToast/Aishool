package library책관리;

import java.util.ArrayList;

public class Controller {

	// View랑 Model(DAO) 소통할 수 잇는 중간다리

	// 도서등록: Main에서 보내준 vo를 받아서 DAO로 보내주는 역할

	public void insert(LibraryVO vo) {
		LibraryDAO dao = new LibraryDAO();
		int row = dao.insert(vo);
		if (row > 0) {
			System.out.println("도서등록 성공");
		} else {
			System.out.println("도서등록 실패");
		}
	}

	public void select() {
		LibraryDAO dao = new LibraryDAO();
		ArrayList<LibraryVO> libraryList = dao.select(); // 테이블 데이터를 결과값

		if (libraryList.size() > 0)
			System.out.println("==============도서조회 완료===============");
		else
			System.out.println("도서조회 실패");
	}

	public void search(LibraryVO vo) {
		LibraryDAO dao=new LibraryDAO();
		vo=dao.search(vo);
		
		System.out.println(vo.getTitle());
		
	}
		

//		if (Result!=null) {
//			System.out.println("도서검색 완료");
//			
//		}else {
//			System.out.println("도서검색 실패");
//		}

}
