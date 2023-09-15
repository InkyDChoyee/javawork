package methods;

public class RetrunMethodTest {

	// return이 있는 함수 (반환 자료형) - int, String 등
	// 호출한 곳으로 반환값을 보냄
	
	public static void main(String[] args) {
		int n1 = 10, n2 = 20;  // 지역변수 - local변수
		
		// 더하기 함수 호출
		int result = add(n1, n2); // 더하기 함수 호출
		System.out.println("결과값 = " + result);
		
		// 제곱수 호출
		int result2 = square(n1);
		System.out.println("결과값 = " + result2);
		
		// 메세지 호출
		String msg = message();
	    System.out.println(msg);

	}
	// return이 있고, 매개변수 2개인 함수 이름 = add
	//           반환자료형 int(정수형) 필요
	public static int add(int a, int b) { // 매개변수
		return a + b; 
	}
	// return이 있고, 매개변수 1개인 함수 이름 = square
	public static int square(int x) { // 매개변수
		return x * x; 
	}
	// return이 있고, 매개변수가 없는 함수
	public static String message() {
		String msg = "행운을 빌어요";
		return msg;
		//return "행운을 빌어요";
	}
}


