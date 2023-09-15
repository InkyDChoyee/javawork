package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		// 조건 연산자 -> 조건문(if문) 
		// 결과값 = (조건비교) ? 참값 : 거짓값
		
		// 예제1. - 결과값이 정수면 정수 변수 선언 
		int num = (4 > 5) ? 10 : 20; // false -> 20반환
		System.out.println("결과값 : " + num);
		
		// 예제2. - 결과값이 한 문자로 출력 => T or F
		int fatherAge = 45;
		int motherAge = 48;
		
		char result = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println("결과값 : " + result);
		
		// 예제3. - 홀수 짝수 판별 프로그램
		// 어떤 수(변수)를 2로 나눠서 나머지가 0 = 짝수 / 1 = 홀수
		// 결과값 = "짝수입니다" or "홀수입니다
		int number = 11;
		String str = (number % 2 == 0) ? "짝수입니다" : "홀수입니다";
		System.out.println("판정 : " + str);
		
	}

}
