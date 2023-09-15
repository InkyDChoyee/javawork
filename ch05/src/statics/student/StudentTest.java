package statics.student;

public class StudentTest {

	public static void main(String[] args) {
		
		// 인스턴스 객체 변수, 클래스 객체 변수(static이 붙어있는 경우)
		//Student s1 = new Student();
		//Student s2 = new Student();
		
		//System.out.println("s1=" + s1.getId());
		//System.out.println("s2=" + s2.getId());
		
		// 클래스 변수 = 클래스 이름으로 직접 접근(new 하지 않음)
		// static -> 값이 공유되고, 누적되며 -> 프로그램이 종료되면 소멸
		Student.serialNum++;
		System.out.println(Student.serialNum);
		
		Student.serialNum++;
		System.out.println(Student.serialNum);
		
		Student s1 = new Student();
		s1.setId(101);
		System.out.println("학번: " + s1.getId());
	}

}
