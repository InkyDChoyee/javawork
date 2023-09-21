package nestedclass.interfaces;

public class ButtonTest {

	public static void main(String[] args) {
		// 버튼 객체 생성
		Button button = new Button();

		// 전화걸기 객체 생성
		CallListener call = new CallListener();
		MessageListener Message = new MessageListener();

		button.setListener(call);
		button.touch();

		// 문자보내기 구현
		button.setListener(new MessageListener());  // 이름 없이 생성
		button.touch();

		// 사진찍기 구현
		button.setListener(new Button.OnClickListener() { // 익명 객체로 구현
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다");
			}
		});
		button.touch();
		
		// 쇼핑 - 구매 구현
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("상품을 구매합니다");
			}
		});
		button.touch();
	}

}
