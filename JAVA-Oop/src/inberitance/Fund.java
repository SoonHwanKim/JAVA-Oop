package inberitance;

public class Fund {
	protected String accountNo;
	protected String ownerName;
	private String password;
	protected int restMoney;
	protected String sgnal;
	protected static final String BANK_NAME = "한빛뱅크";
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getPassword() {
		return password;
	}
	public int getRestMoney() {
		return restMoney;
	}
	public String getSgnal() {
		return sgnal;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}
	public void setSgnal(String sgnal) {
		this.sgnal = sgnal;
	}

}

