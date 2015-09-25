package encapsule;

import java.util.Scanner;

/**
 * 
 * @file_name  : Factor.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 9. 22.
 * @story      : 약수 알고리즘
 */
public class Factor {
	public static void main(String[] args) {
		System.out.println("약수를 구하려는 대상값 입력");
		Scanner scanner = new Scanner(System.in);
		Factor2 factor2 = new Factor2();
		int dest = scanner.nextInt();
		System.out.println(factor2.factorCalc(dest) + "는 " + dest + "의 약수입니다.");
	}
}


//19 만약 dest가 6이면 count는 4일것이고 
//20 : count가 가진 4라는 값을 19번라인에서 임무를 수행 한후 사라져아 함 






