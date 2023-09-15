package ifexample;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {
		// 점수에 따른 학점 출력 프로그램
		// 변수 = score(정수형), grade(문자형)
		// 학점 = A(90~100), B(80~90), C(70~80), D(60~70), F(60점 미만)
		
		Scanner scan = new Scanner(System.in);
		
		//1. 입력
		System.out.print("점수를 입력해주세요 > ");
		int score = scan.nextInt();
		char grade;  //char 한 문자(홑따옴표)
		
		//2. 연산
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80 && score < 90) {
			grade = 'B';
		}else if(score >= 70 && score < 80) {
			grade = 'C';
		}else if(score >= 60 && score < 70) {
			grade = 'D';
		}else  {
			grade = 'F';
		}
		scan.close();
		//3. 출력
		System.out.println(grade + "학점 입니다");
	}

}
