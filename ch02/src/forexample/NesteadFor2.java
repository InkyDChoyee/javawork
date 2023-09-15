package forexample;

public class NesteadFor2 {

	public static void main(String[] args) {
		// 숫자 1증가
		/*                      첫번째 열
		    1  2  3  4  5  ---> (5*0)+1  5 = 열의 수
		    6  7  8  9  10 ---> (5*1)+1  0~3 = 행의 수 i값
		    11 12 13 14 15 ---> (5*2)+1
		    16 17 18 19 20 ---> (5*3)+1 
		 */
		
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				int num = 5 * i + j;
				if (num > 23)
					break;
				System.out.print(num +" ");
			}
			System.out.println();
		}

	}

}
