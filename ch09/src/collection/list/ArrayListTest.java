package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// String 자료형으로 데이터 관리(CRUD)
		// 부모형을 먼저 써주고         자식형을 나중에 써준다
		List<String> vegeList = new ArrayList<>();

		// 자료 생성(Create) - add()
		vegeList.add("양파");   // 0번 인덱스에 저장
		vegeList.add("마늘");   // 1번 인덱스에 저장
		vegeList.add("감자");   // 2번 인덱스에 저장

		// 특정 자료 조회(Read) - get()
		System.out.println(vegeList.get(2));
		// 리스트 객체의 개수
		System.out.println("총 객체수: " + vegeList.size());
		
		// 객체 수정 (Update) - set()
		vegeList.set(2, "상추");
		
		// 객체 삭제 (Delete) - remove()
		if(vegeList.contains("마늘"))
		vegeList.remove("마늘");
		
		// 리스트 객체의 개수
		System.out.println("총 객체수: " + vegeList.size());
		
		// 전체 자료 조회
		for(int i = 0; i < vegeList.size(); i++) {
			//System.out.print(vegeList.get(i) + " ");

			String vege = vegeList.get(i);    // 객체를 가져와서
			System.out.print(vege + " ");         // 출력함
			


		}

	}

}
