package encapsule;

import java.util.Scanner;

/**
 * 
 * @file_name  : Test.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 9. 22.
 * @story      :
 */
public class MoneyMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Money money  = new Money();
		System.out.println("금액을 입력하세요");
		int input = scanner.nextInt();
		String[] results =  money.countMoney(input);// 파라미터 = 매개변수
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}
}
