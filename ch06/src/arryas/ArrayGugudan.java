package arryas;

public class ArrayGugudan {

	public static void main(String[] args) {
		// 구구단 3단 출력
		int dan = 3;
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + "X" + i + "=" + dan * i);
		}

		System.out.println("==================================");
		
		// 배열을 사용하여 구구단 저장, 출력
		int[] gugudan = new int[9];
		//gugudan[0] = dan * i;
		//System.out.println(gugudan[0]);
		
		for(int i = 1; i < 10; i++) {
			gugudan[i-1] = dan * i;
			System.out.println(gugudan[i-1]);
		}
		
		System.out.println("==================================");
		
		for(int i = 0; i<gugudan.length; i++) {
			gugudan[i] = dan * (i+1);
			System.out.println(dan + " X " + (i+1) + " = " + gugudan[i]);
		}
		System.out.println("==================================");
		
		// 배열 복사
		int[] gugudan2 = new int[9];
		
		// 1. 일반 복사
		for(int i = 0; i < gugudan.length; i++) {
			gugudan2[i] = gugudan[i];
		}
		// 1. 일반 복사 출력
		for(int i = 0; i < gugudan2.length; i++) {
			System.out.println(dan + " X " + (i+1) + " = " + gugudan2[i]);
		}
		System.out.println("==================================");		
		
		// 2. Object 클래스의 clone()
		int[] gugudan3 = gugudan2.clone();
		
		// 2. clone()출력
		for(int i = 0; i < gugudan2.length; i++) {
		System.out.println(dan + " X " + (i+1) + " = " + gugudan3[i]);
		}
	}

}
