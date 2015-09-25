package encapsule;

import java.util.Scanner;
/**
 * 
 * @file_name  : WhileLoopTen.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 9. 24.
 * @story      : do - while loop 문법
 */
public class WhileLoopTen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		do{
			i++;
			System.out.print(i+ "\t");
			
			if ( i == 11) {
				return;
			}

			}while (i < 10);
	}
}
		//i = 0; //이 부분을 생략하면 1에 이미 11이 할당된 상태로
		       //아래 for문을 돌기 때문에 1부터 증감하는 컨디션을 벗어난다.
		//for (; i  < 11; i++) {
			//sum += i;
		//}
		//System.out.println("i값의 합계:" +sum);
