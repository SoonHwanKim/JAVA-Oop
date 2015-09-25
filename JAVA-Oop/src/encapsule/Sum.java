package encapsule;

public class Sum {

	private String result;
	public void calc(int num1, int num2) {
		int max =0,min=0, sum = 0;
		if (num1>num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		for (int i = min; i <= max; i++) {
			sum +=i;
		}
		result = sum +"";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return result;
	}
}

	
	
		



	


