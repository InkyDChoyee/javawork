package classes.constructor;


// 참조자료형 - person 클래스 정의
// 생성자 오버로딩 = 이름이 같고 자료형이 다름
public class Person {
	String name;	// 이름
	float height;	// 키
	float weight;	// 무게
	
	// 기본 생성자
	public Person() {
		
	}
	
	// 매개변수가 있는 생성자
	public Person(String n) { // 이름 매개변수 => 매개변수가 다르니까 기본생성자랑 충돌X
		name = n;
	}
	
	// 매개변수가 있는 생성자(모든 필드)
	public Person(String n, float h, float w ) {
		name = n; // 외부에서 입력된 이름을 저장
		height = h;	// 외부에서 입력된 키
		weight = w;	// 외부에서 입력된 몸무게
	}
	
	
	// 메서드
	public void showPersonInfo() {
		System.out.printf(
				"이름은 : %s이고, 키는 : %.1f, 몸무게 : %.1f\n", 
				name, height, weight);
	}

}
