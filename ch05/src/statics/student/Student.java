package statics.student;

public class Student {
	
	static int serialNum = 1000; // 클래스 변수(필드)
	int id; 	 // 인스턴스 변수(필드)
	String name; // 인스턴스 변수(필드)

	//public Student() {
	//	serialNum++;
	//	id = serialNum;
	//}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}