package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInOutStreamTest {

	public static void main(String[] args) {

		// Member 객체를 역직렬화해서 파일에 쓰기
		// 인코딩(encoding - 코드화하다 = 2진수)
		// 디코딩(decoding - 코드를 해제 = 문자화)
		// 역직렬화 = 저장된 내용이나 전송받은 내용을 다시 복원하는 것
		try(OutputStream os = new FileOutputStream("Object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(os)){
			
			Member m1 = new Member("Lee13", "이순신");
			
			// 파일에 쓰기
			oos.writeObject(m1);
			
			oos.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// 객체를 역직렬화해서 파일에서 읽기
		try(InputStream is = new FileInputStream("Object.dat");
			ObjectInputStream ois = new ObjectInputStream(is)){
			
			// 파일을 읽어서 객체로 복원 
			Member m2 = (Member)ois.readObject();
			System.out.println(m2);
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}