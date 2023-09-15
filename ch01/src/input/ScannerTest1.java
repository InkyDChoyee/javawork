package input;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// 입력 처리 - Scanner 클래스 사용
		// 문자열인 경우 = nextLine() 사용
		// 숫자인 경우 = nextInt() 사용
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = scanner.nextLine(); // 문자열 입력
		
		System.out.print("나이 입력: ");
		int age = scanner.nextInt(); // 정수 입력
		
		
		System.out.println("이름 : " + name + ", 나이: " + age);
		
		scanner.close(); // scanner = 입출력 클래스 => 네트워크 개념 => 닫아주어야 한다

	}

}
