package encapsule;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 
 * @file_name  : Maxmin.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 22.
 * @story      : 최고점, 최저점 구하기
 */
public class MaxminMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] avgs = new int[5];
		int max=0, min=100;
		System.out.println("학생들 점수를 입력하시면 최고점, 최저점이 출력됩니다.");
		System.out.println("단, 정원은 5명 입니다.");
		for (int i = 0; i < avgs.length; i++) {
			avgs[i] = scanner.nextInt();
			}
		Maxmin Maxmin = new Maxmin();
	
		}
	}



