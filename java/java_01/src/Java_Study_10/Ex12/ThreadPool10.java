package Java_Study_10.Ex12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool10 {
    public static void main(String[] args) throws InterruptedException {
        // 1. Thread Pool을 생성한다.
        int n = Runtime.getRuntime().availableProcessors(); // 사용 가능한 프로세서 수를 가져옴
        ExecutorService pool = Executors.newFixedThreadPool(n); // 고정된 수의 스레드를 가진 스레드 풀 생성
        
        // 2. 수행할 작업을 만든다.
        Runnable runn = new Runnable() {
            @Override
            public void run() {                
                // 현재 스레드의 이름과 함께 실행 중임을 출력
                System.out.println(Thread.currentThread().getName() + " : pool 실행");                
            }
        };
        
        // 3. 작업을 요청한다.
        for (int i = 0; i < 10; i++) {
            pool.execute(runn); // 스레드 풀에 작업을 요청하여 실행
        }		
        
        // 4. pool을 종료한다.
        pool.shutdown(); // 스레드 풀의 작업을 더 이상 받지 않도록 종료
        boolean end = pool.awaitTermination(2L, TimeUnit.SECONDS); // 최대 2초 동안 종료를 기다림
        
        // 종료 여부 출력
        System.out.println("정상적으로 종료되었는가? " + end);
    }

}
