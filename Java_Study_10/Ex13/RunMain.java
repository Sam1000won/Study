package Java_Study_10.Ex13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        // 1. 사용 가능한 프로세서 수를 가져와서 스레드 풀을 생성
        int n = Runtime.getRuntime().availableProcessors(); // 현재 시스템의 프로세서 수 가져오기
        ExecutorService pool = Executors.newFixedThreadPool(n); // 고정된 스레드 수를 가진 스레드 풀 생성
        
        // 2. 수행할 작업을 Runnable로 정의
        Runnable run = new Runnable() {
            @Override
            public void run() {
                try {
                    // 1부터 10까지의 작업을 처리
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("작업 처리중 : " + i); // 작업 진행 상황 출력
                        Thread.sleep(500); // 500ms 대기
                    }                    
                } catch (Exception e) {
                    System.out.println("예외 발생으로 빠져나옴"); // 예외 발생 시 메시지 출력
                }
            }
        };        
        
        // 3. 작업을 스레드 풀에 제출하고 Future 객체를 받음
        // Future<?>는 실행 결과를 받을 수 있는 인터페이스
        Future<?> f = pool.submit(run); // run 작업을 스레드 풀에 제출
        
        f.get(); // 작업이 완료될 때까지 대기 (blocking)
        
        /*
         * Runnable로 구현한 내용도 blocking을 하고 싶을 수 있어서
         * execute()뿐만 아니라 submit()도 사용할 수 있게 해준 것.
         */
        
        System.out.println("=====작업 종료====="); // 작업 종료 메시지 출력
        pool.shutdown(); // 스레드 풀 종료
    }
}
