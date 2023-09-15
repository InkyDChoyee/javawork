package methods;

public class OneUpTest2 {
	
	// static 키워드를 사용하여 공유 = 정적변수
	static int x = 1;   //전역 공간 (매인 바깥 위쪽)
	// 정적변수는 생성된 후 프로그램이 종료될 때 소멸됨 
	// 특징 = 값을 공유, 누적함

	public static int oneUp() {
		x += 1;
		return x;
	}

		
	public static void main(String[] args) {
		System.out.println(oneUp());  //2
		System.out.println(oneUp());  //3
		System.out.println(oneUp());  //4
		
		// 변수 x의 값 출력
		System.out.println("X = " + x);  // 마지막에 호출되어 반환된 값

	}

}
