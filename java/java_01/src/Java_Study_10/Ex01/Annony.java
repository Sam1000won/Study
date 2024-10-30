package Java_Study_10.Ex01;

public class Annony {
    public static void main(String[] args) throws InterruptedException {
        
        // 1. 해야할 일 생성
        // Runnable 인터페이스를 구현하여 작업을 정의합니다.
        Runnable run = new Runnable() {
            @Override
            public void run() {
                // 0부터 5까지 반복
                for (int i = 0; i <= 5; i++) {
                    // 워크 쓰레드가 실행 중임을 출력
                    System.out.println("워크 쓰레드가 돌고 있다.");
                    
                    try {
                        // 500ms(0.5초) 대기
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        // 쓰레드가 인터럽트되었을 때 예외 처리
                        e.printStackTrace();
                    }
                }
            }
        };
        
        // 2. 워크쓰레드 생성
        // Runnable 객체를 인자로 받아 새로운 쓰레드를 생성합니다.
        Thread work = new Thread(run);
        
        // 3. 쓰레드 실행
        // 생성된 쓰레드를 시작합니다. 이 쓰레드는 run() 메서드를 실행합니다.
        work.start();
        
        /* main thread */
        // 메인 쓰레드에서 1부터 5까지 반복
        for (int i = 1; i <= 5; i++) {
            // 메인 쓰레드가 실행 중임을 출력
            System.out.println("메인 쓰레드가 돌아가고 있었다.");
            // 500ms(0.5초) 대기
            Thread.sleep(500); // 쓰레드에게 0.5초 쉬라는 의미
        }
    }
}
