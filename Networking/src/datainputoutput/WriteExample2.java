package datainputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) {
		
		try {
			// 출력 스트림 객체 생성
			OutputStream os = new FileOutputStream("C:/File/test2.db");  // 절대 경로
		 
			// 배열로 데이터 생성
			byte [] array = {10, 20, 30, 40, 50};
			
			// 배열의 모든 바이트를 쓰기
			os.write(array);
			
			os.flush();   // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
			os.close();   // 출력 스트림을 닫아서 사용한 메모리를 해제
			
		} catch (IOException e) {   // 데이터 통신에 대한 에러
			e.printStackTrace();
		}
	}
}
