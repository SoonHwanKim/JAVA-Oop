package inberitance;

import encapsule.Kaup;

public class MinusAccount extends Account {
	private static final String BANK_NAME = "러시앤 캐쉬";
	private String accountNo;
	private String ownerName;
	private String password;
	private int restMoney;
	private String sgnal;

	
	
	public MinusAccount(String name, String password ) {
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
	public MinusAccount() {
		// TODO Auto-generated constructor stub
		super();
	}
	public void deposit(int money) {
		restMoney += money;
	}
	public void withdraw(int money) {
	
		if ((restMoney - money) < 0) {
			this.sgnal = "잔액부족";
		}else {
			this.restMoney -= money;
		}
		
		// TODO Auto-generated method stub
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
