package inheritance.statement;

public class Drink {
	// protected 접근 제어자는 상속할 때만 사용함
	protected String name;  // 상품명
	protected int price;    // 가격
	protected int count;    // 수량
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int getTotalPrice() {
		// 금액 = 가격 x 수량
		return price * count;
	}
	
	public static void printTitle() {  // 제목행 출력
		System.out.println("상품명\t 가격\t 수량\t 금액");  // 상수랑 같은 개념 -> static
	}
	
	public void printData() {
		System.out.println(name + "\t " + price + "\t " + count + "\t " + getTotalPrice() );
	}

}
