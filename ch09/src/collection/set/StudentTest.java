package collection.set;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		// hashSet 자료구조 사용 -> 인스턴스 생성
		Set<Student> set = new HashSet<>();
		
		
		// 학생 인스턴스 생성
		Student std1 = new Student("이순신", 101);
		Student std2 = new Student("김시민", 102);
		Student std3 = new Student("신립", 103);
		Student std4 = new Student("권율", 103);
		Student std5 = new Student("권율", 103);
		
		// 자료 저장 (추가)
		set.add(std1);
		set.add(std2);
		set.add(std3);
		set.add(std4);
		set.add(std5);
		
		// 자료 출력 - 객체를 출력하면 리스트 형태로 출력
		System.out.println(set);
	}

}
