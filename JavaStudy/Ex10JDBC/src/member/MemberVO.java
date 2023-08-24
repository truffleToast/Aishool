package member;

public class MemberVO {
	private String iD;
	private String passWord;
	private String nickName;
	public String getiD() {
		return iD;
	}
	public String getPassWord() {
		return passWord;
	}
	public String getNickName() {
		return nickName;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public MemberVO(String iD, String passWord, String nickName) {
		super();
		this.iD = iD;
		this.passWord = passWord;
		this.nickName = nickName;
	}
	
	
	
}
