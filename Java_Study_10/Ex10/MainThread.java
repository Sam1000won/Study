package Java_Study_10.Ex10;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {
        
        // 워크 스레드는 메인 스레드 종료 여부와 상관없이 본인의 일을 계속한다.
        Thread demon = new DemonThread(); // DemonThread 인스턴스 생성
        demon.setDaemon(true); // setDaemon을 통해 워크 스레드 -> 데몬 스레드로 변경
                                // 데몬 스레드는 메인 스레드 종료와 함께 종료된다. (Life Cycle이 동일하다)
        demon.start(); // 데몬 스레드 시작
        
        Thread.sleep(3000); // 메인 스레드를 3초 동안 일시 정지
        
        System.out.println("메인 스레드 종료"); // 메인 스레드 종료 메시지 출력
    }

}
