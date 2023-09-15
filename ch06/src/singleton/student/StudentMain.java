package singleton.student;

public class StudentMain {

	public static void main(String[] args) {
		// 
		School school1 = School.getInstance();  // static 메모리에 할당
		School school2 = School.getInstance();
		
		Student kim = school1.createStudent();  // stack 메모리에 할당
		Student lee = school1.createStudent();
		Student park = school1.createStudent();
		
		System.out.println("학생 번호: " + kim.getStudentId());  
		System.out.println("학생 번호: " + lee.getStudentId());
		System.out.println("학생 번호: " + park.getStudentId());

		System.out.println(school1);
		System.out.println(school2);
		
		System.out.println(kim);
		System.out.println(lee);
		System.out.println(park);
		
	}

}
