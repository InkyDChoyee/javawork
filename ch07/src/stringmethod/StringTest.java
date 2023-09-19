package stringmethod;

public class StringTest {

	public static void main(String[] args) {
		// String 클래스를 사용하여 문자를 연결하면 내부의 문자열이 변경되지 않아, 주소 값이 달라져 데이터의 낭비가 일어난다
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값 = " + System.identityHashCode(javaStr));
		
		System.out.println("================================");
		
		// 문자 연결 메서드 - concat()
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("연결 후 문자열 주소값 = " + System.identityHashCode(javaStr));
		
	}

}
