package arraycopy;

public class ArrayCopyTest1 {

	public static void main(String[] args) {
		// 배열 복사
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = new int[4];
		
		//List<String> s = new ArrayList<>() {};
		
		// 복사 방법 1. new int[]
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		// 복사 방법 2. clone() 사용
		int[] arr3 = arr2.clone();
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
