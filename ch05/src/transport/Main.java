package transport;

public class Main {

	public static void main(String[] args) {
		
		// 사람 객체 생성
		Person p1 = new Person("이강인", 10000);
		Person p2 = new Person("손흥민", 20000);
		
		// 버스 객체 생성
		Bus bus100 = new Bus(100);
		Bus bus2312 = new Bus(2312);
		
		// 지하철 객체 생성
		Subway green = new Subway("2호선");
		
		
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p1.takeBus(bus2312);
		
		p1.takeSubway(green);
		p2.takeSubway(green);
		
		
		// 정보 출력
		p1.showPersonInfo();
		p2.showPersonInfo();
		System.out.println("=================================");
		bus100.showwBusInfo();
		bus2312.showwBusInfo();
		System.out.println("=================================");
		green.showSubwayInfo();
		
	}

}
