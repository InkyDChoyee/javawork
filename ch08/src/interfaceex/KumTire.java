package interfaceex;

// Tire 인터페이스를 구현한 클래스 - KumTire 구현클래스
public class KumTire implements Tire{

	@Override
	public void roll() {
		System.out.println("금타이어가 굴러갑니다");
	}

}
