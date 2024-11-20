package Java_Study_10.Ex05;

public class Main {
    private static Thread.State state; // 스레드 상태를 저장할 변수
    
    public static void main(String[] args) {
        
        // WorkThread 인스턴스를 생성
        Thread work = new WorkThread();
        
        // 초기 스레드 상태 가져오기
        state = work.getState();
        System.out.println("STATE : " + state); // 초기 상태 출력 (NEW 상태일 것임)
        
        // work 스레드 시작
        work.start(); 

        // 스레드 상태 감시
        while (true) {
            state = work.getState(); // 현재 스레드 상태 가져오기
            System.out.println("STATE : " + state); // 현재 상태 출력
            
            // 스레드가 TERMINATED 상태가 되면 루프 종료
            if (state == Thread.State.TERMINATED) {
                break;
            }
        }
        
    }
}
