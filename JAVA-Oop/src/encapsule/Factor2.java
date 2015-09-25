package encapsule;

import java.util.Scanner;

/**
 * 
 * @file_name  : Factor.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 9. 22.
 * @story      : 약수 알고리즘
 */
public class Factor2 {
	public String factorCalc(int dest) {
		String result = "";
	
		for (int i = 0; i < dest; i++) {
			if (dest % 1 == 0) {
				result = result.concat(1 + "");
			}
		}
		return result;
	}
	public String getname() {
		String name="";
		
		return name;
	}
}

	

//19 만약 dest가 6이면 count는 4일것이고 
//20 : count가 가진 4라는 값을 19번라인에서 임무를 수행 한후 사라져아 함 






