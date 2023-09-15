package reference.subjects;

public class StudentMain {

	public static void main(String[] args) {
		/*
		Student_24 std1 = new Student_24(101, "홍길동");
		Student_24 std2 = new Student_24(102, "최동현");
		
		
		// 과목 추가
		std1.koreanSubject("국어", 90);
		std1.mathSubject("수학", 80);
		std2.koreanSubject("국어", 95);
		std2.mathSubject("수학", 75);
		
		// 학생 정보 출력
		std1.showStudentInfo();
		System.out.println("=====================================");
		std2.showStudentInfo();
		*/
		
		// 객체 배열
		Student[] students = {
			new Student(101, "홍길동"),
			new Student(102, "최동현"),
			new Student(103, "임상옥")
		};
		
		students[0].koreanSubject("국어", 90);
		students[0].mathSubject("수학", 80);
		
		students[1].koreanSubject("국어", 80);
		students[1].mathSubject("수학", 90);
		
		students[2].koreanSubject("국어", 85);
		students[2].mathSubject("수학", 85);
		
		// students[0].showStudentInfo();
		
		
		// 전체 출력
		
		for(int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();
		}
		
		
		System.out.println("=====================================");
			
		// 향상 for
		
		for(Student stu : students) 
			stu.showStudentInfo();
			
	
		
	}

	}

