package wrapper;

public class integerTest {

	public static void main(String[] args) {
		//int num1 = 100;
		Integer num1 = 100;
		int num2 = 200;
		
		// num1 = 객체 => intValue() 메서드에 접근 가능
		int sum = num1.intValue() + num2;
		 
		System.out.println(num1);
		System.out.println(sum);
		
		// valueOf() 메서드 = 괄호 안에 매개변수(정수,문자열)를 숫자로 변환
		Integer num3 = Integer.valueOf("123");
		System.out.println(num3);
		
		// parseInt() 메서드 = 문자열을 숫자로 변환
		int num4 = Integer.parseInt("456");
		System.out.println(num4);
	}

}
