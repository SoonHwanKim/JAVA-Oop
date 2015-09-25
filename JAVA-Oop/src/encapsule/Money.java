package encapsule;

/**
 * 
 * @file_name : Money.java
 * @author : sevuo@naver.com
 * @date : 2015. 9. 21.
 * @story : 금액을 입력하면 화페 단위별로 분류시키는 문제
 */
public class Money {
	/**
	 * 예를 들어서 134,530이면 거스름돈을 화페로 표시해주면 5만원 : 2, 1만원 : 3 표시하고 10원 미만은 절삭
	 */
	public String[] countMoney(int money) {
		int[] moneyUnlt = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] moneyCount = new int[moneyUnlt.length];
		int mok = 0;
		int nmg = 0;
		String[] result = new String[moneyUnlt.length];

		for (int i = 0; i < moneyUnlt.length; i++) {
			mok = money / moneyUnlt[i];
			nmg = money % moneyUnlt[i];
			money = nmg;
			result[i]=moneyUnlt[i] + "원 : " + moneyCount[i]; 
		}
		return result;
	}
	/**
	 * 22 : moneyUnlt과 같은 index의 moneyCount에는 화페의 수를 저장한다. 25 : moneyUnlt[0] =
	 * 5만원권, 전체금액을 5만원권으로 나눈 몫을 나눈다.
	 */
}
