package arraycopy;

public class BookTest {

	public static void main(String[] args) {
		// 객체를 담을 크기가 3인 배열 생성 
		Book[] books = new Book[3];
		
		// 객체 3개 생성
		Book book1 = new Book("개미", "베르나르");
		Book book2 = new Book("태백산맥", "조정래");
		Book book3 = new Book("미생", "윤태호");
		
		//System.out.println(book1);
				//System.out.println(book1.toString());

		// 인덱스 순서에 따라 저장
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		//for(int i = 0; i < books.length; i++) {
		//	books[i] = book(i+1);  => 지원X 불가능
		//}
		
		// 1개 출력
		//System.out.println(books[2]);
		
		// 전체 출력
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
			// System.out.println(books[i].toString);
		}
	}
}
