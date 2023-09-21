package interfaceex;

public class Car {
	// 필드 - 인터페이스형 타입 변수 선언
	Tire frontLeftTire;  // Tire frontLeftTire = null;
	Tire frontRightTire;
	Tire backLeftTire;
	Tire backtRightTire;

	public Car() {
		frontLeftTire = new HanTire();
		frontRightTire = new HanTire();
		backLeftTire = new KumTire();
		backtRightTire = new KumTire();
	}

	// 메서드
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backtRightTire.roll();
	}
}
