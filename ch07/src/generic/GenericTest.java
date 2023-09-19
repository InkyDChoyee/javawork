package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		// Generic(일반화) 이전의 코드 작성
		ArrayList cartList = new ArrayList();
		
		cartList.add("egg");
		cartList.add("coffee");
		
		// 강제 형변환 필요
		String item = (String)cartList.get(0);
		System.out.println(item);
		
		
		// Generic을 이용한 코드 작성 - 자바 1.5버전 이후 => 그때 그때 필요한 자료형을 넣을 수 있다
		// 제네릭 프로그래밍 - 어떤 값(객체)이 하나의 자료형이 아닌 여러 자료형을 사용할 수 있도록 프로그래밍 하는 것
		ArrayList<String> list = new ArrayList<>();
		
		list.add("egg");
		list.add("coffee");
		
		String item2 = list.get(0);
		System.out.println(item2);

	}

}
