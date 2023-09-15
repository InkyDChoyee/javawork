package overriding.shop;

public class MainClass2 {

	public static void main(String[] args) {
		// 부모형으로 객체 생성 - 자동 형변환
		HeadShop shop1 = new Shop1();  // 부모 클래스 자료형 -> 자식 클래스 자료형
		
		shop1.비빔밥();

		System.out.println("======================");
		
		HeadShop shop2 = new Shop2();
		
		shop2.비빔밥();
		
		// 기본자료형에서의 형 변환
		int iNum = 10;
		double dNum;
		dNum = iNum;
		System.out.println(dNum);
		
		// 강제 형변환
		iNum = (int)dNum; 
		System.out.println(iNum);
	}

}
