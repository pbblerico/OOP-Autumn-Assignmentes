package problem2;

public class Member {
	private Account account;
	private Role role;
	private String tag;
	
	{
		role = Role.NO;
	}
	
	public Member() {}
	
	public Member(Account member) {
		this.account = member;
	}
	
	public Account getAccount() {
		return this.account;
	}
	public Role getRole() {
		return this.role;
	}
	public String getTag() {
		return this.tag;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String toString() {
		return this.account.getUsername() + " " + this.role + " " +  this.tag;
	}
}

