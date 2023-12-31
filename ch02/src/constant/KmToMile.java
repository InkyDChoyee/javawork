package constant;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		// km를 입력받아서 mile로 출력하는 프로그램
		// 변환상수 : 1 mile = 1.609344 km
		// 변수 = kph, mph
		Scanner scanner = new Scanner(System.in);
		
		final double RATE_KPH_MPH = 1.609344;
		double mph = 0.0;
		
		System.out.print("구속을 입력하세요(km/h) > ");
		double kph = scanner.nextDouble();  // 실수 -> 0.0으로 초기화
		
		// 연산
		// mile = km / 변환상수
		mph = kph / RATE_KPH_MPH;
		
		//출력
		//System.out.println("공의 속도는 " + mph + "mile 입니다");
		System.out.printf("공의 속도는 %.2f [MPH]입니다", mph);
		
		scanner.close();
	}

}
