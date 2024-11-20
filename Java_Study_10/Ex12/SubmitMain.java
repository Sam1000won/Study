package Java_Study_10.Ex12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SubmitMain {
    	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// 1. 스레드 풀 생성
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		// 2. 대여신청서 작성 : 실행 후 반환값이 있을 경우 
		// Callable 인터페이스를 구현한다.
		Callable<String> call = new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				System.out.println("Callable 처리");
				return "완료";
			}			
		};
		
		// 3. 양식제출(대여)
		// submit()는 반환이 있으므로 Callable 실행에 사용.
		Future<String> f = pool.submit(call);
		String result = f.get();
		System.out.println("반환받은 값 : " + result);

		// 4. 대여소 종료
		pool.shutdown();
		boolean end = pool.awaitTermination(1L, TimeUnit.SECONDS);
		System.out.println("진상들이 없었나? " + end);
		
	}
}
