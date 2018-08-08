package kr.co.soldesk.domain;

public class UserDTO {
	private int unum;
	private String pw;
	private String name;
	private String regdate;
	private String nicnm;
	private String email;
	private String phone;
	private String profil;
	private String pinfo;
	private String id;
	public UserDTO(int unum, String pw, String name, String regdate, String nicnm, String email, String phone,
			String profil, String pinfo, String id) {
		super();
		this.unum = unum;
		this.pw = pw;
		this.name = name;
		this.regdate = regdate;
		this.nicnm = nicnm;
		this.email = email;
		this.phone = phone;
		this.profil = profil;
		this.pinfo = pinfo;
		this.id = id;
	}
	public UserDTO() {
		super();
	}
	public int getUnum() {
		return unum;
	}
	public void setUnum(int unum) {
		this.unum = unum;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getNicnm() {
		return nicnm;
	}
	public void setNicnm(String nicnm) {
		this.nicnm = nicnm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	public String getPinfo() {
		return pinfo;
	}
	public void setPinfo(String pinfo) {
		this.pinfo = pinfo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
