package Java_Study_10.Ex01;

public class Main {
    public static void main(String[] args) throws InterruptedException { // main Thread를 생성하는 메서드			
		
		/*work thread 생성*/
		// 1. 해야할 일을 가져온다.
		Job job = new Job();
		// 2. 워크 쓰레드 생성
		Thread work = new Thread(job);
		// 3. 워크 쓰레드 실행		
		work.start();
		
		/*main thread*/
		for (int i = 1; i <= 5; i++) {
			System.out.println("메인 쓰레드가 돌아가고 있었다.");
			Thread.sleep(500); // 쓰레드에게 0.5초 쉬라는 의미
		}

	}
}
