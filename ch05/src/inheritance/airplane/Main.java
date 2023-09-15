package inheritance.airplane;

public class Main {

	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.이륙();
		sa.비행();
		
		// 모드 변경 -> 클래스 이름으로 직접 접근
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC; // 모드 변경
		sa.비행();
		
		sa.flyMode = SuperSonicAirPlane.NORMAL; // 모드 변경
		sa.비행();
		
		sa.착륙();

	}

}
