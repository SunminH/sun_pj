package kr.co.soldesk.domain;

public class TagDTO {
	private int cnum;
	private String tagnm;
	
	public TagDTO() {
		super();
	}
	public TagDTO(int cnum, String tagnm) {
		super();
		this.cnum = cnum;
		this.tagnm = tagnm;
	}
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	public String getTagnm() {
		return tagnm;
	}
	public void setTagnm(String tagnm) {
		this.tagnm = tagnm;
	}
	
	
}
