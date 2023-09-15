package methods;

public class OneUpTest {

	// 1증가 하는 함수 정의
	public static int oneUp() {
		int x = 1; // 지역 변수
		x++;  // x += 1
		return x;
	}

	
	public static void main(String[] args) {
		System.out.println(oneUp());  // 2
		System.out.println(oneUp());  // 2? 3? => 2
		/* 지역변수의 생명주기(scope) = 함수나 제어문의 블럭 안에서 생성되고
		                          호출된 뒤에 소멸함             */
		//System.out.println(x);  // oneUp()의 'x' = 소멸한 변수
		//                                        =  main함수 입장에서 선언되지 않은 변수
		 
	
		
	}

}
