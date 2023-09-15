package statics.card;

public class Card {
	private static int serialNum = 10000;   // 클래스 변수 -> new 불필요
	private int cardNumber;  // 인스턴스 변수 -> new 필요
	
	public Card() {  // 생성할 때 마다 카드 번호가 1 증가
		serialNum++;
		cardNumber = serialNum;
	}
	public int getCardNumver() {
		return cardNumber;
	}
}
