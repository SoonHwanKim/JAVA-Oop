package polymorphism;

import java.util.Scanner;

/**
 * 
 * @file_name : Account.java
 * @author : sevuo@naver.com
 * @date : 2015. 9. 24.
 * @story : 사용자 통장개설 프로그램
 */
public class AccountMain {
	/**
	 * 생성자를 만드시오. 단, 통장을 만듦과 동시에 은행 이름이 통장 바깥에 새겨지며(상수) 계좌번호는 랜덤숫자로 만들어 지며(총
	 * 6자리로 합시다) 계좌주인의 이름은 새겨지며 비번도 설정합니다 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, password;
		
		BankService bankService = new BankService();
		int choice, money;
		while (true) {
			System.out.println("원하는 업무를 선택해주세요\n " + "1 : 통장개설, 2 : 입금, 3 : 출금 4 : 잔액 조회, 5 : 정지");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("이름 입력");
				name = scanner.next();
				System.out.println("패스워드 입력");
				password =scanner.next();
				bankService.open(name, password);
				System.out.println();
				break;
			case 2:
				System.out.println("입금");
				money = scanner.nextInt();
				bankService.deposit(money);
				break;
			case 3:
				System.out.println("출금");
				money = scanner.nextInt();
				bankService.withdraw(money);
				break;
			case 4:
				bankService.seach();
				break;
			case 5:
				return;
			}
		}
	}
}
