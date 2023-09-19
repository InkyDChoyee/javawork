package sort;

public interface Sort {

	
	public void ascedning(int[]arr);
	public void descending(int[]arr);
	
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다");
	}

}
