package inheritance.q4;

public class Engineer extends Employee{
	
	//원인 = 생성자를 상속받지 않음 -> super()이용 상속받음
	
	public Engineer(String name, String grade, String skillSet) {
		super(name, grade);  // Engineer에 대한 정의가 빠짐
		this.skillSet = skillSet;

	}

	private String skillSet;
	
	public String getSkillSet() {
		return skillSet;
	}
	
	public void setSkillSet(String skillSet) { // 오타처리
		this.skillSet = skillSet;
	}
}
