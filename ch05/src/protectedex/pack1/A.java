package protectedex.pack1;

// protected = 다른 패키지는 접근 불가
// 같은 패키지 내부, 다른 패키지여도 상속 관계는 가능(사용 가능)
public class A {
	protected String field; // 필드
	
	protected A(){} // 생성자
	
	protected void method(){}// 메서드
}
