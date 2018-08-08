package kr.co.soldesk.domain;

public class ContentDTO {
	private int cnum;
	private int unum;
	private int cate;
	private int flag;
	private String ctitle;
	private String content;
	private String tag;
	private int hits;
	private String imgfile;
	private int likes;
	private String date;
	
	public ContentDTO() {
		super();
	}
	public ContentDTO(int cnum, int unum, int cate, int flag, String ctitle, String content, String tag, int hits,
			String imgfile, int likes, String date) {
		super();
		this.cnum = cnum;
		this.unum = unum;
		this.cate = cate;
		this.flag = flag;
		this.ctitle = ctitle;
		this.content = content;
		this.tag = tag;
		this.hits = hits;
		this.imgfile = imgfile;
		this.likes = likes;
		this.date = date;
	}
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	public int getUnum() {
		return unum;
	}
	public void setUnum(int unum) {
		this.unum = unum;
	}
	public int getCate() {
		return cate;
	}
	public void setCate(int cate) {
		this.cate = cate;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getCtitle() {
		return ctitle;
	}
	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getImgfile() {
		return imgfile;
	}
	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
