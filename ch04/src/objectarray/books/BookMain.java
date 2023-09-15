package objectarray.books;

public class BookMain {

	public static void main(String[] args) {
		/*
		Book_19[] library = new Book_19[3];

		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		// 객체 생성(배열에 저장)
		library[0] = new Book_19("자바 프로그래밍 입문", "박은종");
		library[1] = new Book_19("웹 표준의 정석", "고경희");
		library[2] = new Book_19("스프링부트", "채규테");
		*/
		
		Book[] library = {
				new Book("자바 프로그래밍 입문", "박은종"),
				new Book("웹 표준의 정석", "고경희"),
				new Book("스프링부트", "채규테")
		};
		
		// 출력
		//library[0].showBookInfo();
		System.out.println(library[0].showBookInfo());
		
		System.out.println("=============================");
		
		// 전체출력
		for(int i = 0; i < library.length; i++) {
			// library[i].showBookInfo();
			System.out.println(library[i].showBookInfo());
		}
		
		System.out.println("====================================");
		
		// 향상된 for문
		// for(자료형 변수 : 배열) { }
		for(Book book : library)
			System.out.println(book.showBookInfo());
	
	}

}
