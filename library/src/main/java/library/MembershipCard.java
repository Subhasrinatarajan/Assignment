package library;

public class MembershipCard {

	private String memcardid;
	private String memname;
	private String email;
	private String phoneno;
	private String membershipbookno;

	public MembershipCard() {

	}

	public MembershipCard(String memcardid, String memname, String email, String phoneno, String membershipbookno) {
		this.memcardid = memcardid;
		this.memname = memname;
		this.email = email;
		this.phoneno = phoneno;
		this.membershipbookno = membershipbookno;
	}

	public String getMemCardId() {
		return memcardid;
	}

	public void setMemCardId(String empNo) {
		this.memcardid = empNo;
	}

	public String getMemName() {
		return memname;
	}

	public void setMemName(String memname) {
		this.memname = memname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneno;
	}

	public void setPhoneNo(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getMembershipBookNo() {
		return membershipbookno;
	}

	public void setgetMembershipBookNo(String email) {
		this.membershipbookno = membershipbookno;
	}

}
