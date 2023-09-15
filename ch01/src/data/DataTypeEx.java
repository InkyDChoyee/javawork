package data;

public class DataTypeEx {

	public static void main(String[] args) {
		// int, long의 사용
		// int형 크기 - 4Byte(32bit) -21억 ~ 21억 = 42억
		// long형 크기 - 8Byte(64bit) 
		
		int num1 = 1234567890; //12억 -> + 0 = 120억 => Error
		long num2 = 12345678900L; // int와의 구별을 위에 끝에 L,l을 붙여준다
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
