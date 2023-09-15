package transport;

// 사람 클래스 (자료형)
public class Person {
	// 필드 (속성)
	String name; // 이름
	int money;   // 가진 돈

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 버스를 탄다
	public void takeBus(Bus bus) {  // 매개변수로 클래스 객체가 들어감
		bus.take(1500);     // 요금지불 -> 요금만큼 가진 돈 감소
		this.money -= 1500; // this.money = this.money - 1500
	}	
	// 지하철을 탄다
	public void takeSubway(Subway subway) {  // 매개변수로 클래스 객체가 들어감
		subway.take(1350);     // 요금지불 -> 요금만큼 가진 돈 감소
		this.money -= 1350; // this.money = this.money - 1350
			
	}
	
	// 사람 정보
	public void showPersonInfo() {
		System.out.printf("%s님의 남은 돈은 %,d원 입니다\n"
				, name, money);
	}
}
