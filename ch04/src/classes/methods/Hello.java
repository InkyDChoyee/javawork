package classes.methods;

public class Hello {
	// 기본 생성자 생략되어있음
	
	// sayHello() 메서드 정의
	public void sayHello() {
		System.out.println("안녕~");
	}
	
	public void sayHello(String name) { 
		// 메서드 오버로딩 = 메서드 이름은 동일 -> 매개 변수가 다름
		System.out.println("안녕~ " + name);
	}
}
