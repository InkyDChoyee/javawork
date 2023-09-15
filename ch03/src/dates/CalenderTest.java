package dates;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year + "년");
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println(month + "월");
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date + "일");
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		String[] days = {"일요일", "월요일", "화요일", "수요일", "목요일","금요일","토요일"};
		System.out.println(days[day-1]);
		
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		

	}

}
