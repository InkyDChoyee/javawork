package abstracts.shop;

public class Shop2 extends HeadShop{

	public Shop2() {
		System.out.println("*** 역세권 매장입니다 ***");
	}
	@Override
	public void 된장찌개() {
		System.out.println("된장찌개 : 7000원");
	}

	@Override
	public void 김치찌개() {
		System.out.println("김치찌개 : 7500원");
	}

	@Override
	public void 비빔밥() {
		System.out.println("비빔밥 : 7500원");
	}

}
