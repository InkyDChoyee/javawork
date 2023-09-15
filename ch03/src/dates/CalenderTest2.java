package dates;

import java.util.Calendar;

public class CalenderTest2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// 지나온 시간 측정
		// 1970년 1월 1일 자정 이후부터 측정 - 밀리초
		// 유닉스 시스템 소프트웨어 개시된 시간
		// 1/1억(ns) > 1/백만(마이크로즈) > 1/1000(ms) > s(1초)
		long passedTime = cal.getTimeInMillis();
		System.out.println(passedTime);
		
		// 밀리초를 일로 환산
		passedTime = passedTime/(24*60*60*1000);
		System.out.println(passedTime);
		
		// 시작일, 종료일 객체 설정
		Calendar startDay = Calendar.getInstance();
		Calendar toDay = Calendar.getInstance();
		
		startDay.set(2023, 9, 1); // 시작일 설정
		toDay.set(2023, 9, 15);  // 종료일 설정
		
		// 초로 환산
		long betweenTime = toDay.getTimeInMillis() - startDay.getTimeInMillis();
		
		// 일로 환산
		betweenTime = betweenTime / (24*60*60*1000);
		System.out.println(betweenTime + "일 지났습니다");
	}

}
