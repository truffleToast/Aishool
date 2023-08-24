package 보충수업;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체생성
		//박병관 짜장
//		PBKJajangmyeon pbk = new PBKJajangmyeon();
//		pbk.makeJajang();
		// 박충현 짜장
		PCHJajangmyeon pch=new PCHJajangmyeon();
		
		// 박보경 짜장
		PBGJajangmyeon pbg= new PBGJajangmyeon();
		
		// 박종권 짜장
		PJGJajangmyeon pjg =new PJGJajangmyeon();
		PDYJajangmyeon pdg= new PDYJajangmyeon();
		PBKJajangmyeon p1= pch;
		//overide 된 메소드는 사용할 수 있다. 
		PBKJajangmyeon p2=pbg;
		PBKJajangmyeon p3= pjg;
		PBKJajangmyeon p4=pdg;
		
		// 왜하는가..?
		ArrayList<PBKJajangmyeon> list =new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		for(int i=0; i<list.size();i++) {
			list.get(i).makeJajang();
		}
		PCHJajangmyeon pch2 = (PCHJajangmyeon)p2;
		pch2.makeGoonManDo();
		
	}

}
