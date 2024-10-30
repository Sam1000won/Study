package Java_Study_10.Ex09;

public class StopFlag extends Thread {

    private boolean stop = false; // 스레드 종료 플래그

    // 캡슐화를 통해 외부 사용자가 stop에 대해 수정만 가능하도록 제한
    public void setStop(boolean stop) {
        this.stop = stop; // stop 변수의 값을 외부에서 설정
    }

    @Override
    public void run() {
        // stop이 false인 동안 실행
        while (!stop) {
            System.out.println("stopFlag 실행 중..."); // 스레드가 실행 중임을 출력
        }
        
        // 스레드가 종료될 때 실행되는 부분
        System.out.println("자원 정리"); // 자원 정리 작업 수행
        System.out.println("종료"); // 종료 메시지 출력
    }
}
