package methods;

public class MathTest2 {

	public static void main(String[] args) {
		// 주사위 10번 던지기
		for(int i = 1; i <=10; i++) {
			int dice = (int)(Math.random()*6) + 1;
			System.out.println( i + "번째 주사위의 눈 = " + dice);
		}
		
		System.out.println("=======================");
		
		// 배열에서 문자열 랜덤하게 추출
		String[] word = {"나", "너", "우리", "나라"};
		
		System.out.println(word[0]);
		
		// 전체출력
		for(int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		
		int idx = (int)(Math.random()*word.length);
		System.out.println(word[idx]);
		
	}

}
