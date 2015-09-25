package encapsule;

public class Card {
	private String kind; // 카드의 무늬(스페이드, 다이아, 하트, 클럽)
	private int number; // 카드의 넘버(1 ~ 13)
	static int WIDTH = 100; // 카드의 너비
	static int HEIGHT = 100; // 카드의 높이
	
	
	public Card() {
		this.number = (int) (Math.random() * 10)+1;
		// TODO Auto-generated constructor stub
	}
	public String getKind() {
		return kind;
	}
	public int getNumber() {
		return number;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
