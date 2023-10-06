package continueexam;

public class ContinueTest {

	public static void main(String[] args) {
		// break문 - 1~10 까지 자연수 중 6보다 작은 수 출력
		for(int i = 1; i <= 10; i++) {
			if(i > 5) {
				break;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n===================");
		
		// continue문 - 1~10 까지 자연수 중 5와 8을 제외한 수 출력
		for(int i = 1; i <= 10; i++) {  
			if(i == 5 || i == 8) {		// 반복하다가 continue키워드를 만나면
				continue;      	// 이후의 코드를 실행하지 않고 돌아가서 조건식이나 조건식을 수행함    
			}
			System.out.print(i + " ");
		}
		
	}

}
