package collection.Map;

// ctrl + shift + O
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// 학생의 이름과 점수를 저장할 HashMap 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("이순신", 95);   // key, value
		map.put("김시민", 87);
		map.put("유성룡", 79);
		map.put("이순신", 85);
		
		// 특정 객체 조회
		System.out.println(map.get("유성룡"));   // key값을 넣으면 value가 나옴
		
		// 객체 삭제
		if(map.containsKey("유성룡")) {   // 객체가 맵 안에 포함되었다면
			map.remove("유성룡");         // 키를 삭제 -> 값도 삭제
		}
		
		// 총 객체 수
		System.out.println("총 객체수 : " + map.size());
		
		// 전체 조회
		Set<String> keySet = map.keySet();   // key값 객체를 생성
		Iterator<String> ir = keySet.iterator();   // key값으로 반복할 반복자 객체 생성
		while(ir.hasNext()) {   // 객체 수만큼 반복
			String key = ir.next();    // 객체가 있으면 1개씩 가져옴
			Integer value = map.get(key);     // 키를 매개로 값을 가져옴 
			System.out.println(key + ":" + value);
		}
		
		System.out.println("===========================");
		
		// 전체 조회2
		for(String key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}
		
		// 객체 자체를 출력 - {key = value, } 형태 = dictionary형태
		System.out.println(map);

	}

}
