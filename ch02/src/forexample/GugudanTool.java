package forexample;

public class GugudanTool {

	public static void main(String[] args) {
		// 구구단 전체 출력
		
		for(int i = 2; i<=9; i++) {  // 단(행)
			System.out.println("    "+ i + "단    ");
			for(int j = 1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println("===========");
		}
		
		// 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		/*
		   2 X 1 = 2
		   2 X 2 = 4
		   
		   3 X 1 = 3
		   3 X 2 = 6
		   3 X 3 = 9
		   
		   4 X 1 = 4
		   4 X 2 = 8
		   4 X 3 = 12
		   4 X 4 = 16
		   .
		   .
		   .
		 */
		for(int i = 2; i<=9; i++) {  // 단(행)
			System.out.println("    "+ i + "단    ");
			for(int j = 1; j<=i; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println("===========");
		}
	
	}
}
