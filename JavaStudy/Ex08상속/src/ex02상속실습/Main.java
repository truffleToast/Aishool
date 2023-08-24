package ex02상속실습;

public class Main  {

	public static void main(String[] args) {
		Beginner b= new Beginner();
		b.level= 8;
		b.nickName= "병관이얌";
		b.Maxhp =200;
		b.Maxmp = 50;
		b.exp= 321;
		b.snailThrows();
		b.recovery();
		b.agileMovement();
		
		Warrior w= new Warrior();
		w.level=15;
		w.nickName="타락파워전사";
		w.Maxhp=800;
		w.Maxmp=100;
		w.exp=720;
		w.snailThrows();
		w.smash();
		w.rush();
		
		Wizard wi=new Wizard();
		wi.level=20;
		wi.snailThrows();
		wi.eneryBolt();
		
		
	}

}
