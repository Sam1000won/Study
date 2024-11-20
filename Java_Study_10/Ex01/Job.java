package Java_Study_10.Ex01;

public class Job implements Runnable {
    @Override
	public void run() { // Work Thread가 해야할 일
		for (int i = 1; i <= 5; i++) {
			System.out.println("워크 쓰레드가 하는 일");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
