package ifexample;

import java.util.Scanner;

public class ScoreCalculrator {

	public static void main(String[] args) {
		// 학점 계산 프로그램
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();  // 점수를 입력받음
		String lv; // 지역변수 초기화
		
		if(score >= 90) {
			lv = "A";
		}else if(score >= 80 && score < 90) {
			lv = "B";
		}else if(score >= 70 && score < 80) {
			lv = "C";
		}else if(score >= 60 && score < 70) {
			lv = "D";
		}else{
			lv = "F";
		}
		
		System.out.println(lv + "학점 입니다");
		
		scan.close();
	

	}

}
