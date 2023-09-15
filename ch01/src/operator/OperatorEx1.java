package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 산술 연산자(상수 사용) -> +, -, *, /, %(나머지)
		// 계산의 결과는 기본적으로 int 정수형으로 나온다
		// 자바의 기본형 = int, double임
		// % 연산자 = 홀수, 짝수 판별에 좋음
		System.out.println(4 + 8); // 11
		System.out.println(4 - 8); // -4
		System.out.println(4 * 8); // 32
		System.out.println(4 / (double)8); // 0.5 , 형변환(type conversion)
		
		System.out.println(5 % 2); // 1
		System.out.println(4 % 2); // 0 (짝수)
		System.out.println(7 % 2); // 1 (홀수)
		
		System.out.println("==========================");
		
		// 산술 연산자(변수 사용)
	    int a = 9;
	    int b = 5;
	    System.out.println(a + b);
	    System.out.println(a - b);
	    System.out.println(a * b);
	    System.out.println((double)a / b);
	    System.out.println(a % b);
	    
		System.out.println("==========================");
	    
	    // 점수의 합계, 평균
	    int korScore = 95; // 국어 점수가 95점이다('=' 은 대입 연산자)
	    int mathScore = 80; // 수학 점수가 80점이다
	    int sumScore; // 합계 변수 선언
	    double avgScore; // 평균 변수 선언 => 평균 = 총점 / 과목수
	    
	    sumScore = korScore + mathScore; // 합계 계산
	    avgScore = (double)sumScore / 2; // 계산은 기본적으로 int로 계산해버린다 => 형변환을 해주어야 한다
	    
	    System.out.println("총점 : " + sumScore);
	    System.out.println("평균 : " + avgScore);
	}

}
