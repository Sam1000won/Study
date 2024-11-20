package Java_Study_10.Ex02;

public class AnnonyMain {

    public static void main(String[] args) throws InterruptedException {
        
        // 1. 해야할 일 생성 (상속받는 익명객체 만들기 : 자동완성이 안된다.)
        // Thread 클래스를 상속받은 익명 클래스를 생성하여 run() 메서드를 오버라이드합니다.
        Thread thread = new Thread() {
            @Override
            public void run() {
                // 0부터 5까지 반복
                for (int i = 0; i <= 5; i++) {
                    // 워크 쓰레드가 실행 중임을 출력
                    System.out.println("work thread run...");
                    try {
                        // 500ms(0.5초) 대기
                        Thread.sleep(500);
                    } catch (Exception e) {
                        // 예외 발생 시 스택 트레이스를 출력
                        e.printStackTrace();
                    }
                }
            }
        };

        // 2. 워크쓰레드 생성
        // 위에서 생성한 익명 클래스를 통해 쓰레드를 생성하였으므로,
        // 별도로 쓰레드를 생성할 필요가 없습니다.
        
        // 3. 워크쓰레드 실행
        // 생성된 쓰레드를 시작합니다. 이 쓰레드는 run() 메서드를 실행합니다.
        thread.start();
        
        /* main thread */
        // 메인 쓰레드에서 1부터 5까지 반복
        for (int i = 1; i <= 5; i++) {
            // 메인 쓰레드가 실행 중임을 출력
            System.out.println("main thread run...");
            // 500ms(0.5초) 대기
            Thread.sleep(500); // 쓰레드에게 0.5초 쉬라는 의미
        }
    }
}
