package Java_Study_10.Ex09;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        // StopFlag 스레드 인스턴스 생성
        StopFlag flag = new StopFlag();
        
        // StopFlag 스레드 시작
        flag.start();
        Thread.sleep(500); // 0.5초 대기
        flag.setStop(true); // stop 플래그를 true로 변경하여 스레드 종료 요청
        
        // Inter 스레드 인스턴스 생성
        Inter inter = new Inter();
        inter.start(); // Inter 스레드 시작
        Thread.sleep(500); // 0.5초 대기
        inter.interrupt();  // Inter 스레드에 강제로 인터럽트를 발생시킴
        
    }

}
