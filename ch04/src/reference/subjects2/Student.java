package reference.subjects2;

import reference.subjects.Subject;

public class Student {  // 클래스 안에서 변수는 자동으로 초기화를 해준다
	// 필드
	private int studentId;	// int studentId = 0;
	private String studentName; // String studentName = null
	private Subject[] subjects;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10];   // 과목을 저장함
	}
	
	// 과목을 추가하는 메서드
	public void addSubject(String name, int score) {
		// 과목 객체를 생성해서 값을 저장
		Subject subject = new Subject(name, score);
		//subject.setSubjectName(name);
		//subject.setScorePoint(score);
		
		// 과목을 배열에 저장
		// subjects[0] = subjcet; = 1개 저장
		
		// 과목전체를 배열에 저장
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] == null) { // 배열의 요소가 비어있을 때
			subjects[i] = subject;  // 배열 객체를 저장
			break;
			}
		}
	}
	// 학생 정보 출력
	public void showStudentInfo() {
		int total = 0;  // 총점
		double avg;     // 평균
		int count = 0;  // 과목 수
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] != null) { // 배열의 요소가 비어있지 않을 때
				//Subject subject = subjects[i]; // 과목 이름을 각 객체 배열에 할당
				count++;  // 1증가
				total += subjects[i].getScorePoint();  //점수 누적
			System.out.println(studentId + "학번 " + studentName + " 학생의 "
					+ subjects[i].getSubjectName() + " 점수는 "
					+ subjects[i].getScorePoint() + "점 입니다");
			}
		}
		avg = (double)total / count;
		System.out.printf("과목의 총점은 %d점이고, 평균은 %.1f점입니다\n", total, avg );
	}
}
