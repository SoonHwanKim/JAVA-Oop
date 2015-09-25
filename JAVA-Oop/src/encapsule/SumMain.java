package encapsule;

import java.util.Scanner;

/**
 * 
 * @file_name  : SumMain.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 9. 23.
 * @story      : 입력받은 두수의 사이의 값을 모두 더해서 반환해라
 */
public class SumMain {
	public static void main(String[] args) {
		Sum sum = new Sum();
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		System.out.println("두 수 입력 :");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		sum.calc(num1, num2);
		System.out.println(sum.toString());
		
	}

}
