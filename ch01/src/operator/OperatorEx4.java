package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		// 논리 연산자
		
		// && - 엠퍼샌드 = 두 항이 모두 참인 경우에만 -> 결과 값 = True => 교집합, and 집합, 논리곱
		// || - bar = 두 항 중 하나만 참이어도 -> 결과 값 = True => 합집합, or 집합, 논리합 
		// ! - 어떤 항이 참이면 -> false, 거짓이면 -> true => 논리부정
		
		System.out.println((4 < 5) && (10 == 11));  // => false
		System.out.println((4 < 5) || (10 == 11));  // => true -> 앞에서 참인 값이 나오면 뒤에 조건을 보지 않음
		System.out.println(!(10 == 11)); // true

	}

}
