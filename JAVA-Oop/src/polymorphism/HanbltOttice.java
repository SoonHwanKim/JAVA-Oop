package polymorphism;

import java.util.Scanner;

public class HanbltOttice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, password;
		
		BankService bankService = new BankService();
		int choice, money;
		while (true) {
			System.out.println("원하는 업무를 선택해주세요\n " + "1 : 통장개설, 2 : 입금, 3 : 출금 4 : 잔액 조회, 5 : 정지 6 : 해지");
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
