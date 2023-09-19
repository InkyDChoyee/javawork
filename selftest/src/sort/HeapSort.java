package sort;

public class HeapSort implements Sort{

	@Override
	public void ascedning(int[] arr) {
		System.out.println("HeapSort ascending");
		
	}
	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
		
	}
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort입니다");
	}

	
}
