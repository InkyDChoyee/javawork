package switchexample;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// 등수에 따른 메달 출력
		// 1등 = 금메달, 2등 = 은메달, 3등 = 동메달
		// 변수 = rank
		
		int rank = 1;
		
		switch(rank) {  //switch(변수)
		case 1:  // :으로 끝
			System.out.println("금메달입니다.");
			break;  // break 필요 => 없으면 다음 브레이크 까지 출력
		case 2:
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default:  // case에 없는 경우 처리 (if else와 같은 기능)
			System.out.println("매달이 없습니다");
			break;
		} // {} = 하나

	}

}
