package methods;

public class MethodTest1 {
	
	// (변수의 선언과 사용)
			// 함수 정의(선언)와 호출(사용)

	public static void main(String[] args) {
		sayHello();  // 함수 호출
		sayHello("파이썬");  // 매개변수를 넣어서 함수 호출
		sayHello("이순신");   
		
		
	}
	
	
	// sayHello() 라는 이름의 함수를 정의
	public static void sayHello() {
	//public = 접근가능하다  / void = 반환값이 없음(비어있다)
		System.out.println("안녕하세요 자바");
	}
	
	// 매개변수(parameter)가 있는 함수 정의
	public static void sayHello(String name) {  // 이름이 같아도 매개변수가 다르면 다른 함수
	//                           이름을 넣어서 호출가능
		System.out.println("안녕하세요 " + name);
	}

}
