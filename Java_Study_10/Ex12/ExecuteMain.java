package Java_Study_10.Ex12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuteMain {
    public static void main(String[] args) throws InterruptedException {
		
		// 1. 스레드 풀 생성(대여소 만들기)
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		// 2. 대여 양식 작성 : 실행 후 반환값이 없을 경우
		// Runnable 인터페이스를 구현하기.
		Runnable runn = new Runnable() {			
			@Override
			public void run() {
				System.out.println("Runnable 처리!");
				
			}
		};
		
		// 3. 양식제출(대여)
		// execute()는 반환이 없으므로 Runnable 실행에 사용.
		pool.execute(runn);
		
		// Runnable은 Submit도 사용가능하다. (이 이유는 뒤에서 나온다.)
		
		// 4. 대여소 종료
		pool.shutdown(); // 스레드 들이 다 나올 때까지 무조건 기다린다.
		boolean end = pool.awaitTermination(1L, TimeUnit.SECONDS);
		// 멕시멈으로 기다리는 시간을 주고, true가 떨어지면 스레드들이 전부 나왔다는 뜻.
		System.out.println("진상들이 없었나? " + end);
	}
}
