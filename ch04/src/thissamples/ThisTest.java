package thissamples;

public class ThisTest {

	public static void main(String[] args) {
		// 생성된 인스턴스 = bDay클래스와 BirthDay의 this속성과 주소가 같음
		BirthDay bDay = new BirthDay();
		bDay.setYear(2023);
		
		System.out.println(bDay);  // 객체 주소
		
		bDay.printThis();  // 같은 객체값이 나옴
		
	}

}
