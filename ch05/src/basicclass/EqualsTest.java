package basicclass;

public class EqualsTest {

	public static void main(String[] args) {

		String name1 = new String("우영우");
		String name2 = new String("우영우");
		
		// 인스턴스의 메모리 주소 비교
	
		// 해쉬코드 메모리 주소(십진수)
		System.out.println(System.identityHashCode(name1)); // 주소값을 알고 싶을 때 사용
		System.out.println(System.identityHashCode(name2));
		
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name1 == name2); // => 주소값 비교
		System.out.println(name1.equals(name2));  // => 문자열 비교 => 위에서 재정의를 했기 때문에 true가 나옴
		
		System.out.println("==================================");
		
		Book book1 = new Book(100,"개미");
		Book book2 = new Book(100,"개미");
		
		System.out.println(System.identityHashCode(book1));
		System.out.println(System.identityHashCode(book2));
		
		System.out.println(book1 == book2); // => 주소값 비교
		System.out.println(book1.equals(book2));  // => 문자열 비교 => 재정의를 하지 않아서 false가 나옴
	}

}
