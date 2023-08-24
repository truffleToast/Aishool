package 인터페이스;

public interface PokeMon {
	
	//나는 포켓몬 게임을 만드는 개발자
	//내가 만드는 게임에 들어있는 모든 캐릭터들은 
	// 공격과 특수공격을 할 수 있어야한다.
	
	//인터페이스
	// 프로젝트 지침서, 설계도
	
	// 1) 필드
	// String name;
	// final이라는 키워드를 활용하여 상수로 적어야함
	// final String name ="김김김";

	
	// 2) 메서드
	// 단 메서드는 반드시 선언만 되어있어야 한다 -> Abstract 메서드
	// 인터페이스는 반드시 추상메서드만 포함 가능
	
	// 일반공격: atk
	public abstract void atk();
	
	//특수공격: specialAtk
	public abstract void specialAtk();
	

}
