package singleton.student;

public class Student {
	
	private static int serialNum = 100;
	private int studentId;
	
	public Student() {
		serialNum++;
		studentId = serialNum;
	}
	
	public int getStudentId() {
		return studentId;
	}
}
