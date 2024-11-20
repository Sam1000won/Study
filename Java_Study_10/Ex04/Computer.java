package Java_Study_10.Ex04;

public class Computer {
    
    private int score = 0; // 점수를 저장할 변수

    /* 비동기 방식
    public void setScore(int score) {
        this.score = score;  // 점수를 설정하고 => 2초 대기 => 점수 확인
                             // 다른 쓰레드가 값을 변경할 경우 데이터 간섭이 발생할 수 있음
        try {
            Thread.sleep(2000); // 2초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(Thread.currentThread().getName() + " : " + this.score);
    }
    */
    
    /* 동기화 메서드 방식: 메서드에 synchronized가 붙으면 한 번에 하나의 쓰레드만 접근 가능
    public synchronized void setScore(int score) {
        this.score = score;  // 점수를 설정
        
        try {
            Thread.sleep(2000); // 2초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(Thread.currentThread().getName() + " : " + this.score);
    }
    */
    
    // 동기화 블록 방식: 메서드 안에 여러 쓰레드가 들어갈 수 있지만, 특정 영역에서는 혼자만 들어갈 수 있음
    public void setScore(int score) {
        
        synchronized (this) { // 현재 객체(Computer)에 대해 동기화
                              // 여러 쓰레드가 Computer 클래스의 동일한 객체를 사용할 경우 동기화를 통해 안전성을 확보
                              // 모든 객체에 대해 동기화를 하고 싶다면 .class를 사용해야 함
                              // 1. 일반 메서드의 동기화는 이 메서드를 가진 객체를 기준으로 이루어진다.
                              // 2. static 메서드의 동기화는 이 메서드를 가진 클래스의 클래스 객체를 기준으로 이루어진다.
            this.score = score;  // 점수를 설정
            
            try {
                Thread.sleep(2000); // 2초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println(Thread.currentThread().getName() + " : " + this.score);            
        }                    
    }
}
