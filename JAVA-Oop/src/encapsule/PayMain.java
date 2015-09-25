package encapsule;

import java.awt.Insets;
import java.util.Scanner;

/**
 * 
 * @file_name  : PayMain.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 9. 23.
 * @story      : 세금 공제한 실급여 환산 프로그램
 */
public class PayMain {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 연봉을 입력 받아서
	 * 연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원 입니다.
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단) 세율이 정권이 바뀔때 마다 변하니,
	 * 관리자가 쉽게 적용 가능하도록 만들어 주세요.
	 * 현 정권의 세율이 9.7프로라고 합니다.
	 */
	public static void main(String[] args) {
		
		Pay pay = new Pay(3600, "아이언맨");
		Scanner scanner = new Scanner(System.in);
		String name;
		int salary;
		System.out.println("연봉 입력");
		salary = scanner.nextInt();
		System.out.println("이름 입력");
		name = scanner.next();
		pay.setName(name);
		pay.setSalary(salary);
		System.out.println(pay.toString());
	}
}




