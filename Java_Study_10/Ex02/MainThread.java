package Java_Study_10.Ex02;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {
        
        // 1. 해야할 일 생성
        // Job 클래스의 인스턴스를 생성하여 새로운 쓰레드를 준비합니다.
        Thread thread = new Job();
        
        // 2. 워크쓰레드 생성
        // Job 클래스는 Thread를 상속받고 있으므로, 별도로 쓰레드를 생성할 필요가 없습니다.
        
        // 3. 워크쓰레드 실행
        // 생성된 쓰레드를 시작합니다. 이때 Job 클래스의 run() 메서드가 실행됩니다.
        thread.start();
        
        // 메인 쓰레드에서 0부터 5까지 반복
        for (int i = 0; i <= 5; i++) {
            // 메인 쓰레드가 실행 중임을 출력
            System.out.println("main thread run...");
            // 500ms(0.5초) 대기
            Thread.sleep(500); // 쓰레드에게 0.5초 쉬라는 의미
        }

    }

}