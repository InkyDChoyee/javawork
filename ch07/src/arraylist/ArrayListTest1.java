package arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//String[] carts = new String[4];
				//carts[0] = "사과"
				//String[] carts = {"사과","콩나물","커피","우유"};
				
				// 리스트 공간 10개 생성
				// 리스트도 순서가 있음 => 인덱싱 가능
				// 중복 허용
				ArrayList<String> carts = new ArrayList<>();
				
				// 자료 추가 add()
				carts.add("사과");
				carts.add("콩나물");
				carts.add("사과");
				carts.add("커피");
				
				// 자료 추가 get()
				System.out.println(carts.get(0));
				System.out.println(carts.get(1));
				
				// 리스트의 크기
				System.out.println("리스트의 크기 : " + carts.size());
				
				// 자료 수정 - set()
				carts.set(2, "바나나");
				
				// 자료 삭제 - remove()
				carts.remove(0);
				
				// 전체 조회
				for(int i = 0; i < carts.size(); i++) {  // 리스트를 처음부터 반복하면서
					String cart = carts.get(i);          // 저장된 자료 1개를 가져와서 cart에 저장
					System.out.print(cart + " ");
				
				}
				System.out.println();
				
				// 향상된 for문 - for(자료형 변수 : 리스트이름){}
				for(String cart : carts)
					System.out.print(cart + " ");
			

	}

}
