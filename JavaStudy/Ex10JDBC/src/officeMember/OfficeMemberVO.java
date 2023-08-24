package officeMember;

import java.util.ArrayList;

public class OfficeMemberVO {
	
	private int emp_No;
	private String emp_Name;
	private int emp_Hp;
	private int join_Date;
	private String gender;
	private int age;
	public int getEmp_No() {
		return emp_No;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	
	public int getEmp_Hp() {
		return emp_Hp;
	}
	public int getJoin_Date() {
		return join_Date;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public OfficeMemberVO(int emp_No, String emp_Name,  int emp_Hp, int join_Date, String gender, int age) {
		super();
		this.emp_No = emp_No;
		this.emp_Name = emp_Name;
		
		this.emp_Hp = emp_Hp;
		this.join_Date = join_Date;
		this.gender = gender;
		this.age = age;
	}
	
	public OfficeMemberVO(String emp_Name) {
		this.emp_Name=emp_Name;
	}
	
	public OfficeMemberVO() {
		// TODO Auto-generated constructor stub
	}
	public OfficeMemberVO(int emp_No, int emp_Hp) {
		this.emp_No=emp_No;
		this.emp_Hp=emp_Hp;
		// TODO Auto-generated constructor stub
	}
	public void select() {
		OfficeMemberDAO dao=new OfficeMemberDAO();
		ArrayList<OfficeMemberVO> employeeList=dao.select();
		for(int i=0;i<employeeList.size();i++) {
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
