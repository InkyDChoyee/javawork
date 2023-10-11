package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserSelectAllTest {

	public static void main(String[] args) {
		Connection conn = null;    // 네트워크 연결 클래스
		PreparedStatement pstmt = null;    // sql을 처리해주는 인터페이스
		try {
			// JDBC 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기 - getConnection(url, user, password)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공!");
			
			// db 처리 작업
			// 매개변수화된 sql문 작성
			String sql = "SELECT * FROM users";
			pstmt = conn.prepareStatement(sql);
			
			// sql 실행 - 검색
			ResultSet rs = pstmt.executeQuery();
			// user를 담을 ArrayList 생성
			List<User> userList = new ArrayList<>();
			
			while(rs.next()) {
				// db에서 user를 꺼내옴
				User user = new User();
				user.setUserId(rs.getString("userid"));  // userid가 user객체에 들어감
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				// 리스트에 user객체 저장
				userList.add(user);
				
			} // while 끝
			
			for(int i = 0; i < userList.size(); i++) {
				User user = userList.get(i);
				System.out.println("-----------user" + (i+1) + "------------");
				System.out.println("userID: " + user.getUserId());
				System.out.println("userName: " + user.getUserName());
				System.out.println("userPW: " + user.getUserPassword());
				System.out.println("userAge: " + user.getUserAge());
				System.out.println("userEmail: " + user.getUserEmail());
				System.out.println("----------------------------");
				System.out.println(" ");
			}
			
			
			// 스택구조이므로 종료 순서는 들어간 순서의 역순으로 닫아준다(rs -> pstmt -> conn)
			rs.close();
			pstmt.close();
									
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{    // 반드시 수행되는 구간
			if(conn != null) {  // 연결이 되어 있다면
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
