package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) {
		
		try {
			// 출력 스트림 객체 생성(생성자 - 파일 객체)
			OutputStream os = new FileOutputStream("C:/File/test1.db");
		 
			// 데이터 변수 선언
			byte a = 10;
			byte b = 20;
			byte c = 30;
			char d = '가';   // 인식 불가
			int e = 100;    // 아스키코드값으로 입력 -> 문자로 출력하면 d 가 된다
		
			// db 파일에 데이터 쓰기
			os.write(a);
			os.write(b);
			os.write(c);
			os.write(d);
			os.write(e);
			
			os.flush();   // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
			os.close();   // 출력 스트림을 닫아서 사용한 메모리를 해제
			
		}catch (FileNotFoundException e) {   // 파일 존재에 대한 에러
			e.printStackTrace();
		} catch (IOException e) {   // 데이터 통신에 대한 에러
			e.printStackTrace();
		}
	}
}
