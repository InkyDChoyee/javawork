package arrays;

public class FindMaxIdx {
	
	public static void main(String[] args) {
		// 최대값의 위치 찾기
		int[] arr = new int[]{1, 5, 8, 3, 2};
		// 최대값의 위치 = 0번으로 설정
		int maxIdx = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[maxIdx]) {  // 값의 대소 비교
				maxIdx = i;  // 최대값 위치에 i를 저장
				
			}
		}
		
		System.out.println("최대값의 위치 = " + maxIdx);
	}

}
