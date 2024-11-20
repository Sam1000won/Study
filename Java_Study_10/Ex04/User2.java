package Java_Study_10.Ex04;

public class User2 extends Thread {
    
    private Computer com; // 컴퓨터 객체를 저장할 변수
    
    // 생성자: Computer 객체를 받아서 초기화
    public User2(Computer com) {
        setName("user 2"); // 쓰레드의 이름을 "user 2"로 설정
        this.com = com; // 전달받은 Computer 객체를 인스턴스 변수에 저장
    }
    
    @Override
    public void run() {
        // user2은 받아온 컴퓨터를 가지고 게임해서 100점을 만들어 놓는다.
        // setScore 메서드를 호출하여 점수 100을 설정
        com.setScore(100);
    }
}
