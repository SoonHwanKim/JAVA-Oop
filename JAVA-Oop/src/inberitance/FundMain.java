package inberitance;

import java.security.acl.Owner;
import java.util.Scanner;

import javax.activation.MailcapCommandMap;

public class FundMain {
	/**
	 * 생성자를 만드시오. 단, 통장을 만듦과 동시에 은행 이름이 통장 바깥에 새겨지며(상수) 계좌번호는 랜덤숫자로 만들어 지며(총
	 * 6자리로 합시다) 계좌주인의 이름은 새겨지며 비번도 설정합니다 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요
	 */
	public static void main(String[] args) {
		Fund fund = new Fund();
		int choice = 0, status = 0;
		String name = "", password = ";";
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("원하는 업무를 선택해주세요\n " + "1 : 통장개설, 2 : 잔액조회, 3 : 입금, 4 : 출금, 5 : 정지");
			choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("이름 입력");
			name = scanner.next();
			System.out.println("패스워드 입력");
			password = scanner.next();
			//oew
			break;
			case 2:
				if (status == 0) {
					System.out.println("통장을 개설해 주세요");
				}else {
					System.out.println("잔액 조회");
				}

				

		default:
			break;
			}
		}
	}
}



