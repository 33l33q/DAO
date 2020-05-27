package bitcamp.java142.ch5.ldbjf.vo;

public class LdbMemberVO {
	public LdbMemberVO(){}
	
	private String lmem;
	private String lname;
	private String lid;
	private String lpw;
	private String lhp;
	private String lbirth;
	private String lmail;
	private String lpostnum;
	private String ljuso;
	private String ldeleteYN;
	private String linsertdate;
	private String lupdatedate;
	
	public LdbMemberVO( String lmem, 
						String lname, 
						String lid, 
						String lpw, 
						String lhp, 
						String lbirth, 
						String lmail,
						String lpostnum, 
						String ljuso, 
						String ldeleteYN, 
						String linsertdate, 
						String lupdatedate) {
		this.lmem = lmem;
		this.lname = lname;
		this.lid = lid;
		this.lpw = lpw;
		this.lhp = lhp;
		this.lbirth = lbirth;
		this.lmail = lmail;
		this.lpostnum = lpostnum;
		this.ljuso = ljuso;
		this.ldeleteYN = ldeleteYN;
		this.linsertdate = linsertdate;
		this.lupdatedate = lupdatedate;
	}
	public String getLmem() {
		return lmem;
	}
	public void setLmem(String lmem) {
		this.lmem = lmem;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getLpw() {
		return lpw;
	}
	public void setLpw(String lpw) {
		this.lpw = lpw;
	}
	public String getLhp() {
		return lhp;
	}
	public void setLhp(String lhp) {
		this.lhp = lhp;
	}
	public String getLbirth() {
		return lbirth;
	}
	public void setLbirth(String lbirth) {
		this.lbirth = lbirth;
	}
	public String getLmail() {
		return lmail;
	}
	public void setLmail(String lmail) {
		this.lmail = lmail;
	}
	public String getLpostnum() {
		return lpostnum;
	}
	public void setLpostnum(String lpostnum) {
		this.lpostnum = lpostnum;
	}
	public String getLjuso() {
		return ljuso;
	}
	public void setLjuso(String ljuso) {
		this.ljuso = ljuso;
	}
	public String getLdeleteYN() {
		return ldeleteYN;
	}
	public void setLdeleteYN(String ldeleteYN) {
		this.ldeleteYN = ldeleteYN;
	}
	public String getLinsertdate() {
		return linsertdate;
	}
	public void setLinsertdate(String linsertdate) {
		this.linsertdate = linsertdate;
	}
	public String getLupdatedate() {
		return lupdatedate;
	}
	public void setLupdatedate(String lupdatedate) {
		this.lupdatedate = lupdatedate;
	}
	
	
	
	
	
}