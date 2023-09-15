package data;

public class Variable {

	public static void main(String[] args) {
		// 변수를 사용
		// 변수 선언 방법 = 자료형 + 변수이름
		// 문자열 자료형 - String, 한 문자 자료형 - char
		/* 변수 이름 명명시 문법오류
		   1. 예약어(이미 정해진 명령어)는 사용할 수 없음
		   2. 변수이름에 공백(문자)을 사용할 수 없음
		   3. 변수이름은 숫자로 시작할 수 없음 */
		int year; // 정수형(정수 자료형) 변수 year를 선언함
		year = 2023; // 변수 year에 2023을 대입함
		System.out.println(year + "년");
		
		int month = 9; //변수의 초기화 = 선언과 동시에 값을 대입
		System.out.println(month + "월");
		
		int day = 5;
		System.out.println(day + "일"); // 숫자와 문자 연결하기 => + 기호를 넣으면 된다
		
		// 손흥민은 3학년 2반 입니다
		// 변수 = 이름, 학년, 반
		String name = "손흥민";
		int grade = 3;
		int schoolClass = 2;
		
		System.out.println(name +"은");
		System.out.println(grade + "학년");
		System.out.println(schoolClass + "반 입니다");
		System.out.println(name +"은 " + grade + "학년 " + schoolClass + "반 입니다");
		
		
	}

}
