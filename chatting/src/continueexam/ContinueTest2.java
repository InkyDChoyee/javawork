package continueexam;

public class ContinueTest2 {

	public static void main(String[] args) {
		// 1 ~ 10 자연수 중 홀수만 출력
		
		// 일반 for문
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n==============");
		
		// continue문 활용
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
