package collection.list;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// String 자료형으로 데이터 관리(CRUD)
		List<String> vegeList = new Vector<>();

		// 자료 생성(Create) - add()
		vegeList.add("양파");   // 0번 인덱스에 저장
		vegeList.add("마늘");   // 1번 인덱스에 저장
		vegeList.add("감자");   // 2번 인덱스에 저장
		
		// 객체 삭제 (Delete) - remove()
		if(vegeList.contains("양파"))
			vegeList.remove("양파");

		// 리스트 객체의 개수
		System.out.println("총 객체수: " + vegeList.size());

		// 전체 자료 조회
		for(String vege : vegeList)
			System.out.print(vege + " ");
	}
}

