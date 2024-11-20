package Java_Study_10.Ex03;

public class WorkThread extends Thread {

    // run() 메서드는 쓰레드가 실행할 작업을 정의합니다.
    @Override
    public void run() {
        // 0부터 5까지 반복
        for (int i = 0; i <= 5; i++) {            
            // 현재 쓰레드의 이름을 출력하고, "thread가 출력한 내용." 메시지를 함께 출력
            System.out.println(getName() + " thread가 출력한 내용.");
            // 원래는 Thread.getName()을 사용해야 하지만, 
            // WorkThread 클래스가 Thread를 상속받았기 때문에 getName()을 바로 사용할 수 있습니다.
        }
    }
}
