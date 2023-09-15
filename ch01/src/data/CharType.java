package data;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - char, String
		// 복제 = alt + ctrl + 방향키 아래
		// ASCIT(American Standard Code for ~)
		char alpha = 'A';
		System.out.println(alpha); // A
		System.out.println((int)alpha); // 65 = 아스키 코드 값 // 형변환
		
		int alpha2 = 66;
		System.out.println(alpha2); // 66
		System.out.println((char)alpha2); // B
                          
		//유니코드 - 16bit - 2byte
		char unicode1 = '한';  // 한 문자 - 홑따옴표
		System.out.println(unicode1);
		
		char unicode2 = '\uD55C';
		System.out.print(unicode2); // 한
		
		char unicode3 = '\uAE00';
		System.out.println(unicode3); // 글
	}

}
