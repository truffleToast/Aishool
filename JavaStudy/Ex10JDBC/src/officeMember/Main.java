package officeMember;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사원들을 검색하는 테이블을 만들어보자 
		
		// 1. 사원추가 2. 사원 전체조회 3. 사원 검색 4. 사원삭제 5. 사원정보 변경 6. 프로그램 종료
		System.out.println("OO회사 사원정보 프로그램입니다.");
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			System.out.println("숫자를 입력해주세요");
			System.out.print("1. 사원추가 2. 사원 전체조회 3. 사원 검색 4. 사원삭제 5. 사원정보 변경 6. 프로그램 종료 >>  ");
			int menu=sc.nextInt();
			
			if(menu==1) {
				System.out.println("사원추가를 선택하였습니다.");
				System.out.println("사원의 정보를 입력해주세요");
				System.out.println("입력할 데이터: 사원번호, 이름, 전화번호(숫자), 입사일자(숫자), 성별, 나이(숫자)");
				int emp_No=sc.nextInt();
				String emp_Name=sc.next();
				int emp_Hp=sc.nextInt();
				int join_Date=sc.nextInt();
				String gender=sc.next();
				int age=sc.nextInt();
				OfficeMemberVO vo =new OfficeMemberVO(emp_No,emp_Name,emp_Hp,join_Date,gender,age);
				Controller con=new Controller();
				con.join(vo);
			}
			else if(menu==2) {
				System.out.println("사원 전체조회를 선택하셨습니다.");
				//ResultSet, connection , psmt가 필요-->이건 dao나 vo에서 작업 아마도 dao가 될것
				System.out.println("===============사원전체조회 화면입니다.================");
				System.out.println("사번\t사원이름\t전화번호\t\t입사일\t 성별\t 나이");
				Controller con=new Controller();
				OfficeMemberVO vo=new OfficeMemberVO();
				vo.select();
				con.select();
				System.out.println("조회가 완료되었습니다.");
				
			}
			else if (menu==3) {
				System.out.println("사원 검색을 선택하였습니다.");
				//2번과 마찬가지 
				System.out.println("조회할 사원을 입력해주세요");
				String emp_name=sc.next();
				Controller con=new Controller();
				con.search(emp_name);
			}
			else if(menu==4) {
				System.out.println("사원삭제를 선택했습니다.");
				//4번, 삭제 
				System.out.println("=============사원 삭제 화면입니다.=================");
				// 사번을 보여줘야 삭제가 용이할것. select에서 사용한것을 보여주자. // 검색을 통해서 이름을 입력하고 거기서 삭제하면 더 좋을듯
				System.out.println("사번\t사원이름\t전화번호\t\t입사일\t 성별\t 나이");
				Controller con=new Controller();
				OfficeMemberVO vo=new OfficeMemberVO();
				vo.select();
				con.select();
				System.out.println("조회가 완료되었습니다.");
				// 여기까지 입력하면 검색 다음부터는 삭제 페이지로 넘어가기
				System.out.println("삭제할 사원의 사번을 입력해주세요"); // sql에서 사번을 PrimaryKey로 입력하였기 때문에 중복되는 사번은 없음.
				int emp_num=sc.nextInt();
				con.delete(emp_num); // delete를 하기 위해선 DAO에 사전 작업이 필요
			}
			else if(menu==5) {
				System.out.println("사원정보(전화번호)를 변경합니다.");
				System.out.println("================사원 정보 변경 화면입니다.================");
				System.out.println("사번\t사원이름\t전화번호\t\t입사일\t 성별\t 나이");
				Controller con=new Controller();
				OfficeMemberVO vo=new OfficeMemberVO();
				vo.select();
				con.select();
				System.out.println("조회가 완료되었습니다.");				
				// 여기서부터 이제 바꾸는 작업
				System.out.println("바꿀 사원의 사원번호를 입력해주세요");
				int emp_No=sc.nextInt();
				System.out.println("입력되었습니다.");
				System.out.println("전화번호를 입력해주세요");
				int emp_Hp=sc.nextInt();
				System.out.println("입력되었습니다.");
				vo=new OfficeMemberVO(emp_No,emp_Hp);
				con.update(vo);
				System.out.println("업데이트 화면이 끝났습니다.");
				
				
			}
			else if (menu==6) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else {
				System.out.println("다시 입력해주세요");
			}
		
			
		}
		sc.close();
		
	

	}

}
