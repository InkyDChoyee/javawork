package inheritance.transprot;

public class Main {

	public static void main(String[] args) {
		// Person 객체 생성
		Person sohee = new Person("박소희", 10000);
		Person daeho = new Person("이대호", 20000);
		
		// Bus 객체 생성
		Bus bus100 = new Bus("100번 버스");
		
		// Taxi 객체 생성
		Taxi kakaoTaxi = new Taxi("카카오택시");
		
		sohee.take(bus100, 1500);
		daeho.take(bus100, 1500);
		daeho.take(kakaoTaxi, 6400);
		
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		bus100.showInfo();
		kakaoTaxi.showInfo();
		
	}

}
