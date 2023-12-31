package streams.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//import streams.customer.Customer;

class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	
	
}

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		// 스트림 생성하고 출력하기
		// 모든 책의 가격의 합
		// 책의 가격이 2만원 이상인 책의 이름을 정렬하여 출력
		
		Stream<Book> stream = bookList.stream();
	      stream.map(c -> c.getName())
	           .forEach(s -> System.out.println(s));
	      
	      int total = bookList.stream()
	                        .mapToInt(c -> c.getPrice())
	                        .sum();
	      
	      System.out.println("총 책의 비용은 " + total + "원 입니다.");
		
	      System.out.println("==== 책의 가격이 20000원 이상인 책의 명단 ====");
	      //중간 연산 - filter(), map(), sorted()
	      //최종 연산 - forEach()
	      bookList.stream()
	               .filter(c -> c.getPrice() >= 20000)
	               .map(c -> c.getName())
	               .sorted()
	               .forEach(s -> System.out.println(s));
		
	}

}
