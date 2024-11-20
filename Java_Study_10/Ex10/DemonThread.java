package Java_Study_10.Ex10;

public class DemonThread extends Thread {

    @Override
    public void run() {
        
        try {
            // 무한 루프를 통해 계속 실행
            while (true) {
                // 500ms 동안 대기
                Thread.sleep(500);
                // 작업 수행 중임을 출력
                System.out.println("work 스레드 실행 중");
            }
        } catch (InterruptedException e) {
            // 스레드가 인터럽트되었을 때 예외 처리
            e.printStackTrace();
        }
        
    }
}
