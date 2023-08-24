package officeMember;

import java.util.ArrayList;

public class Controller {
	
	public void join(OfficeMemberVO vo) {
		OfficeMemberDAO dao =new OfficeMemberDAO();
		int cnt=dao.join(vo);
		if (cnt>0) {
			System.out.println("사원등록 성공");
		}
		else {
			System.out.println("사원등록 실패");
		}
}
	
	public void select() {
		OfficeMemberDAO dao=new OfficeMemberDAO();
		ArrayList<OfficeMemberVO> employeeList = dao.select();
		if(employeeList.size()> 0)
			System.out.println("================사원조회 완료================");
		else
			System.out.println("사원조회 실패");
		
		}
		
	public void search(String emp_name) {
		OfficeMemberDAO dao=new OfficeMemberDAO();
		ArrayList<OfficeMemberVO> employeeList = dao.select();
		for(int i=0;i<employeeList.size();i++) {
			if(emp_name.equals(employeeList.get(i).getEmp_Name())) {				
				System.out.print(employeeList.get(i).getEmp_No()+"\t");
				System.out.print(employeeList.get(i).getEmp_Name()+"\t");
				System.out.print(employeeList.get(i).getEmp_Hp()+"\t");
				System.out.print(employeeList.get(i).getJoin_Date()+"\t");
				System.out.print(employeeList.get(i).getGender()+"\t");
				System.out.print(employeeList.get(i).getAge());
				System.out.println();
			}
					
		}
		
	}
	
	public void delete(int Emp_Num) {
		OfficeMemberDAO dao=new OfficeMemberDAO();
		int be_Delete=dao.delete(Emp_Num);
		if (be_Delete!=0) {
			System.out.println("사원 정보가 삭제되었습니다");
		}else {
			System.out.println("삭제 실패");
		}
	}
	public void update(OfficeMemberVO vo) {
		OfficeMemberDAO dao=new OfficeMemberDAO();
		vo=new OfficeMemberVO(vo.getEmp_Hp(),vo.getEmp_No());
		int successUpdate=dao.update(vo.getEmp_Hp(),vo.getEmp_No());
		if (successUpdate!=0) {
			System.out.println("전화번호 업데이트 성공!!");
		}else {
			System.out.println("업데이트 실패 ㅠㅠ");
		}
	}
	
}


