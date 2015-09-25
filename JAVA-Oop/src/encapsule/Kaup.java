package encapsule;
/**
 * 
 * @file_name  : Kaup.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 9. 23.
 * @story      : 인스턴스 변수
 */

public class Kaup {
	private String name; // ㅜㅁ
	private double height;
	private double weight;
	private String result;
	
	
	// alt +shtft + s
	int idx = (int)((weight/(height*height))*10000);
	
	public String getResult() {
		return result;
	}

	public void setResult() {
		if (idx >= 30) {
			result= "비만";
		}
		else if (idx >= 24) {
			result= "과체중";
		}
		else if (idx >= 20) {
			result= "정상";
		}
		else if (idx >= 15) {
			result = "저체중";
		}
		else if (idx >= 13) {
			result = "마름";
		}
		else if (idx >= 10) {
			result = "영양실조";
		}
		else {
			this.result = "소모증";
		}
	}
	
	public String getName() {
		return name;
	}

	public double getHeght() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String foo) {
		name = foo;
	}

	public void setHeght(double heght) {
		this.height = heght;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getResult();
	}
}

/**
 * get = read, set = write 
 * 
 */
