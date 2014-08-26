package br.pucrs.alpro2.usersgroups;

public class Users {
	
	private String name;
	private String accountName;
	private int accountType;
	private String password;
	private Group gp;
	
	public Users(String name, String accountName, int accountType, String password, Group gp) {
		super();
		this.name = name;
		this.accountName = accountName;
		this.accountType = accountType;
		this.password = password;
		this.gp = gp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Group getGp() {
		return gp;
	}

	public void setGp(Group gp) {
		this.gp = gp;
	}
	
}
