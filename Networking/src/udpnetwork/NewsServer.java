package udpnetwork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer {

	// 필드
	private static DatagramSocket datagramSocket;

	public static void main(String[] args) {

		System.out.println("==========================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요");
		System.out.println("==========================================");

		// TCP 서버 시작
		startServer();

		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q"))
				break;
		}

		scanner.close();

		// TCP서버 종료 
		stopServer();

	}
	public static void startServer() {
		// 작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					datagramSocket = new DatagramSocket(8100);
					System.out.println("[서버] 시작됨");

					while(true) {
						// 데이터 받기(수신) -클라이언트가 보낸 뉴스 주제 받기
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);

						datagramSocket.receive(receivePacket);

						// 받은 주제(bytes[])를 문자열로 복권
						String newsKind = new String(
								receivePacket.getData(), 0, receivePacket.getLength(), 
								"utf-8");

						// 주제 관련 뉴스 10개를 클라이언트로 전송
						// 클라이언트의 IP와 port를 가져옴 
						SocketAddress socketAddress = receivePacket.getSocketAddress();
						for(int i = 1; i <= 10; i++) {
							String data = newsKind + ": 뉴스" + i;
							byte[] bytes = data.getBytes("utf-8");
							DatagramPacket sendPacket = new DatagramPacket(
									bytes, 0, bytes.length, socketAddress);
							datagramSocket.send(sendPacket);
							//1초 간격으로 보내기
							Thread.sleep(1000);
						}
					} // while 끝
				} catch (IOException e) {
					System.out.println("[서버] " + e.getMessage());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		thread.start();
	}
	public static void stopServer() {
		datagramSocket.close();
		System.out.println("[서버] 종료됨");
	}
}


