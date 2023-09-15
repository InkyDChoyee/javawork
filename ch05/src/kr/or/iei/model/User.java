package kr.or.iei.model;

public class User {
	// 필드(속성)
	private String id;
	private String pwd;
	private String name;
	
	// 기본 생성자 => 매개변수가 있는 생성자를 생성할 시에 생략 불가능
	public User() {
		//System.out.println("User의 생성자 입니다");
	} 
	
	// 매개변수가 있는 생성자
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}// 생성자가 2개가 되기 때문에 각각 명시를 해주어야 한다
	
	// set+필드이름(), get+필드이름()함수
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
}
