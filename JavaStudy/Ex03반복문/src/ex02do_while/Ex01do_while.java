package ex02do_while;

public class Ex01do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do-while
		//while(조건) 특징 -조건을 먼저 확인한 후 true 일때만 반복 실행
		//do-while (조건) 특징- 무조건 한번은 실행한 후 조건이 true일때 반복
		
		int num =10;
		while(num>100) {
			System.out.println("야호!");
			num--;
		}
		
		do {
			System.out.println("야호!");
			num--;
		}while(num>100);

	}

}

// WHILE 계열
//num		조건		출
//130		T		야호
//129		T		야호
//128		T		야호
//.		.		.
//.		.		.
//.		.		.
//101		T		야호 // 여기까지만 실행해줌 
//100		F		X 
//99		F		X

// DO-WHILE 계열
//num		조건		출
//130		T		야호
//129		T		야호
//128		T		야호
//.		.		.
//.		.		.
//.		.		.
//101		T		야호
//100		F		야호 // 여기까지만 실행해줌 
//99		F		X