package Java_Study_10.Ex02;

public class Job extends Thread {

    // run() 메서드는 쓰레드가 실행할 작업을 정의합니다.
    @Override
    public void run() {
        // 0부터 5까지 반복
        for (int i = 0; i <= 5; i++) {
            // 워크 쓰레드가 실행 중임을 출력
            System.out.println("work thread run...");
            try {
                // 500ms(0.5초) 대기
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // 쓰레드가 인터럽트되었을 때 예외 처리
                e.printStackTrace();
            }
        } 
        // super.run() 호출: 부모 클래스의 run() 메서드를 호출합니다.
        // 그러나, Thread 클래스의 run() 메서드는 기본적으로 아무 작업도 하지 않으므로,
        // 이 호출은 실제로 필요하지 않습니다.
        super.run();
    }
}