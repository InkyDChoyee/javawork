package regexp;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// 전화 번호 형식 검증하기
		// \d = [0-9], {3,4} = 최소3개, 최대4개
		String regExp = "(02|010)-\\d{3,4}[-]\\d{4}"; // - 경로 슬래시와 구분을 위해 슬래시를 한개 더 붙인다
		String phone = "010-1234-56789";
		// matches()는 검증 결과를 true/false 로 반환
		boolean result = Pattern.matches(regExp, phone);
		
		//System.out.println(result);
		if(result) {   // result == true
			System.out.println("정규식과 일치합니다");
		}else {   // result == false
			System.out.println("정규식과 일치하지 않습니다");
		}
		
		// 계좌 번호
		regExp = "\\d{2}-\\d{3,4}";
		String account = "aa-1234";
		result = Pattern.matches(regExp, account);
		
	
		
		
	}

}
