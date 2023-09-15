package reference.circle;

public class CircleTest {

	public static void main(String[] args) {
		// 
		/*
		Circle_17 c1 = new Circle_17(2, 3, 5);
		c1.showCircle_17Info();

		Circle_17 c2 = new Circle_17(10, 12, 10);
		c2.showCircle_17Info();
		*/
		
		// 객체 배열
		/*
		Circle_17[] circle = {
				new Circle_17(2,3,5),  // circle[0]
				new Circle_17(10, 12, 10), // circle[1]
				new Circle_17(-10, -12, 10) // circle[2]
		};
		*/
		
		Circle[] circle = new Circle[3];
		circle[0] = new Circle(2,3,5);  // circle[0]
		circle[1] = new Circle(10, 12, 10); // circle[1]
		circle[2] = new Circle(-10, -12, 10); // circle[2]
		
		// 특정 인덱스 조회
		circle[1].showCircleInfo();
		System.out.println("=============================");
		
		// 전체 조회(출력)
		for(int i = 0; i < circle.length; i++) {
			circle[i].showCircleInfo();
		}
	}

}
