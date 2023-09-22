package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {

	public static void main(String[] args) {
		// Queue 를 구현할 LinkesList를 자료구조로 사용
		Queue<Message> msgQueue = new LinkedList<>();

		//message 객체 생성
		Message email = new Message("email", "이순신");
		Message sms = new Message("sms", "김시민");
		Message kakaotalk = new Message("kakaotalk", "유성룡");

		// 객체 저장 - offer()
		msgQueue.offer(email);
		msgQueue.offer(sms);
		msgQueue.offer(kakaotalk);

		// 객체 꺼내기 - 삭제 poll()
		// 반복 - 확인(isEmpty())
		while(!msgQueue.isEmpty()) {
			Message message = msgQueue.poll();   // 1개 꺼냄
			switch(message.command) {
			case "email":
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sms":
				System.out.println(message.to + "님에게 문자를 보냅니다");
				break;
			case "kakaotalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다");
				break;
			}
		}


	}

}
