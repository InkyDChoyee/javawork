package inheritance.statement;

public class Alcohol extends Drink {
	
	float alcper;   // 알콜 도수

	public Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count);  // 상속받은것
		this.alcper = alcper;       // 자기것
	}
	
	public static void printTitle() {  // 제목행 출력 메서드 재정의
		System.out.println("상품명(도수[%])\t 가격\t 수량\t 금액"); 
	}
	
	@Override
	public void printData() {
		System.out.println(name+ " (" + alcper + ") \t " + price + "\t "
						+ count + "\t " + getTotalPrice() );
	}

}
