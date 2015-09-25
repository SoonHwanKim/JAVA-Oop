package inberitance;

import java.util.Scanner;

/**
 * 
 * @file_name : Account.java
 * @author : sevuo@naver.com
 * @date : 2015. 9. 24.
 * @story : 통장개설 프로그램
 */
public class AccountMain {
	/**
	 * 생성자를 만드시오. 단, 통장을 만듦과 동시에 은행 이름이 통장 바깥에 새겨지며(상수) 계좌번호는 랜덤숫자로 만들어 지며(총
	 * 6자리로 합시다) 계좌주인의 이름은 새겨지며 비번도 설정합니다 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요
	 */
	public static void main(String[] args) {
		MinusAccount maccount = new MinusAccount();
		Scanner scanner = new Scanner(System.in);
		int choice = 0, status = 0, money = 0;
		String name, password;
		while (true) {
			System.out.println("원하는 업무를 선택해주세요\n " + "1 : 통장개설, 2 : 잔액조회, 3 : 입금, 4 : 출금, 5 : 정지");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("이름");
				name = scanner.next();
				System.out.println("비밀번호 : ");
				password = scanner.next();
				maccount.setOwnerName(name);
				maccount.setPassword(password);
				status++;
				break;
			case 2:
				if (status == 0) {
					System.out.println("개설해 주세요");
				} else {
					System.out.println("잔액" + maccount.getRestMoney());
				}
				break;
			case 3:
				if (status == 0) {
					System.out.println("통장 개설부터 해주세요");
				} else {
					System.out.println("입금금액 :");
					money = scanner.nextInt();
					maccount.deposit(money);
				}
				break;
			case 4:
				if (status == 0) {
					System.out.println("통장을 개설부터 해주세요");
				} else {
					System.out.println("출금 금액 : ");
					money = scanner.nextInt();
					maccount.withdraw(money);
				}
				break;
			case 5:
				System.out.println("다시 입력해 주세요.");
				return;
			}
			
		}
	}
}
