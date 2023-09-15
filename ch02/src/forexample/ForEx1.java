package forexample;

public class ForEx1 {

	public static void main(String[] args) {
		/*
		for(초기값; 종료값; 증감값){
		    실행문
		}
		 */
		// 1 ~ 10 출력
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//아스키 코드값 알파벳 출력
		//'A' - 65, 'a' - 97, '0' - 48
		// 코드값 확인
		char alpha = 'A';
		System.out.println(alpha);
		
		int val = 65;
		System.out.println((char)val); // = 코드값을 문자화
		
		for(int num=65; num<=90; num++) {
			System.out.print((char)num + " ");
		}
		System.out.println();
		
		// 영어 아스키 코드값 (65 부터 12까지 출력)
		for(char ch = 65; ch<123; ch++) {
			System.out.print((char)ch + " ");
		}
		System.out.println();
		
		// 한글 유니코드 값 (12593 ~ 12684)
		for(char han = 12593; han<12685; han++) {
			System.out.print((char)han + " ");
		}
	}

}
