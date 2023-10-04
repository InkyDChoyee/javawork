package jsondata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParseExample {

	public static void main(String[] args) {

		try {
			// 파일로부터 JSON 열기
			// 보조스트림에 기반스트림 연결
			Reader reader = new FileReader("C:/File/member.json");
			BufferedReader br = new BufferedReader(reader);
			
			String json = br.readLine();  // 1행 읽기
			br.close();
			
			// System.out.println(json);
			
			// json 파싱(해석) - 문자열로 출력됨
			JSONObject member = new JSONObject(json);
			System.out.println("id: " + member.getString("id"));
			System.out.println("name: " + member.getString("name")); // 문자형
			System.out.println("age: " + member.getInt("age"));   // 정수형
			
			
			// 객체 속성 정보 읽기
			JSONObject tel = member.getJSONObject("tel");
			System.out.println("home: " + tel.getString("home"));
			System.out.println("mobile: " + tel.getString("mobile"));
			
			// 배열 속성 정보 읽기
			JSONArray skill = member.getJSONArray("skill");
			System.out.print("skill: ");
//			for(int i = 0; i < skill.length(); i++) {
//				System.out.print(skill.get(i) + ", ");
//			}
			for(Object obj : skill)
				System.out.print(obj + ", ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
