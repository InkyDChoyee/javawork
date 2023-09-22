package funcinterface.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// Calculator 변수 선언 - add, sub
		Calculator add,sub,mul,div;
				
		int num1 = 10, num2 = 5;
		
		
		// Calculator() 구현 - 람다식
		// 덧셈 구현
		add = (n1, n2) -> num1 + num2;
		
		// 호출
		System.out.println(add.calculator(num1, num2));
		
		// 뺄셈 구현
		sub = (n1, n2) -> num1 - num2;
		
		// 호출
		System.out.println(sub.calculator(num1, num2));
		
		// 곱셈 구현
		mul = (n1, n2) -> num1 * num2;
		
		// 호출
		System.out.println(mul.calculator(num1, num2));
		
		// 나눗셈 구현
		div = (n1, n2) -> num1 / num2;
		
		// 호출
		System.out.println(div.calculator(num1, num2));
		
		
		
	}

}
