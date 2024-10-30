package Java_Study_10.Ex07;

public class OperThread extends Thread {
    
    private int sum; // 합계를 저장할 변수

    // 캡슐화를 통해 외부에서 sum에 대한 값을 건드리지 못하게 하고
    // 오직 볼 수 있는 메소드만 열어주었다.
    public int getSum() {
        return sum; // sum 값을 반환하는 메서드
    }
    
    @Override
    public void run() {
        // 1부터 100까지의 합을 계산
        for (int i = 1; i <= 100; i++) {
            sum += i; // sum에 i를 더함
        }
    }
}
