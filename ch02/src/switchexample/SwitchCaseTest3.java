package switchexample;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		// 사칙연산 계산기 = +, -, *, /
		// 변수 = num1, num2, operator(산술자), result(결과값)
		// 2 * 3 = 6
		
		int num1 = 10;
		int num2 = 2;
		char operator = '*';  // 값을 초기화
		int result = 0;
		
		//if else 구문
		if(operator == '+') {  // {} = 브레이크 역할
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 - num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("지원되지 않는 기능입니다");	
			return;
		}
		System.out.println("결과 값은 " + result + "입니다");
		
		
		// switch 구문
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("지원되지 않는 기능입니다");	
			return;  // 프로그램 즉시 종료
		}
		System.out.println("결과 값은 " + result + "입니다");

	}

}
