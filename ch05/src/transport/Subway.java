package transport;

public class Subway {
	// 필드
	String lineNumber; // 지하철 노선
	int passenger;  // 승색 수
	int money; 		// 수입
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승객을 태우다 (메서드)
	public void take(int fee) { // 요금을 받음
		this.money += fee;   // 요금을 더해서 수입이 늘어남
		passenger++;		 // 승객수 1명 증가, passenger = passenger + 1
	}
	
	// 지하철의 정보 출력
	public void showSubwayInfo() {
		System.out.printf("%s의 수입은 %,d원 이고, 승객 수는 %d명 입니다\n",
				lineNumber, money, passenger);
	}

}
