package basicclass;

public class BookTest {

	public static void main(String[] args) {

		Book book1 = new Book(100, "개미"); // 메서드를 재정의 하지 않으면 주소가 나오고
		System.out.println(book1);         // 메서드를 재정의 해주면 제목이 나온다
		System.out.println(book1.toString());         // 메서드를 재정의 해주면 제목이 나온다
		
		String msg = new String("개미");   // String은 자체 재정의가 되어있음
		System.out.println(msg);

	}
}
