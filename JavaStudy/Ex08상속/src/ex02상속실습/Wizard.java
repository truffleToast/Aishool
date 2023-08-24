package ex02상속실습;

public class Wizard extends Beginner {
	int level; // 레벨
	String nickName; //닉네임
	int Maxhp; //체력
	int Maxmp; // 마나
	int exp; // 경험치
	int money; // 돈
	
	
	// 전사기능
	// 마법사
	
	public void snailThrows() {
		System.out.println("달팽이 던지기 얍얍얍!");
	}
	public void recovery() {
		System.out.println("회복...");
	}
	public void agileMovement() {
		System.out.println("민첩한 몸놀림!");
		
	}
	
	public void eneryBolt() {
		System.out.println("에너지 볼트");
	}

}
