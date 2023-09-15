package singleton;

public class Company {
	// 싱글톤 코딩 디자인 패턴 사용
	// 멤버 변수가 객체 인스턴스
	// static을 활용함 - new로 생성하지 않음 / new O - 힙메모리 / new X - 정적 메모리
	private static Company instance;  // 멤버 변수(필드)
	
	private Company() {} // 생성자 private 사용 접근 제한
	
	public static Company getInstance() {   // new 하지 않는 경우 -> 클래스로 직접 접근
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
		

}
