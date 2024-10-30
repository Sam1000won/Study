package Java_Study_10.Ex08;

public class WorkThread extends Thread {

    private WorkObj obj; // WorkObj 타입의 객체를 저장할 변수

    // 생성자: WorkObj 객체를 받아서 초기화
    public WorkThread(WorkObj obj) {
        this.obj = obj; // 전달받은 WorkObj 객체를 인스턴스 변수에 저장
    }
    
    @Override
    public void run() {
        // 0부터 5까지 반복하여 work 메서드 호출
        for (int i = 0; i <= 5; i++) {
            obj.work(); // WorkObj의 work 메서드를 호출
        }
    }
}
