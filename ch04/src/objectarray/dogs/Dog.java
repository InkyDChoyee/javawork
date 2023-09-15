package objectarray.dogs;

public class Dog {
	
	// 필드
	private String name;
	private String type;
	
	// 생성자
	public Dog(String name, String type) {  // = setter()
		this.name = name;
		this.type = type;
	}
	/*public void setName(String n) {
		name = n;
	}
	public void setType(String t) {
		type = t;
	}*/
	
	//get()함수
	public String getName() {
		return name;   // 같은 클래스 안에서는 private에 접근 가능
	}
	
	public String getType() {
		return type;
	}
}
