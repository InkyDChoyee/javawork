package input;

import java.util.Scanner; // Scanner의 진짜 이름

public class BonusPointTest {

	public static void main(String[] args) {
		// 고객의 이름, 구매 금액 입력 -> 구매 포인트 출력 
		// 구매포인트(bonusPoint) = 상품가격(price) * 보너스 포인트 적립율(bonusRatio)
		
		// 변수 선언 = 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객의 이름을 입력하시오 : ");
		String customer = sc.nextLine(); // 사용자 -> 이름 입력
		
		System.out.print("구매 금액을 입력하시오 : ");
		int price = sc.nextInt();  // 사용자 -> 금액 입력
		
		double bonusRatio = 0.02;
		int bonusPoint = 0;
		
		// 연산 = 처리
		bonusPoint = (int)(price * bonusRatio); // 정수형으로 강제 형변환 함
		
		// 출력
		System.out.println(customer + " 님의 보너스 포인트는 " + bonusPoint + "점 입니다");
		
		sc.close();
		

	}

}
