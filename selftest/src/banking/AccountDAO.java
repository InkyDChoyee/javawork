package banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JDBCUtil;

// Account를 생성, 조회, 수정, 삭제하는 클래스
// DAO = Data Access Object
public class AccountDAO {
	Connection conn; // db 연결 객체 선언
	PreparedStatement pstmt;  // sql 처리
	ResultSet rs;
	Scanner scanner = new Scanner(System.in);

	// 계좌 생성 (creatAccount)
	public void creatAccount() {
		System.out.println("-----------------------------------");
		System.out.println("             계좌 생성");
		System.out.println("-----------------------------------");

		while(true) {

			System.out.println("계좌 번호(형식-숫자만:00-00-000 > ");
			String regExp = "\\d{2}-\\d{2}-\\d{3}";
			String ano = scanner.nextLine();

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
							try {
								conn = JDBCUtil.getConnection(); //db연결
								String sql = "INSERT INTO account(ano, owner, balance) "
										+ "VALUES(?, ?, ?)";
								pstmt = conn.prepareStatement(sql);
								// 값 설정
								pstmt.setString(1, ano);
								pstmt.setString(2, owner);
								pstmt.setInt(3, balance);
								// sql 실행
								pstmt.executeUpdate();
								System.out.println("결과 : 계좌가 생성되었습니다");
							} catch (SQLException e) {
								e.printStackTrace();
							} finally {
								JDBCUtil.close(conn, pstmt);
							}
							break;
						}else {
							System.out.println("계좌주는 한글과 영문만 가능합니다. 다시 입력해주세요");
						}
					}// 내부 while 끝
					break;
				}
				//			}else {
				//				System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요");
			}
		}// 외while끝
	}// creatAccount() 끝

	// 계좌 목록 (getAccountList)
	public void getAccountList(){
		System.out.println("-----------------------------------");
		System.out.println("             계좌 목록");
		System.out.println("-----------------------------------");
		// 계좌를 저장할 어레이리스트 생성
		List<Account> accountList = new ArrayList<>();
		// db 작업
		try {
			conn = JDBCUtil.getConnection(); //db연결
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			// 검색처리
			rs = pstmt.executeQuery();
			while(rs.next()) {// 다음 데이터가 있는 동안 반복
				// account 객체 생성
				String ano = rs.getString("ano");   // db에서 가져온 ano
				String owner = rs.getString("owner");   // db에서 가져온 ano
				int balance = rs.getInt("balance");   // db에서 가져온 ano
				Account account = new Account(ano, owner, balance);

				accountList.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}


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
					int balance = account.getBalance() + money;
					// db처리
					try {
						conn = JDBCUtil.getConnection(); //db연결
						String sql = "UPDATE account SET balance = ? WHERE ano = ?";

						pstmt = conn.prepareStatement(sql);

						pstmt.setInt(1, balance);
						pstmt.setString(2, ano);
						// sql 실행
						pstmt.executeUpdate();
						System.out.println("결과 : 정상 처리되었습니다");
						break; // while문 빠져나옴
					} catch (SQLException e) {
						e.printStackTrace();
					} 
				}else {
					System.out.println("결과: 계좌가 없습니다. 다시 입력해주세요");
				}
			}else {
				System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요");
			}
		}// while 끝
	}// deposit() 끝

	// 출금 (withdraw)
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
						int balance = account.getBalance() - money;

						if(account.getBalance()<money) { // 출금액이 잔액보다 많으면
							System.out.println("잔액이 부족합니다");
						}else if(account.getBalance() == 0) {
							System.out.println("잔고가 없습니다");
							return;
						}else {
							try {
								conn = JDBCUtil.getConnection(); //db연결
								String sql = "UPDATE account SET balance = ? WHERE ano = ?";

								pstmt = conn.prepareStatement(sql);

								pstmt.setInt(1, balance);
								pstmt.setString(2, ano);
								// sql 실행
								pstmt.executeUpdate();
								System.out.println("결과 : 정상 처리되었습니다");
								break; // while문 빠져나옴
							} catch (SQLException e) {
								e.printStackTrace();
							} 
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
					try {
						conn = JDBCUtil.getConnection();
						String sql = "DELETE FROM account WHERE ano = ?";
						
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, ano);
						// sql 실행
						pstmt.executeUpdate();
						System.out.println("결과 : [" + ano + "] 계좌가 삭제되었습니다");
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
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
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			//1개 검색 처리
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn,  pstmt, rs);
		}
		return account;
	}// findAccount() 끝
}
