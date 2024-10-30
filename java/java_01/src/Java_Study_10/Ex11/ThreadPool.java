package Java_Study_10.Ex11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    	public static void main(String[] args) {
		/*Thread Pool 생성방법*/
		// 병렬처리(concurrent)를 위해 ExecutorService를 사용한다.
		// 처음엔 스케이트를 가지고 있지않다.
		// 손님이 오면 그때 그때 만들어 빌려줌.
		// 이후 반납받은 스케이트로 장사를 한다.
		// 60초동안 사용되지 않은 스케이트가 있으면 버린다. **
		ExecutorService pool1 = Executors.newCachedThreadPool();
		
		// 초반에 n개의 스케이트를 가지고 운영한다.
		// 없으면 만들고 반납받은게 있으면 빌려준다.
		// 60초가 지나면 버리는데, n개는 유지한다.
		// n개는 일반적으로 내PC의 가용 메인 스레드 수를 기반으로 한다.
		int n = Runtime.getRuntime().availableProcessors(); // 가용 스레드 수를 구한다.
		System.out.println(n + "개 main thread");		
		ExecutorService pool2 = Executors.newFixedThreadPool(n); // 내 pc의 가용 메인스레드 수를 가지고 운영.
			
		
	}

}
