package encapsule;

import java.util.Scanner;

/**
 * 
 * @file_name  : Account.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 9. 24.
 * @story      : 통장개설 프로그램
 */
public class AccountMain {
	/**
	 * 생성자를 만드시오.
	 * 단, 통장을 만듦과 동시에
	 * 은행 이름이 통장 바깥에 새겨지며(상수)
	 * 계좌번호는 랜덤숫자로 만들어 지며(총 6자리로 합시다)
	 * 계좌주인의 이름은 새겨지며
	 * 비번도 설정합니다
	 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요
	 */
	public static void main(String[] args) {
		int money = 100000;
		Account account = new Account("홍길동","123456");
		Scanner scanner = new Scanner(System.in);
		account.deposit(money);
		money = 5000;
		account.withdraw(money);
		System.out.println(account.toString());
	}
}
