package Java_Study_10.Ex06;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /* 양보를 통해 실행 순서가 변경되기도 하지만,
         * 그 기회를 상대 스레드가 잡지 못하면 자신이 실행하게 된다.
         */
        
        // 첫 번째 워크 스레드 생성 및 시작
        WorkThread th = new WorkThread();
        th.setName("thread A"); // 스레드 이름 설정
        th.start(); // 스레드 시작
        
        // 두 번째 워크 스레드 생성 및 시작
        WorkThread th2 = new WorkThread();
        th2.setName("thread B"); // 스레드 이름 설정
        th2.start(); // 스레드 시작
        
        // 스레드 A에게 양보
        th.yield = true; // A에게 양보하라고 설정
        Thread.sleep(500); // 0.5초 대기
        
        // 스레드 B에게 양보
        th2.yield = true; // B에게 양보하라고 설정
        th.yield = false; // A의 양보를 해제
        Thread.sleep(500); // 0.5초 대기
        
        // 두 스레드 종료 신호 전송
        th.stop = true; // 스레드 A 종료 요청
        th2.stop = true; // 스레드 B 종료 요청
    }
}
