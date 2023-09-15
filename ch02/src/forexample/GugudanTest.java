package forexample;

public class GugudanTest {

	public static void main(String[] args) {
		// 단일 for()
		/*
          3 X 1 = 3
          3 X 2 = 6
          3 X 3 = 9
          ...
          3 X 8 = 24
          3 X 9 = 27
        */
		
		int dan = 4;
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " X " + i + " = " + (i*dan));
		}
	}

}
