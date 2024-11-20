package Java_Study_10.Ex05;

public class WorkThread extends Thread {

    @Override
    public void run() {
        long cnt = 0; // 카운트를 위한 변수 초기화

        // 첫 번째 실행 블록
        for (int i = 1; i < 100000000; i++) {
            cnt++; // 1부터 1억까지 카운트
        } // (스레드 STATUS : RUNNABLE)

        try {
            // 1.5초 동안 정지 (스레드 STATUS : TIMED WAITING)
            Thread.sleep(1500); 
        } catch (InterruptedException e) {
            // 스레드가 인터럽트되었을 때 예외 처리
            e.printStackTrace();
        }

        cnt = 0; // 카운트 변수를 초기화

        // 두 번째 실행 블록
        for (int i = 1; i < 100000000; i++) {
            cnt++; // 다시 1부터 1억까지 카운트
        } // (스레드 STATUS : RUNNABLE)
          // 실행하고 나서 STATUS : RUNNABLE이 바로 찍힌다.
    } // (스레드 STATUS : TERMINATED)
}
