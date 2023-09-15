package ifexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 입장객 수에 따른 줄(형)수 계산
		// 변수 = customer고객수, column(행수), row(줄수)
		Scanner sc = new Scanner(System.in);  // 입력 개체 sc 생성 
		
		System.out.print("입장객 수 입력 : ");
		int customer = sc.nextInt();
		
		System.out.print("좌석 열 수 입력 : ");
		int column = sc.nextInt();
		
		int row = 0; //줄 수 
		
		// 연산 처리 (if ~ else문)
		if(customer % column == 0) {  //나누어 떨어지면
			row = customer / column;  //row = 몫
		}else {  //나머지가 있으면
			row = (customer / column) + 1;
		}
		// row = customer / column;
		System.out.println(row + "줄이 필요합니다.");

		sc.close();
	}

}
