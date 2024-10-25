package Java_Study_07.Ex04;

// 예약 관련 예외를 정의하는 클래스
public class ReservedException extends RuntimeException {
    // 생성자: 메시지를 받아서 부모 클래스인 RuntimeException에 전달
    public ReservedException(String message) {
        super(message); // 부모 클래스의 생성자 호출
    }    
}
