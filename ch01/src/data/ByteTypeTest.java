package data;

public class ByteTypeTest {

	public static void main(String[] args) {
		// byte 관련 자료형 
		// 정수 자료형 = byte, short, int, long
		
		// byte의 범위 = 8 bit = -128 ~ 127 (256개)
		byte bData1 = -128;
		System.out.println(bData1);
		byte bData2 = 127; // => 128을 넣을 경우 Type mismatch Error가 난다 = 범위초과
		System.out.println(bData2);
		
		// short의 범위 = 16 bit = -32768 ~ 32767
		short sData1 = 128;
		System.out.println(sData1);
		short sData2 = 32767; // => 32768을 넣을 경우 Type mismatch Error가 난다 = 범위초과
		System.out.println(sData2);
		
		System.out.println("========================");

		// 10진수, 2진수, 16진수 출력
		// 객체의 이름과 주소
		ByteTypeTest test = new ByteTypeTest();
		System.out.println(test);  // 타입의 이름은 패키지부터 시작한다
		
		int num = 10; // 10진수
	    int bNum = 0b1010; // 2진수를 표기할 때 접두어로 0b를 붙임
	    int hNum = 0xA; // 16진수를 표기할 때 접두어로 0x를 붙임
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(hNum);
		
		// 10진수 5 -> 2진수로 표기 - 32bit
		// 10진수 -5 -> 2진수로 표기 - 32bit
		// 음수를 만드는 방법 = 1. 보수로 만듬 -> 2. 1을 더함
		int val1 = 0b00000000000000000000000000000101;
     // int val2 = 0b11111111111111111111111111111010; = -6
	    int val2 = 0b11111111111111111111111111111011;
	    System.out.println(val1);
	    System.out.println(val2);

	}

}
