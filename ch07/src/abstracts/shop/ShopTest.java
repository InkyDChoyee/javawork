package abstracts.shop;

public class ShopTest {

	public static void main(String[] args) {
		// 추상 클래스 = 객체 생성 불가
		// HeadShop shop1 = new HeadShop();
		HeadShop shop1 = new Shop1();
		shop1.된장찌개();
		shop1.김치찌개();
		shop1.비빔밥();
		
		System.out.println("====================");
		
		HeadShop shop2 = new Shop2();
		shop2.된장찌개();
		shop2.김치찌개();
		shop2.비빔밥();
		
		
	}

}
