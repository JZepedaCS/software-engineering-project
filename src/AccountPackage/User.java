package AccountPackage;

public class User {

	public User() {
	}
	
	public User(String username, String password) {
		this.accountUsername = username;
		this.accountPassword = password;
	}
	
	public User(int id, String username, String password, String privilege) {
		this.accountID = id;
		this.accountUsername = username;
		this.accountPassword = password;
		this.accountPrivilege = privilege;
	}

	private int accountID;

	private String accountUsername;

	private String accountPassword;

	private String accountPrivilege;

	public int getAcctID() {
		return accountID;
	}

	public String getAcctUsername() {
		return accountUsername;
	}

	public String getAcctPassword() {
		return accountPassword;
	}
	
	public void setAcctPassword(String password) {
		this.accountPassword = password;
	}

	public User getAcctInfo() {
		return this;
	}

}