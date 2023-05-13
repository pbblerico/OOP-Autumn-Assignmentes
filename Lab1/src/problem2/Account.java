package problem2;

public class Account {
	private String username;
	private String bio;
	
	public Account() {}
	
	public Account(String username) {
		this.username = username;
	}
	public Account(String name, String bio) {
		this(name);
		this.bio = bio;
	}

	public String getUsername() {
		return this.username;
	}
	
	public String getBio() {
		return this.bio;
	}

	public void setTag(String tag) {
		this.username = tag;
	}
	
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	public String toString() {
		return this.username + "\n" + this.bio;
	}
}
