package hiding.accounts;

// 은행 통장 계좌 자료형 생성
// 정보 은닉, 캡슐화 = private 사용
public class Account {
	// 필드
	private String ano;	// 계좌 번호
	private String owner; // 계좌주
	private int balance; // 잔고
	
	// 기본 생성자 => 사용중일 때에는 생략 불가능!! / 단독일 때에만 생략 가능
	public Account() {}
	
	// 매개변수가 있는 생성자 => setter를 쓰지 않겠다!
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// set(), get() 메서드 생성
	// 만드는 방법 : set + 필드이름 ()
	
	// 입력 저장
	public void setAno(String a) {  // 매개변수로 계좌번호 전달, 입력
		ano = a;
	}
	public void setOwner(String own) {  // 매개변수로 계좌번호 전달, 입력
		owner = own;
	}
	public void setBalance(int bal) {  // 매개변수로 계좌번호 전달, 입력
		balance = bal;
	}
	
	// 반환 출력
	public String getAno() {
		return ano;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
}
