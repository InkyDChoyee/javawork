package abstracts.template;

public class CarTest {

	public static void main(String[] args) {
		// Car Car = new Car();  => 추상 클래스는 객체 생성 안됨
		// 추상클래스 타입으로 객체 생성
		Car hisCar = new ManualCar();
		hisCar.run();
		
		System.out.println("==========================");
		
		Car myCar = new AICar();
		myCar.run();
	}

}
