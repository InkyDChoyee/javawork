package data;

public class FloatDoubleType {

	public static void main(String[] args) {
		// 실수 자료형 
		float fNum = 1.1234567F;  // 소수점 이하 7자리까지 출력
		double dNum = 1.1234567890123456;  // 소수점 이하 16자리까지 출력
		// => 정밀도의 차이
		
		System.out.println(fNum);
		System.out.println(dNum);
		
		
		//유니코드 - 16bit - 2byte
		char unicode1 = '한';  // 한 문자 - 홑따옴표
		System.out.println(unicode1);
		
		char unicode2 = '\uD55C';
		System.out.print(unicode2); // 한
		
		char unicode3 = '\uAE00';
		System.out.println(unicode3); // 글

	}

}
