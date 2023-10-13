package banking.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

// Account를 생성, 조회, 수정, 삭제하는 클래스
// DAO = Data Access Object
public class AccountDAO {
	
	Scanner scanner = new Scanner(System.in);
	
	// 계좌 생성 (creatAccount)
		public void creatAccount() {
			System.out.println("-----------------------------------");
			System.out.println("             계좌 생성");
			System.out.println("-----------------------------------");

			while(true) {

				System.out.println("계좌 번호(형식-숫자만:00-00-000 > ");
				String ano = scanner.nextLine();

				String regExp = "\\d{2}-\\d{2}-\\d{3}";
				boolean result = Pattern.matches(regExp, ano);

				if(result) {
					// 중복계좌가 있는지 체킹
					if(findAccount(ano) != null) {  // 중복계좌가 있으면
						System.out.println("중복계좌입니다, 다시 입력해주세요");
					}else {  // 중복 계좌가 없으면
						while(true) {
							System.out.print("계좌주(영어, 한글) > ");
							String owner = scanner.nextLine();
							
							regExp = "[a-zA-Z가-힣]+";  // 영어, 한글만 사용 가능
							result = Pattern.matches(regExp, owner);
							
							if(result) {
								System.out.print("초기 입금액 > ");
								int balance = Integer.parseInt(scanner.nextLine());
								
								// db작업
								
								System.out.println("결과 : 계좌가 생성되었습니다");
								break;
							}else {
								System.out.println("계좌주는 한글과 영문만 가능합니다. 다시 입력해주세요");
							}
						}// 내부 while 끝
						break;
					}
				}else {
					System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요");
				}
			}// 외while끝
		}// creatAccount() 끝

		// 계좌 목록 (getAccountList)
		public void getAccountList(){
			System.out.println("-----------------------------------");
			System.out.println("             계좌 목록");
			System.out.println("-----------------------------------");
			
			List<Account> accountList = new ArrayList<>();
			// 계좌목록 조회
			for(int i = 0; i < accountList.size(); i++) {

				Account accList = accountList.get(i);   
				System.out.print("계좌번호: " + accList.getAno() + "\t");
				System.out.print("계좌주: " + accList.getOwner() + "\t");
				System.out.println("잔고: " + accList.getBalance());

			}
		}// getAccountList() 끝

		// 입금 (deposit)
		public void deposit() {
			System.out.println("-----------------------------------");
			System.out.println("               입금");
			System.out.println("-----------------------------------");

			while(true) {

				System.out.println("계좌 번호(형식-숫자만:00-00-000 > ");
				String ano = scanner.nextLine();

				String regExp = "\\d{2}-\\d{2}-\\d{3}";
				boolean result = Pattern.matches(regExp, ano);

				if(result) {
					if(findAccount(ano) != null) {
						Account account = findAccount(ano);

						System.out.print("입금액 > ");
						int money = Integer.parseInt(scanner.nextLine());


						account.setBalance(account.getBalance() + money);
						System.out.println("결과 : 정상 처리되었습니다");
						break; // while문 빠져나옴
					}else {
						System.out.println("결과: 계좌가 없습니다. 다시 입력해주세요");
					}
				}else {
					System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요");
				}
			}// while 끝
		}// deposit() 끝

		// 출급 (withdraw)
		public void withdraw() {
			System.out.println("-----------------------------------");
			System.out.println("              출금");
			System.out.println("-----------------------------------");

			while(true) { // 계좌번호 재입력

				System.out.println("계좌 번호(형식-숫자만:00-00-000 > ");
				String ano = scanner.nextLine();

				String regExp = "\\d{2}-\\d{2}-\\d{3}";
				boolean result = Pattern.matches(regExp, ano);

				if(result) {
					if(findAccount(ano)!=null) {
						Account account = findAccount(ano);

						while(true) { // 출금액 재입력
							System.out.print("출금액 > ");
							int money = Integer.parseInt(scanner.nextLine());

							if(account.getBalance()<money) { // 출금액이 잔액보다 많으면
								System.out.println("잔액이 부족합니다");
							}else if(account.getBalance() == 0) {
								System.out.println("잔고가 없습니다");
								return;
							}else {
								account.setBalance(account.getBalance() - money);
								System.out.println("결과 : 정상 처리되었습니다");
								break;
							}
						}// 안쪽 while 끝
						break;
					}else {
						System.out.println("결과: 계좌가 없습니다. 다시 입력해주세요");
					}
				}else {
					System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요");

				}
			}//바깥쪽 while끝
		}

		// 계좌 삭제 (removeAccount)
		public void removeAccount() {
			System.out.println("-----------------------------------");
			System.out.println("            계좌 삭제");
			System.out.println("-----------------------------------");

			while(true) {
				System.out.println("계좌 번호(형식-숫자만:00-00-000 > ");
				String ano = scanner.nextLine();

				String regExp = "\\d{2}-\\d{2}-\\d{3}";
				boolean result = Pattern.matches(regExp, ano);

				if(result) {
					if(findAccount(ano) != null) {
						// db처리
						break;
					}else {
						System.out.println("결과: 없는 계좌입니다. 다시 입력해주세요");
					}
				}else {
					System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요");
				}
			}
		}

		// 특정 계좌 검색
		public void selectAccount() {
			System.out.println("-----------------------------------");
			System.out.println("            계좌 검색");
			System.out.println("-----------------------------------");

			while(true) {
				System.out.println("계좌 번호(형식-숫자만:00-00-000 > ");
				String ano = scanner.nextLine();

				String regExp = "\\d{2}-\\d{2}-\\d{3}";
				boolean result = Pattern.matches(regExp, ano);

				if(result) {
					if(findAccount(ano) != null) {
						System.out.println("------------------ 계좌 정보를 가져왔습니다 ------------------");
						System.out.println("계좌번호 : " + findAccount(ano).getAno() + "  |  "
								+ "계좌주 : " + findAccount(ano).getOwner() + "  |  "
								+ "잔고 : " + findAccount(ano).getBalance());
						System.out.println("-------------------------------------------------------");
						break;
					}else {
						System.out.println("결과: 없는 계좌입니다. 다시 입력해주세요");
					}
				}else {
					System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요");
				}
			}


		}


		// 계좌 찾기 (findAccount)
		public Account findAccount(String ano) {
			Account account = null;

			//db처리
			
			return account;
		}// findAccount() 끝

}
