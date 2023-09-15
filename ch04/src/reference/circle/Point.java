package reference.circle;

// point 자료형
public class Point {
	// 점의 좌표 - 필드
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPointInfo() {
		System.out.println("점(" + x + ", " + y + ")");
	}

}
