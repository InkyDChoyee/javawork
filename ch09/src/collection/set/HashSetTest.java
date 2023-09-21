package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// Set 인터페이스를 구현한 HashSet 클래스의 객체 생성
		// 순서가 없고, 중복 데이터를 저장할 수 없음
		Set<String> set = new HashSet<>();
		
		// 객체 생성
		set.add("Java");
		set.add("Jdbc");
		set.add("Jsp");
		set.add("JavaScript");
		set.add("Java");    // -> 중복 허용X = 저장, 출력X
		
		// 객체의 수
		System.out.println("총 객체수:" + set.size());
		
		if(set.contains("Jsp")) {
			set.remove("Jsp");
		}
		
		// 객체 삭제
		if(set.contains("Jsp")) {
			set.remove("Jsp");
		}

		// 객체의 수
		System.out.println("총 객체수:" + set.size());
		
		// 전체 목록 조회1
		// 순서가 없어서 인덱싱 불가능
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {  // 객체 수만큼 반복
			String element = iterator.next();       // 다음 객체가 있으면 자료를 가져와 String에 담는다
			System.out.println(element);
		}
		System.out.println("=======================");
			
		// 전체 목록 조회2   => 인덱싱이 안될때는 향상for문을 사용하면 좋다
		for(String element : set)
			System.out.println(element);
		
		System.out.println("=======================");

		System.out.println(set);
		
		
	}

}
