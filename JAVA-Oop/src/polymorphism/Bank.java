package polymorphism;

public interface Bank {
	// 입금
	public void deposit(int money); // 추상메소드
	// 출금
	public void withdraw(int money);
	// 조회
	public void seach();
	//개설
	public void open(String name, String password);
		
	}



