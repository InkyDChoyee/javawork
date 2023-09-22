package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberMap = new MemberHashMap();
		
		// 회원추가
		memberMap.addMember(new Member(1001, "이순신"));
		memberMap.addMember(new Member(1002, "김시민"));
		memberMap.addMember(new Member(1003, "유성룡"));
		// 키는 중복 불허, 값은 변경됨
		memberMap.addMember(new Member(1002, "권율"));   

		System.out.println("총 객체수: " + memberMap.getSize());
		
		// 회원 목록 조회
		memberMap.showAllMember();
		
		System.out.println("===========================");
		
		// 회원 삭제
		memberMap.removeMember(1003);
		memberMap.removeMember(1004);
		
		// 회원 목록 조회
		memberMap.showAllMember();

	}

}
