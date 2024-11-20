package Java_Study_10.Ex08;

public class WorkObj {
	
	public synchronized void work() {
		
		// 1. 아래 내용 실행
		System.out.println(Thread.currentThread().getName() + " 이 실행됨.");
		// 2. 자고있는 쓰레드를 깨우고
		notify();
		
		try {
			wait(); // 3. 본인은 쉰다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}	
}