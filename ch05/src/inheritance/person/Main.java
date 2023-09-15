package inheritance.person;

public class Main {

	public static void main(String[] args) {
		// lee가 Person 필드를 사용할 수 있음
		Engineer lee = new Engineer("봉구",33,111);
		/*lee.name = "봉구";
		lee.age = 33;
		lee.companyId = 111;*/
		
		System.out.println("이름 : " + lee.name);
		System.out.println("나이 : " + lee.age);
		System.out.println("사번 : " + lee.companyId);
	}

}
