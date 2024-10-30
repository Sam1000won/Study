package Java_Study_10.Ex13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // 1. 대여소 세우기 (스레드 풀 생성)
        int n = Runtime.getRuntime().availableProcessors(); // 사용 가능한 프로세서 수 가져오기
        ExecutorService pool = Executors.newFixedThreadPool(n); // 고정된 수의 스레드를 가진 스레드 풀 생성
        
        // 2. Callable로 작업 요청서 만들기 (1~100까지 더한 합을 반환하는 작업)				
        Callable<Integer> call = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0; // 합계를 저장할 변수
                for (int i = 1; i <= 100; i++) {
                    sum += i; // 1부터 100까지 더하기
                }
                System.out.println(sum); // 합계 출력
                return sum; // 계산된 합계 반환
            }
        };
        
        // 3. 작업 요청하기 (대여)
        // call의 작업을 완료하고 submit에 반환받아야 다음이 수행된다
        Future<Integer> f = pool.submit(call); // 작업을 스레드 풀에 제출하고 Future 객체를 반환받음
        System.out.println("1~100까지의 합은 : " + f.get()); // 작업 결과를 출력 (blocking)
		
        // 4. 스레드 풀 종료
        pool.shutdown(); // 스레드 풀의 작업 수락을 중지하고, 현재 실행 중인 작업이 완료될 때까지 대기
    }
}
