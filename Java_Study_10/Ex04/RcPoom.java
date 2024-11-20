package Java_Study_10.Ex04;

public class RcPoom {
    public static void main(String[] args) {
        
        // 1. 컴퓨터를 1대 준비
        // Computer 클래스의 인스턴스를 생성하여 컴퓨터 객체를 준비합니다.
        Computer com = new Computer();
        
        // 2. User1과 User2를 불러 컴퓨터를 사용하라고 한다.
        // 하나의 Computer 객체를 두 개의 쓰레드가 함께 사용하는 경우이므로,
        // 동기화가 되어 있지 않으면 데이터 간섭이 발생할 수 있습니다.
        
        // User1 쓰레드를 생성하고, 컴퓨터 객체를 전달합니다.
        User1 user1 = new User1(com);
        user1.start(); // User1 쓰레드 시작
        
        // User2 쓰레드를 생성하고, 같은 컴퓨터 객체를 전달합니다.
        User2 user2 = new User2(com);
        user2.start(); // User2 쓰레드 시작

    }
}
