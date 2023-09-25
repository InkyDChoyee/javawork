package threads.beepprint;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		
		// BeepTask beepTask = new BeepTask();
		// 부모형으로 beepTask 객체 생성(작업 스레드)
		Runnable beepTask = new BeepTask();
		// 작업 스레드 객체 생성
		Thread thread = new Thread(beepTask);
		thread.start();     // 스레드 시작(실행)
		
		for(int i =1; i<=5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);    // 1000 = 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
}
