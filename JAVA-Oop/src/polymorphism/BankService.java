package polymorphism;

import java.util.Scanner;

public class BankService implements Bank{
	Account account = new Account();
	//this.restMoney = > account.restMoney;
	Scanner scanner = new Scanner(System.in);

	@Override
	public void deposit(int money) {

		account.restMoney += money;
		
	}
	public void withdraw(int money) {


		if ((account.restMoney  - money) < 0) {
			System.out.println("잔액부족");
					}
		else
		account.restMoney -= money;
		
	}
	@Override
	public void seach() {
		System.out.println(account.restMoney);
	}
	@Override
	public void open(String name, String password) {

		account.setOwnerName(name);
		account.setPassword(password);
		System.out.println("계좌번호 :");
	}
}




	
