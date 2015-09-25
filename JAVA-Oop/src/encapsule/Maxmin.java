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
public class Maxmin {
	public  String getMaxMin(int[] avgs) {
		int max=0, min=100;
		String result = null;
		for (int i = 0; i < avgs.length; i++) {
			if (max < avgs[i]) {
				max = avgs[i];
			}
			if (min > avgs[i]) {
				min = avgs[i];
			}
		}
		return result = "최대값 점수는?" +max+"최소값 점수는?" +min;
	}
}