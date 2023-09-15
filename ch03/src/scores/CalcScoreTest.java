package scores;

import java.util.Scanner;

public class CalcScoreTest {

	public static void main(String[] args) {
		// 성적 처리 프로그램
		// 입력시 잘못된 입력이 있는 경우 -> 예외처리 try ~ catch 구문 사용
		Scanner sc = new Scanner(System.in);
		boolean sw = true; // 상태 변수
		int studentCount = 0; // 학생수 
		int[] scores = null; // 초기화
		
		while(sw) {
			try { // 오류처리
				System.out.println("============================================");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("============================================");
				
				// 문자를 숫자로 변환 (String, 객체자료형Integer -> 기본자료형int)
				int menu = Integer.parseInt(sc.nextLine());
				
				if(menu == 1) {
					System.out.print("학생수 > ");
					studentCount = Integer.parseInt(sc.nextLine());
					scores = new int[studentCount];  // 학생수 = 점수 배열의 크기
				} else if(menu == 2) {  // 배열에 점수 저장
					for(int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "] > ");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
				} else if(menu == 3) {  // 전체 조회(출력)
					for(int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + (i+1) + "] = " + scores[i]);
					}
				} else if(menu == 4) {  // 통계, 분석
					int sumVal = 0;
					double avg;
					int maxVal = scores[0];
					
					for(int i = 0; i < scores.length; i++) {
						sumVal += scores[i];
						if(scores[i] > maxVal)
							maxVal = scores[i];
					}
					avg = (double)sumVal / scores.length; // 미리 형변환
					System.out.printf("평균점수 = %.2f\n" , avg);
					System.out.println("최고점수 = " + maxVal);
					
				} else if(menu == 5) {
					sw = false;
				} else {
					System.out.println("지원하지 않는 기능입니다");
				}
			}catch(Exception e) {
				System.out.println("옳바른 입력이 아닙니다. 숫자를 입력해주세요");
			}
			
		}// while끝
		System.out.println("프로그램 종료");
		sc.close();
	}//main끝

}//class끝
