package ex06ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02뮤직플레이어 {

	public static void main(String[] args) {
		// 노래 리스트가 저장될 ArrayList
		// "가수이름- 노래제목" :String
		// 입력하는 도구 가져오기
		//사용자에게 보여지는 화면 구현!
		// 숫자 입력받기 : select
		// select가 어떤 숫자인지 판단
		// 단 , 1~4가 아닌 다른 숫자를 입력하면 "잘못입력하셨습니다"
		// 4를 입력하면 종료
		// 1--> arrayList에 데이터가 있으면 재생목록을 보여주기
		// 데이터가 없으면 재생목록이 없습니다.
		// 2--> 마지막 위치에 추가: 추가할 노래 입력
		//  	원하는 위치에 추가: 추가할 노래 입력 ,추가할 위치 입력
		Scanner sc =new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<>();
		while(true) {
			System.out.println("[1]노래조회 [2]노래추가 [3]노래삭제 [4)종료 >>");
			int select=sc.nextInt();
			if (select==1) {
				showMusicList(musicList);
			}
			else if(select==2) {
				addMusicList(sc,musicList);
			}
			else if(select==3) {
				deleteMusicList(sc,musicList);
			}else if(select==4) {
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			}
		sc.close();
		}
	
		

	public static void showMusicList(ArrayList<String> musicList) {
		if(musicList.size()>0) {
			for(int i=0; i<musicList.size();i++) {
				System.out.print(musicList.get(i));
			}
		}else if(musicList.size()==0){
			System.out.println("재생목록이없습니다.");
		}else {	
		}
				
	}

	public static void addMusicList(Scanner sc,ArrayList<String> musicList) {
		System.out.print("1. 마지막위치에 추가 2. 원하는 위치에 추가 >> ");
		int num=sc.nextInt();
		switch (num){
		case 1:
			System.out.println("노래-가수와 노래제목을 입력해주세요");
			String music = sc.next();
			musicList.add(music);
			break;
		case 2:
			System.out.println("노래-가수와 어디에 저장할지 입력해주세요");
			String music1 = sc.next();
			int location = sc.nextInt(); 
			if ((location-1)<musicList.size()) {
				musicList.add(location-1,music1);
			}
			else {
				System.out.println("가장 마지막에 추가하겠습니다.");
				musicList.add(music1);
			}
			break;
		default:
			System.out.println("잘못입력했습니다.");
		}
		sc.close();
	}
	
	public static void deleteMusicList(Scanner sc,ArrayList<String> musicList) {
		System.out.println("현재 재생목록입니다.");
		if(musicList.size()==0){
		System.out.println("재생목록이 없습니다.");
		}
		else {
			for(int i=0;i<musicList.size();i++){
				System.out.print(musicList.get(i));
				System.out.println();
			}
		}
		System.out.println("삭제할 번호를 알려주세요");
		int delnum=sc.nextInt();
		if(delnum-1<musicList.size()) {
		musicList.remove(delnum-1);
		}
		sc.close();
	}
	
	
		
}
		


