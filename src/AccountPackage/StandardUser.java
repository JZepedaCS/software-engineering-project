package AccountPackage;

public class StandardUser extends User {

	public StandardUser(String company, String shipAddr, String contactInfo) {
		this.accountCompany = company;
		this.accountShippingAddress = shipAddr;
		this.accountContactInfo = contactInfo;
	}

	private String accountCompany;

	private String accountShippingAddress;

	private String accountContactInfo;

	public String getAcctCompany() {
		return accountCompany;
	}

	public String getAcctShipAddr() {
		return accountShippingAddress;
	}

	public String getAcctContactInfo() {
		return accountContactInfo;
	}

}