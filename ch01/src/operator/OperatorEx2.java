package operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 비교 연산자(상수) - >, <, >=, <=, ==, !=
		// 겱과 = boolean 자료형 => true/false
		System.out.println(4 > 5); // False
		System.out.println(4 < 5); // True
		System.out.println(4 == 5); // False ==같다
		System.out.println(4 != 5); // True  !=같지않다
		
		System.out.println("===========");
		
		// 비교 연산자(변수)
		int n1 = 4, n2 = 5; // 변수 두개를 연속하여 선언
		System.out.println(n1 > n2); // false
		System.out.println(n1 < n2); // true
		System.out.println(n1 == n2); // false
		System.out.println(n1 != n2); // true

		System.out.println("===========");
		
		//손흥민 선수가 미혼
		//결과가 "미혼입니다"
		boolean isMerried = false; // boolean을 선언하는 순가 변수에는 true나 false밖에 쓰지 못한다
		System.out.println(isMerried);
		
		//조건 연산자 : (비교값) ? 참인값 : 거짓인값
		String result = (isMerried == true) ? "기혼입니다." : "미혼입니다."; // 비교값으로 들어갈 때는 == 두개를 쓴다		
		System.out.println("손흥민 선수는 " + result);
	}

}
