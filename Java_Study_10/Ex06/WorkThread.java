package Java_Study_10.Ex06;

public class WorkThread extends Thread {

    boolean stop = false; // 스레드 종료 여부를 나타내는 변수
    boolean yield = false; // 양보 여부를 나타내는 변수

    @Override
    public void run() {
        // 스레드가 동작하는 동안 반복
        while (!stop) {
            // 현재 스레드 이름과 동작 중임을 출력
            System.out.println(getName() + " 동작");

            // 양보 상태가 true이면 양보 처리
            if (yield) {
                System.out.println(getName() + "가 양보");
                Thread.yield(); // 현재 스레드의 실행을 양보
            }

            try {
                // 100ms 대기
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // InterruptedException 발생 시 스택 트레이스 출력
                e.printStackTrace();
            }
        }

        // 스레드가 종료되면 정지 메시지 출력
        System.out.println(getName() + " 정지");
    }
}
