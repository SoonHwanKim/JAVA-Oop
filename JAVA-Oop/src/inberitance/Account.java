package inberitance;

public class Account {
	protected String accountNo;
	protected String ownerName;
	private String password;
	protected int restMoney;
	protected String sgnal;
	protected static final String BANK_NAME = "한빛뱅크";
	
	public Account() {
		this.ownerName = "";
		this.sgnal = "";
		this.password = "";
		this.accountNo = "";
		
		for (int i = 0; i < 6; i++) {
			this.accountNo += ((int) (Math.random()*10)+""); 
			if (i == 0 && accountNo.indexOf(0) == 0 ) {
				i--;
			}
		}
	}
	
	public Account(String name, String password ) {
		this.ownerName = name;
		this.sgnal = "";
		this.password = password;
		this.accountNo = "";
		
		for (int i = 0; i < 6; i++) {
			this.accountNo += ((int) (Math.random()*10)+""); 
			if (i == 0 && accountNo.indexOf(0) == 0 ) {
				i--;
			}
		}
	}


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
	public String getSgnal() {
		return sgnal;
	}
	public void setSgnal(String sgnal) {
		this.sgnal = sgnal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return BANK_NAME+"\n" + "계좌번호 :"+ accountNo+"\n"+ "이름 :" + ownerName +"\n"+ "잔액 :"+ restMoney;
	}
}




