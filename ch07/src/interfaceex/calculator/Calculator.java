package interfaceex.calculator;

// 구성요소 - 상수, 추상 메서드
// 필드나 생성자가 없음
// 인터페이스는 모든 메서드가 추상메서드이다
public interface Calculator {
	
	// 인터페이스 상수 (final을 생략해도 됨)
	// 변수를 선언해도 오류가 나지 않는 이유는 상수로 변환됨(final이 자동으로 붙는 개념)
	int ERROR =  -999999;  
	
	// 추상 메서드 - 선언부만 있고, 구현은 안함
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);
	
}
