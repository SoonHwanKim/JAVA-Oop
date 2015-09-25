package encapsule;

public class Pay {
	//맴버필드
	private final double TXE_RATE = 0.097;
	private int salary;
	private String result;
	private String name;
	private int tax;
	// 맴버 메소드
public Pay() {
	// TODO Auto-generated constructor stub
}
	
	public Pay(int salary, String name){
		this.name = name;
		this.salary = salary;
	}

	public void setResult(String result) {
		int money = (int) TXE_RATE;
	}
	public String getSalary() {
		return name;
	}
	public int getName() {
		return salary;
	}
	public void setSalary(int salary) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "연봉 "+this.salary+" 만원을 받으시는 " +this.name +"님 납부할 세금은"+(int) (salary * TXE_RATE)+"만원입니다";
	}


		
	}



