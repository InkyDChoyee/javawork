package reference.circle;

public class Circle {
	//int x;
	//int y;
	Point center;  // Point center = null
	int radius;
	
	public Circle(int x, int y, int radius) {
		//this.x = x;
		//this.y = y;
		center = new Point(x,y);  // center 객체 생성
		this.radius = radius;
	}
	
	public void showCircleInfo() {
		System.out.println("원의 중심점은 (" + center.x + ", " + center.y + ")"
							+ "반지름은 " + radius + "입니다" ); // x, y -> center소속으로 변경됨
	}
}
