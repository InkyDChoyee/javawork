package classes.student;

// 참조(레퍼런스) 자료형
public class Student {
	// 1. 변수(클래스 안에서의 변수 = field)
	String name;	// 학생 이름(ex."홍길동")
	int studentId;	// 학번(ex.101)
	int grade;	// 학년
	
	// 함수가 아니므로 반환형이 없음
	// 클래스 이름과 동일
	// 2. 기본 생성자(매개변수가 없는)는 생략O => 없는건 아님 = 컴파일러가 자동 생성
	public Student() {  // 기본 생성자
	}
	
	// 3. 학생의 정보를 출력하는 메서드(함수) 필요
	public void showStudentInfo() {
		System.out.println(
				"이름 : " + name + ", 학번 : " + studentId + ", 학년 : " + grade);
	}
	
}	//	틀
